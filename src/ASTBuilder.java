import ast.*;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

// TO DO:
// Verify ASTBuilder *: Let, Case, Branch
// Consider Error Handling
// Ben. 

public class ASTBuilder extends CoolParserBaseVisitor<Tree> {

  @Override
  public Tree visitProgram(CoolParser.ProgramContext ctx) {

    ProgramNode rootNode = new ProgramNode(ctx.getStart().getLine());
    for (CoolParser.CoolClassContext c : ctx.coolClass()) {
      rootNode.add((ClassNode) visitCoolClass(c));
    }
    return rootNode;
  }

  @Override
  public Tree visitCoolClass(CoolParser.CoolClassContext ctx) {
    String superType = (ctx.INHERITS() == null) ? "Object" : ctx.TYPEID(1).getSymbol().getText();

    Symbol name = StringTable.idtable.addString(ctx.TYPEID(0).getSymbol().getText());
    Symbol parent = StringTable.idtable.addString(superType);
    Symbol filename = StringTable.idtable.addString(Flags.in_filename);

    ClassNode classNode = new ClassNode(ctx.CLASS().getSymbol().getLine(), name, parent, filename);
    for (CoolParser.FeatureContext c : ctx.feature()) {
      classNode.add((FeatureNode) visit(c));
    }
    return classNode;
  }

  @Override
  // Splits into MethodNode, AttributeNode
  public Tree visitFeature(CoolParser.FeatureContext ctx) {
    if (ctx.PARENT_OPEN() == null) { // isAttribute
      return visitAttributeNode(ctx);
    }
    return visitMethodNode(ctx); // isMethod
  }

  public Tree visitMethodNode(CoolParser.FeatureContext ctx) {

    List<FormalNode> formalNodes = new ArrayList<>();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol returnType = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    // maybe adding formals before methodNode instantiates means formal visits have
    // precedence over expr vists

    for (CoolParser.FormalContext c : ctx.formal()) {
      formalNodes.add((FormalNode) visit(c));
    }

    MethodNode methodNode = new MethodNode(ctx.OBJECTID().getSymbol().getLine(), name, formalNodes, returnType,
        (ExpressionNode) visit(ctx.expr()));

    return methodNode;
  }

  public Tree visitAttributeNode(CoolParser.FeatureContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    ExpressionNode expr = (ctx.ASSIGN_OPERATOR() == null) ? new NoExpressionNode(0)
        : (ExpressionNode) visit(ctx.expr());

    return new AttributeNode(ctx.OBJECTID().getSymbol().getLine(), name, type, expr);
  }

  @Override
  public Tree visitFormal(CoolParser.FormalContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    return new FormalNode(ctx.OBJECTID().getSymbol().getLine(), name, type);
  }

  @Override
  public Tree visitExpr(CoolParser.ExprContext ctx) {

    // Deals with CondNode
    if (ctx.IF() != null) {
      return visitCondNode(ctx);
    }

    // Deals with LetNode
    if (ctx.LET() != null) {
      return visitLetNode(ctx);
    }

    // Deals with CaseNode
    if (ctx.CASE() != null) {
      return visitCaseNode(ctx);
    }

    // Dealing with AssignNode, StaticDispatchNode, DispatchNode
    if (ctx.OBJECTID() != null) {
      // AssignNode
      if (ctx.ASSIGN_OPERATOR() != null) {
        return visitAssignNode(ctx);
      }
      // StaticDispatchNode
      else if (ctx.AT() != null) {
        return visitStaticDispatchNode(ctx);
      }
      // DispatchNode
      else if (ctx.PARENT_OPEN() != null) {
        // check for DispatchNodeAlt i.e <expr>.dispatch()
        if (ctx.PERIOD() != null) {
          return visitDispatchNodeAlt(ctx);
        }
        return visitDispatchNode(ctx);
      }
    }

    // Dealing with terminal expressions
    if (ctx.expr().size() == 0) {

      // ObjectNode
      if (ctx.OBJECTID() != null) {
        return visitObjectNode(ctx);
      }
      // IntConstNode
      else if (ctx.INT_CONST() != null) {
        return visitIntConstNode(ctx);
      }
      // StringConstNode
      else if (ctx.STRING_CONST() != null) {
        return visitStringConstNode(ctx);
      }
      // BoolConstNode
      else if (ctx.TRUE() != null || ctx.FALSE() != null) {
        return visitBoolConstNode(ctx);
      }
    }

    // Dealing with BlockNode, IsVoidNode, NegNode, CompNode, ( expr ),
    if (ctx.expr().size() == 1 || ctx.expr() != null) {
      // BlockNode
      if (ctx.CURLY_OPEN() != null) {
        return visitBlockNode(ctx);
      }
      // IsVoidNode
      else if (ctx.ISVOID() != null) {
        return visitISVoidNode(ctx);
      }
      // NegNode
      else if (ctx.INT_COMPLEMENT_OPERATOR() != null) {
        return visitNegNode(ctx);
      }
      // CompNode
      else if (ctx.NOT() != null) {
        return visitCompNode(ctx);
      }

    }

    // Dealing with LoopNode, PlusNode, SubNode, MulNode, DivideNode, LTNode,
    // LEqNode, EqNode,
    if (ctx.expr().size() == 2) {
      // LoopNode
      if (ctx.WHILE() != null) {
        return visitLoopNode(ctx);
      }
      // PlusNode
      else if (ctx.PLUS_OPERATOR() != null) {
        return visitPlusNode(ctx);
      }
      // SubNode
      else if (ctx.MINUS_OPERATOR() != null) {
        return visitSubNode(ctx);
      }
      // MulNode
      else if (ctx.MULT_OPERATOR() != null) {
        return visitMulNode(ctx);
      }
      // DivideNode
      else if (ctx.DIV_OPERATOR() != null) {
        return visitDivideNode(ctx);
      }
      // LTNode
      else if (ctx.LESS_OPERATOR() != null) {
        return visitLTNode(ctx);
      }
      // LEqNode
      else if (ctx.LESS_EQ_OPERATOR() != null) {
        return visitLEqNode(ctx);
      }
      // EqNode
      else if (ctx.EQ_OPERATOR() != null) {
        return visitEqNode(ctx);
      }
    }

    // Deals with (expr)
    if (ctx.OBJECTID() == null && ctx.PARENT_OPEN() != null) {
      return visitExpr(ctx.expr(0));
    }

    // default case to satisfy java
    return visitNewNode(ctx);
  }

  public Tree visitObjectNode(CoolParser.ExprContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    return new ObjectNode(ctx.OBJECTID().getSymbol().getLine(), name);
  }

  public Tree visitIntConstNode(CoolParser.ExprContext ctx) {
    Symbol value = StringTable.inttable.addString(ctx.INT_CONST().getSymbol().getText());
    return new IntConstNode(ctx.INT_CONST().getSymbol().getLine(), value);
  }

  public Tree visitStringConstNode(CoolParser.ExprContext ctx) {
    Symbol value = StringTable.stringtable.addString(ctx.STRING_CONST().getSymbol().getText());
    return new StringConstNode(ctx.STRING_CONST().getSymbol().getLine(), value);
  }

  public Tree visitBoolConstNode(CoolParser.ExprContext ctx) {
    Boolean value;
    int lineNumber;
    if (ctx.TRUE() != null) {
      value = true;
      lineNumber = ctx.TRUE().getSymbol().getLine();
    } else {
      value = false;
      lineNumber = ctx.FALSE().getSymbol().getLine();
    }

    return new BoolConstNode(lineNumber, value);
  }

  public Tree visitNewNode(CoolParser.ExprContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.TYPEID().getText());
    return new NewNode(ctx.NEW().getSymbol().getLine(), name);
  }

  public Tree visitBlockNode(CoolParser.ExprContext ctx) {
    List<ExpressionNode> exprNodeList = new ArrayList<>();

    for (int i = 0; i < ctx.expr().size(); i++) {
      exprNodeList.add((ExpressionNode) visit(ctx.expr(i)));
    }

    return new BlockNode(ctx.CURLY_OPEN().getSymbol().getLine(), exprNodeList);
  }

  public Tree visitISVoidNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.ISVOID().getSymbol().getLine();
    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));
    return new IsVoidNode(lineNumber, exprNode);
  }

  public Tree visitNegNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.INT_COMPLEMENT_OPERATOR().getSymbol().getLine();
    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));
    return new NegNode(lineNumber, exprNode);
  }

  public Tree visitCompNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.NOT().getSymbol().getLine();
    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));
    return new CompNode(lineNumber, exprNode);
  }

  public Tree visitAssignNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.OBJECTID().getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());

    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));

    return new AssignNode(lineNumber, name, exprNode);
  }

  public Tree visitStaticDispatchNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.ASSIGN_OPERATOR().getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));
    List<ExpressionNode> actuals = new ArrayList<>();

    // check if no parameters
    if (ctx.expr().size() > 1) {
      for (int i = 1; i < ctx.expr().size(); i++) {
        actuals.add((ExpressionNode) visit(ctx.expr(i)));
      }
    }

    return new StaticDispatchNode(lineNumber, exprNode, type, name, actuals);
  }

  // handles DispatchNodeAlt syntax
  public Tree visitDispatchNodeAlt(CoolParser.ExprContext ctx) {

    int lineNumber = ctx.OBJECTID().getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));
    List<ExpressionNode> actuals = new ArrayList<>();

    // Check for no parameters in method
    if (ctx.expr().size() > 1) {
      for (int i = 1; i < ctx.expr().size(); i++) {
        actuals.add((ExpressionNode) visit(ctx.expr(i)));
      }
    }

    return new DispatchNode(lineNumber, exprNode, name, actuals);

  }

  // handles only DispatchNode syntax
  public Tree visitDispatchNode(CoolParser.ExprContext ctx) {

    int lineNumber = ctx.OBJECTID().getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    ExpressionNode exprNode = new NoExpressionNode(0);
    List<ExpressionNode> actuals = new ArrayList<>();

    // Check for no parameters in method
    if (ctx.expr().size() != 0) {
      for (int i = 0; i < ctx.expr().size(); i++) {
        actuals.add((ExpressionNode) visit(ctx.expr(i)));
      }
    }

    return new DispatchNode(lineNumber, exprNode, name, actuals);
  }

  public Tree visitLoopNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.WHILE().getSymbol().getLine();
    ExpressionNode cond = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode body = (ExpressionNode) visit(ctx.expr(1));
    return new LoopNode(lineNumber, cond, body);
  }

  public Tree visitPlusNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.PLUS_OPERATOR().getSymbol().getLine();
    ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
    return new PlusNode(lineNumber, left, right);
  }

  public Tree visitSubNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.MINUS_OPERATOR().getSymbol().getLine();
    ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
    return new SubNode(lineNumber, left, right);
  }

  public Tree visitMulNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.MULT_OPERATOR().getSymbol().getLine();
    ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
    return new MulNode(lineNumber, left, right);
  }

  public Tree visitDivideNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.DIV_OPERATOR().getSymbol().getLine();
    ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
    return new DivideNode(lineNumber, left, right);
  }

  public Tree visitLTNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.LESS_OPERATOR().getSymbol().getLine();
    ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
    return new LTNode(lineNumber, left, right);
  }

  public Tree visitLEqNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.LESS_EQ_OPERATOR().getSymbol().getLine();
    ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
    return new LEqNode(lineNumber, left, right);
  }

  public Tree visitEqNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.EQ_OPERATOR().getSymbol().getLine();
    ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
    return new EqNode(lineNumber, left, right);
  }

  public Tree visitCondNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.IF().getSymbol().getLine();
    ExpressionNode cond = (ExpressionNode) visit(ctx.expr(0));
    ExpressionNode thenExpr = (ExpressionNode) visit(ctx.expr(1));
    ExpressionNode elseExpr = (ExpressionNode) visit(ctx.expr(1));
    return new CondNode(lineNumber, cond, thenExpr, elseExpr);
  }

  public Tree visitLetNode(CoolParser.ExprContext ctx) {

    int lineNumber = ctx.LET().getSymbol().getLine();
    Symbol name;
    Symbol type;
    ExpressionNode init;

    // body will always last expression, i.e expr after IN
    ExpressionNode body = (ExpressionNode) visit(ctx.expr(0));

    // initialized to satisfy fckn java
    LetNode letNode = null;

    // Check if we declare more than one variable for let
    if (ctx.letvars().size() > 1) {
      List<CoolParser.LetvarsContext> letctx = ctx.letvars();
      int lastLet = letctx.size() - 1;

      for (int i = lastLet; i > -1; i--) {

        // checks for assignment on var declaration
        if (letAssigned(letctx.get(i))) {
          // has assignment so must visit expreesionNode
          init = (ExpressionNode) visit(letctx.get(i).expr());
        } else {
          // no assignment so empty expressionNode, we only care about name and type
          init = new NoExpressionNode(lineNumber);
        }

        name = StringTable.idtable.addString(letctx.get(i).OBJECTID().getSymbol().getText());
        type = StringTable.idtable.addString(letctx.get(i).TYPEID().getSymbol().getText());

        if (i == lastLet) {
          letNode = new LetNode(lineNumber, name, type, init, body);
        } else {
          letNode = new LetNode(lineNumber, name, type, init, letNode);
        }
      }
    }
    // Let with only one identifier
    else {
      CoolParser.LetvarsContext letctx = ctx.letvars(0);
      name = StringTable.idtable.addString(letctx.OBJECTID().getSymbol().getText());
      type = StringTable.idtable.addString(letctx.TYPEID().getSymbol().getText());

      if (letAssigned(letctx)) {
        init = (ExpressionNode) visit(letctx.expr());
      } else {
        init = new NoExpressionNode(lineNumber);
      }

      letNode = new LetNode(lineNumber, name, type, init, body);

    }

    return letNode;

  }

  // let auxiliary method
  public boolean letAssigned(CoolParser.LetvarsContext ctx) {
    if (ctx.ASSIGN_OPERATOR() != null) {
      return true;
    }
    return false;
  }

  public Tree visitCaseNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.CASE().getSymbol().getLine();
    ExpressionNode expr = (ExpressionNode) visit(ctx.expr(0));
    List<BranchNode> cases = new ArrayList<>();

    for (int i = 0; i < ctx.branch().size(); i++) {
      cases.add((BranchNode) visitBranchNode(ctx.branch(i)));
    }

    return new CaseNode(lineNumber, expr, cases);
  }

  public Tree visitBranchNode(CoolParser.BranchContext ctx) {

    int lineNumber = ctx.OBJECTID().getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    ExpressionNode expr = (ExpressionNode) visit(ctx.expr());

    return new BranchNode(lineNumber, name, type, expr);

  }
}

import ast.ClassNode;
import ast.ProgramNode;
import ast.*;
import java.util.*;

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
    if (ctx.OBJECTID().size() == 1) {

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
        return visitDispatchNode(ctx);
      }
    }

    // Dealing with terminal expressions
    if (ctx.expr().size() == 0) {

      // ObjectNode
      if (ctx.OBJECTID().size() != 0) {
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
    if (ctx.expr().size() == 1) {

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
      // ExpressionNode
      else if (ctx.PARENT_OPEN() != null) {
        return visitExpr(ctx);
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

    // default case to satisfy fucking java
    return visitNewNode(ctx);
  }

  public Tree visitObjectNode(CoolParser.ExprContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID(0).getText());
    return new ObjectNode(ctx.OBJECTID(0).getSymbol().getLine(), name);
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
    Symbol name = StringTable.idtable.addString(ctx.TYPEID(0).getText());
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
    int lineNumber = ctx.OBJECTID(0).getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID(0).getSymbol().getText());
    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));

    return new AssignNode(lineNumber, name, exprNode);
  }

  public Tree visitStaticDispatchNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.ASSIGN_OPERATOR(0).getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID(0).getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID(0).getSymbol().getText());

    ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr(0));
    List<ExpressionNode> actuals = new ArrayList<>();

    for (int i = 1; i < ctx.expr().size(); i++) {
      // i starts from 1 instead of 0 because the first expression, expr(0), is
      // reserved for exprNode (maybe)?
      actuals.add((ExpressionNode) visit(ctx.expr(i)));
    }

    return new StaticDispatchNode(lineNumber, exprNode, type, name, actuals);
  }

  public Tree visitDispatchNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.OBJECTID(0).getSymbol().getLine();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID(0).getSymbol().getText());
    ExpressionNode exprNode;

    // Check for no parameters in method
    if (ctx.expr().size() == 0) {
      exprNode = new NoExpressionNode(0);
    } else {
      exprNode = (ExpressionNode) visit(ctx.expr(0));
    }

    List<ExpressionNode> actuals = new ArrayList<>();

    for (int i = 0; i < ctx.expr().size(); i++) {
      // i starts from- 1 same reasoning as above ?
      actuals.add((ExpressionNode) visit(ctx.expr(i)));
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
    Symbol id = StringTable.idtable.addString(ctx.OBJECTID(0).getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID(0).getSymbol().getText());
    int lastExpression = ctx.expr().size() - 1;

    ExpressionNode init = (ctx.ASSIGN_OPERATOR() == null) ? new NoExpressionNode(0)
        : (ExpressionNode) visit(ctx.expr(0));

    ExpressionNode body = (ExpressionNode) visit(ctx.expr(lastExpression));

    for (int i = 1; i < lastExpression - 1; i++) {
      visitLetNode(ctx.expr(i));
    }

    return new LetNode(lineNumber, id, type, init, body);
  }

  public Tree visitCaseNode(CoolParser.ExprContext ctx) {
    int lineNumber = ctx.CASE().getSymbol().getLine();
    ExpressionNode expr = (ExpressionNode) visit(ctx.expr(0));
    List<BranchNode> cases = new ArrayList<>();

    for (int i = 0; i < ctx.expr().size(); i++) {
      cases.add((BranchNode) visit(ctx.expr(i)));
    }

    return new CaseNode(lineNumber, expr, cases);
  }
}

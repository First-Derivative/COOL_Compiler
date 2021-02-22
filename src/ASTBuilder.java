import ast.ClassNode;
import ast.ProgramNode;
import ast.*;
import java.util.*;

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

    AttributeNode attrNode = new AttributeNode(ctx.OBJECTID().getSymbol().getLine(), name, type, expr);

    return attrNode;
  }

  @Override
  public Tree visitFormal(CoolParser.FormalContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    FormalNode formalNode = new FormalNode(ctx.OBJECTID().getSymbol().getLine(), name, type);

    return formalNode;
  }

  @Override
  public Tree visitExpr(CoolParser.ExprContext ctx) {

    // Deals with CondNode
    if (ctx.IF() != null) {

    }

    // Deals with LetNode
    if (ctx.LET() != null) {

    }

    // Deals with CaseNode
    if (ctx.CASE() != null) {

    }

    // Dealing with AssignNode, StaticDispatchNode, DispatchNode, ObjectNode
    if (ctx.OBJECTID().size() == 1) {

    }

    // Dealing with terminal expressions
    if (ctx.expr().size() == 0) {

      // ObjectNode
      if (ctx.OBJECTID() != null) {
        return visitObjectNode(ctx);
      }
      // IntConstNode
      else if (ctx.INT_CONST() != null) {
        // return visitIntConstNode(ctx);
      }
      // StringConstNode
      else if (ctx.STRING_CONST() != null) {
        // return visitStringConstNode(ctx);
      }
      // BoolConstNode
      else if (ctx.TRUE() != null || ctx.FALSE() != null) {
        // return visitBoolConstNode(ctx);
      }
    }

    // Dealing with BlockNode, IsVoidNode, NegNode, CompNode, ( expr ),
    if (ctx.expr().size() == 1) {

    }

    // Dealing with LoopNode, PlusNode, Subnode, MulNode, DivideNode, LTNode,
    // LEqNode, EqNode,
    if (ctx.expr().size() == 2) {

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
    int linenumber;
    if (ctx.TRUE() != null) {
      value = true;
      linenumber = ctx.TRUE().getSymbol().getLine();
    } else {
      value = false;
      linenumber = ctx.FALSE().getSymbol().getLine();
    }

    return new BoolConstNode(linenumber, value);
  }

  public Tree visitNewNode(CoolParser.ExprContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.TYPEID(0).getText());
    return new NewNode(ctx.NEW().getSymbol().getLine(), name);
  }
}

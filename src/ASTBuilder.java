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
  public Tree visitFeature(CoolParser.FeatureContext ctx) {
    if (ctx.PARENT_OPEN() == null) { // isAttribute
      return visitAttributeNode(ctx);
    }
    return visitMethodNode(ctx); // isMethod
  }

  // visitFeature auxiliary Methods
  public Tree visitMethodNode(CoolParser.FeatureContext ctx) {

    List<FormalNode> formalNodes = new ArrayList<>();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol returnType = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    MethodNode methodNode = new MethodNode(ctx.OBJECTID().getSymbol().getLine(), name, formalNodes, returnType,
        (ExpressionNode) visit(ctx.expr()));

    for (CoolParser.FormalContext c : ctx.formal()) {
      formalNodes.add((FormalNode) visit(c));
    }

    return methodNode;
  }

  // visitFeature auxiliary Methods
  public Tree visitAttributeNode(CoolParser.FeatureContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    ExpressionNode expr = (ctx.ASSIGN_OPERATOR() == null) ? new NoExpressionNode(0)
        : (ExpressionNode) visit(ctx.expr());

    AttributeNode attrNode = new AttributeNode(ctx.OBJECTID().getSymbol().getLine(), name, type, expr);

    return attrNode;
  }

  public Tree visitFormal(CoolParser.FormalContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    FormalNode formalNode = new FormalNode(ctx.OBJECTID().getSymbol().getLine(), name, type);

    return formalNode;
  }

}

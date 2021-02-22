import ast.ClassNode;
import ast.ProgramNode;
import ast.*;
import java.util.ArrayList;

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
    String superType = (ctx.INHERITS() == null) ? "Object" : ctx.TYPEID(1);

    Symbol name = StringTable.idtable.addString(ctx.TYPEID(0).getSymbol().getText());
    Symbol parent = StringTable.idtable.addString(superType);
    Symbol filename = StringTable.idtable.addString(Flags.in_filename);

    ClassNode classNode = new ClassNode(lineNum(ctx), name, parent, filename);
    for (CoolParser.FeatureContext c : ctx.feature()) {
      classNode.add((FeatureNode) visit(c));
    }

    return classNode;

  }

  @Override
  public Tree visitMethodNode(CoolParser.ProgramContext ctx) {
    List<FormalNode> formalNodes = new ArrayList<>();
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol returnType = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    MethodNode methodNode = new MethodNode(lineNum(ctx), name, returnType, (ExpressionNode) visit(ctx.expr()));

    for (CoolParser.FormalContext c : ctx.formal()) {
      formalNodes.add((FormalNode) visit(c));
    }

    return methodNode;

  }

  @Override
  public Tree visitAttributeNode(CoolParser.ProgramContext ctx) {
    Symbol name = StringTable.idtable.addString(ctx.OBJECTID().getSymbol().getText());
    Symbol type = StringTable.idtable.addString(ctx.TYPEID().getSymbol().getText());

    // unsure if ternary should return null if true
    ExpressionNode expr = (ctx.ASSIGN_OPERATOR() == null) ? null : new ExpressionNode(lineNum(ctx));

    AttributeNode attrNode = new AttributeNode(lineNum(ctx), name, type, ctx.visit(expr));
    return attrNode;

  }
}

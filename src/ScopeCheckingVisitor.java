
import ast.*;
import ast.visitor.BaseVisitor;

class ScopeData {
  private SymbolKinds kind;
  private Symbol type;

  enum SymbolKinds {
    CLASS, METHOD, VAR
  }

  public ScopeData(SymbolKinds kind, Symbol type) {
    this.kind = kind;
    this.type = type;
  }

}

public class ScopeCheckingVisitor extends BaseVisitor<Object, Object> {
  private SymbolTable<ScopeData> scope;
  private Symbol filename;

  public ScopeCheckingVisitor(SymbolTable symtable) {
    this.scope = new SymbolTable<ScopeData>();

    // Add global symbols (builtInClasses) Bool, Str, Int, etc.
    scope.enterScope();

    // Built-in Bool
    scope.addId(TreeConstants.Bool, new ScopeData(ScopeData.SymbolKinds.CLASS, TreeConstants.SELF_TYPE));

    // Built-in Int
    scope.addId(TreeConstants.Int, new ScopeData(ScopeData.SymbolKinds.CLASS, TreeConstants.SELF_TYPE));
    // val
    scope.addId(TreeConstants.val, new ScopeData(ScopeData.SymbolKinds.VAR, TreeConstants.Int));

    // Built-in String
    scope.addId(TreeConstants.Str, new ScopeData(ScopeData.SymbolKinds.CLASS, TreeConstants.SELF_TYPE));
    // length() : Int returns length of the string
    scope.addId(TreeConstants.length, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.Int));
    // concat(arg: Str) : Str performs string concatenation
    scope.addId(TreeConstants.concat, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.Str));
    // substr(arg: Int, arg2: Int): Str substring selection
    scope.addId(TreeConstants.substr, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.Str));
    // str_field the string itself
    scope.addId(TreeConstants.str_field, new ScopeData(ScopeData.SymbolKinds.VAR, TreeConstants.SELF_TYPE));

    // Built-in Object
    scope.addId(TreeConstants.Object_, new ScopeData(ScopeData.SymbolKinds.CLASS, TreeConstants.SELF_TYPE));
    // cool_abort() : Object aborts the program
    scope.addId(TreeConstants.cool_abort, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.No_type));
    // copy() : SELF_TYPE returns a copy of the object
    scope.addId(TreeConstants.copy, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.SELF_TYPE));
    // type_name() : Str returns a string representation of class name
    scope.addId(TreeConstants.type_name, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.Str));

    // Built-in IO
    scope.addId(TreeConstants.IO, new ScopeData(ScopeData.SymbolKinds.CLASS, TreeConstants.SELF_TYPE));
    // out_string(Str) : SELF_TYPE writes a string to the output
    scope.addId(TreeConstants.out_string, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.SELF_TYPE));
    // out_int(Int) : SELF_TYPE " an int " " "
    scope.addId(TreeConstants.out_int, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.SELF_TYPE));
    // in_string() : Str reads a string from the input
    scope.addId(TreeConstants.in_string, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.Str));
    // in_int() : Int " an int " " "
    scope.addId(TreeConstants.in_int, new ScopeData(ScopeData.SymbolKinds.METHOD, TreeConstants.Int));

    filename = new Symbol(Flags.in_filename, 0);
  }

  // Visiting ProgramNode
  @Override
  public Object visit(ProgramNode node, Object Data) {
    // handling userClasses
    for (ClassNode c : node.getClasses()) {
      scope.addId(c.getName(), new ScopeData(ScopeData.SymbolKinds.CLASS, TreeConstants.SELF_TYPE));

      // for (FeatureNode f : c.getFeatures()) {
      // if (f instanceof MethodNode) {
      // // .add((MethodNode) f).getName().getName());
      // } else if (f instanceof AttributeNode) {
      // // .add((AttributeNode) f).getName().getName();
      // }
      // }
    }

    for (ClassNode c : node.getClasses()) {
      scope.enterScope();
      scope.addId(c.getName(), new ScopeData(ScopeData.SymbolKinds.CLASS, TreeConstants.SELF_TYPE));
      scope.addId(c.getName(), new ScopeData(ScopeData.SymbolKinds.VAR, TreeConstants.self));
      visit(c, Data);

      System.out.println(scope);

      scope.exitScope();
    }

    scope.exitScope(); // exit global scope
    return Data;
  }

  @Override
  public Object visit(ClassNode node, Object Data) {
    String className = node.getName().getName();

    for (FeatureNode f : node.getFeatures()) {
      if (f instanceof MethodNode) {
        scope.addId(((MethodNode) f).getName(),
            new ScopeData(ScopeData.SymbolKinds.METHOD, ((MethodNode) f).getReturn_type()));
        scope.enterScope();
        visit((MethodNode) f, className);

        System.out.println(scope);

        scope.exitScope();
      } else if (f instanceof AttributeNode) {
        if (((AttributeNode) f).getName() == TreeConstants.self) {
          Utilities.semantError(filename, node).println("'self' cannot be the name of an attribute.");
        }

        scope.addId(((AttributeNode) f).getName(),
            new ScopeData(ScopeData.SymbolKinds.VAR, ((AttributeNode) f).getType_decl()));
        visit((AttributeNode) f, className);
      }
    }

    return Data;
  }

  @Override
  public Object visit(MethodNode node, Object Data) {
    for (FormalNode f : node.getFormals()) {
      System.out.println("adding formals");

      scope.addId(((FormalNode) f).getName(),
          new ScopeData(ScopeData.SymbolKinds.VAR, ((FormalNode) f).getType_decl()));

      System.out.println(scope);
    }

    visit((ExpressionNode) node.getExpr(), Data);
    return Data;
  }

  @Override
  public Object visit(ExpressionNode node, Object Data) {
    System.out.println("visiting expression node");

    if (node instanceof ObjectNode) {
      visit((ObjectNode) node, Data);
    }

    return Data;
  }

  @Override
  public Object visit(ObjectNode node, Object Data) {
    System.out.println("visiting object node");

    ScopeData d = scope.probe(node.getName());
    if (d == null && !node.getName().getName().equals("self")) {
      Utilities.semantError(filename, node).println("Undeclared identifier " + node.getName());
    }

    return Data;
  }
}

import ast.*;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

class InheritanceGraph {

  private InheritanceGraphNode root;

  public InheritanceGraphNode getRoot() {
    return this.root;
  }

  public void setRoot(InheritanceGraphNode newRoot) {
    this.root = newRoot;
  }

  public InheritanceGraphNode findNode(Symbol parent) {
    LinkedList<InheritanceGraphNode> queue = new LinkedList<InheritanceGraphNode>();
    queue.add(this.root); // start at root

    InheritanceGraphNode current;

    while (queue.size() > 0) {
      current = queue.pollFirst();
      Symbol currentClass = current.getValue().getName();

      if (currentClass.getName().equals(parent.getName())) {
        return current;
      }

      for (InheritanceGraphNode child : current.getChildren()) {
        queue.add(child);
      }

    }

    return null;
  }

  public void print() {
    LinkedList<InheritanceGraphNode> queue = new LinkedList<InheritanceGraphNode>();
    queue.add(this.root); // start at root

    InheritanceGraphNode current;

    while (queue.size() > 0) {
      current = queue.pollFirst();
      Symbol currentClass = current.getValue().getName();

      System.out.println("Current Node: " + currentClass.getName());

      for (InheritanceGraphNode child : current.getChildren()) {
        System.out.print(child.getValue().getName().getName() + " --- ");
        queue.add(child);
      }

      System.out.println('\n');
    }
  }
}

class InheritanceGraphNode {
  private ClassNode value;
  private List<InheritanceGraphNode> children;

  public InheritanceGraphNode(ClassNode value) {
    this.value = value;
    this.children = new ArrayList<>();
  }

  public InheritanceGraphNode addChild(ClassNode newValue) {
    InheritanceGraphNode newChild = new InheritanceGraphNode(newValue);
    children.add(newChild);
    return newChild;
  }

  public ClassNode getValue() {
    return this.value;
  }

  public List<InheritanceGraphNode> getChildren() {
    return this.children;
  }
}

/**
 * This class may be used to contain the semantic information such as the
 * inheritance graph. You may use it or not as you like: it is only here to
 * provide a container for the supplied methods.
 */
class ClassTable {

  InheritanceGraph inheritanceGraph = new InheritanceGraph();

  public ClassTable(List<ClassNode> userDefinedClasses) {
    // Consutrcting classes arraylists for error checking/handling
    ArrayList<ClassNode> builtInClasses = this.installBasicClasses();
    ArrayList<ClassNode> allClasses = new ArrayList<ClassNode>(builtInClasses);

    // Adding built-in classes to inhertiance graph
    InheritanceGraphNode Object_node = new InheritanceGraphNode(builtInClasses.get(0));
    for (int i = 1; i < builtInClasses.size(); i++) {
      ClassNode builtIn = builtInClasses.get(i);
      Object_node.addChild(builtIn);
    }
    this.inheritanceGraph.setRoot(Object_node);

    // check A: that userDefinedClasses are valid
    for (ClassNode userClass : userDefinedClasses) {

      String inherits = userClass.getParent().getName();
      String userClassName = userClass.getName().getName();

      // check that userClasses aren't inheriting from specific builtInClasses
      if (inherits.equals("Bool")) {
        // good.cl:L: Class X cannot inherit class Bool.
        Utilities.semantError(userClass).println(Flags.in_filename + ":" + userClass.getLineNumber() + ": Class "
            + userClassName + " cannot inherit class Bool.");
      } else if (inherits.equals("String")) {
        // good.cl:L: Class X cannot inherit class String.
        Utilities.semantError(userClass).println(Flags.in_filename + ":" + userClass.getLineNumber() + ": Class "
            + userClassName + " annot inherit class String.");
      } else if (inherits.equals("Int")) {
        // good.cl:L: Class X cannot inherit class Int.
        Utilities.semantError(userClass).println(Flags.in_filename + ":" + userClass.getLineNumber() + ": Class "
            + userClassName + " cannot inherit class Int.");
      } else if (inherits.equals("SELF_TYPE")) {
        // good.cl:L: Class X cannot inherit class SELF_TYPE.
        Utilities.semantError(userClass).println(Flags.in_filename + ":" + userClass.getLineNumber() + ": Class "
            + userClassName + " cannot inherit class SELF_TYPE.");
      }
      // endof check A

      // check B: that userClasses aren't redefining existing class names
      for (ClassNode existingClass : allClasses) {
        String existingClassName = existingClass.getName().getName();

        if (userClassName.equals(existingClassName)) {
          Utilities.semantError(userClass).println(Flags.in_filename + ":" + userClass.getLineNumber() + ": Class "
              + userClassName + " was previously defined.");
        }
      }
      // endof check B

      allClasses.add(userClass);
    }

    // Building valid inheritance graph
    for (ClassNode userClass : userDefinedClasses) {

      InheritanceGraphNode exists = this.inheritanceGraph.findNode(userClass.getName());
      if (exists != null) {
        continue;
      }

      Symbol parentSymbol = userClass.getParent();
      String parentSymbolName = parentSymbol.getName();
      String userClassName = userClass.getName().getName();

      // Check C: for inheriting from undefined classes
      Boolean foundParent = false;
      for (ClassNode existingClass : allClasses) {
        String existingClassName = existingClass.getName().getName();
        if (existingClassName.equals(parentSymbolName)) {
          foundParent = true;
        }
      }
      if (!foundParent) {
        // good.cl:13: Class A inherits from an undefined class <>.
        Utilities.semantError(userClass).println(Flags.in_filename + ":" + userClass.getLineNumber() + ": Class "
            + userClassName + " inherits from an undefined class " + parentSymbolName + ".");
        break;
      }
      // end of Check C

      // Constructing valid inheritance graph
      InheritanceGraphNode parentNode = inheritanceGraph.findNode(parentSymbol);
      if (parentNode == null) {
        parentNode = traverseInheritanceChain(userClass, userDefinedClasses);

        if (parentNode == null) { // Inheritance cycle detected, stop executing
          return;
        }
      }

      InheritanceGraphNode newClass = new InheritanceGraphNode(userClass);
      parentNode.getChildren().add(newClass);
    }

    // this.inheritanceGraph.print();
  }

  private ArrayList<ClassNode> installBasicClasses() {

    Symbol filename = StringTable.idtable.addString(Flags.in_filename);

    LinkedList<FormalNode> formals;

    // The Object class has no parent class. Its methods are
    // cool_abort() : Object aborts the program
    // type_name() : Str returns a string representation
    // of class name
    // copy() : SELF_TYPE returns a copy of the object

    ClassNode Object_class = new ClassNode(0, TreeConstants.Object_, TreeConstants.No_class, filename);

    Object_class.add(new MethodNode(0, TreeConstants.cool_abort, new LinkedList<FormalNode>(), TreeConstants.Object_,
        new NoExpressionNode(0)));

    Object_class.add(new MethodNode(0, TreeConstants.type_name, new LinkedList<FormalNode>(), TreeConstants.Str,
        new NoExpressionNode(0)));

    Object_class.add(new MethodNode(0, TreeConstants.copy, new LinkedList<FormalNode>(), TreeConstants.SELF_TYPE,
        new NoExpressionNode(0)));

    // The IO class inherits from Object. Its methods are
    // out_string(Str) : SELF_TYPE writes a string to the output
    // out_int(Int) : SELF_TYPE " an int " " "
    // in_string() : Str reads a string from the input
    // in_int() : Int " an int " " "

    ClassNode IO_class = new ClassNode(0, TreeConstants.IO, TreeConstants.Object_, filename);

    formals = new LinkedList<FormalNode>();
    formals.add(new FormalNode(0, TreeConstants.arg, TreeConstants.Str));

    IO_class
        .add(new MethodNode(0, TreeConstants.out_string, formals, TreeConstants.SELF_TYPE, new NoExpressionNode(0)));

    formals = new LinkedList<FormalNode>();
    formals.add(new FormalNode(0, TreeConstants.arg, TreeConstants.Int));
    IO_class.add(new MethodNode(0, TreeConstants.out_int, formals, TreeConstants.SELF_TYPE, new NoExpressionNode(0)));

    IO_class.add(new MethodNode(0, TreeConstants.in_string, new LinkedList<FormalNode>(), TreeConstants.Str,
        new NoExpressionNode(0)));

    IO_class.add(new MethodNode(0, TreeConstants.in_int, new LinkedList<FormalNode>(), TreeConstants.Int,
        new NoExpressionNode(0)));

    // The Int class has no methods and only a single attribute, the
    // "val" for the integer.

    ClassNode Int_class = new ClassNode(0, TreeConstants.Int, TreeConstants.Object_, filename);

    Int_class.add(new AttributeNode(0, TreeConstants.val, TreeConstants.prim_slot, new NoExpressionNode(0)));

    // Bool also has only the "val" slot.
    ClassNode Bool_class = new ClassNode(0, TreeConstants.Bool, TreeConstants.Object_, filename);

    Bool_class.add(new AttributeNode(0, TreeConstants.val, TreeConstants.prim_slot, new NoExpressionNode(0)));

    // The class Str has a number of slots and operations:
    // val the length of the string
    // str_field the string itself
    // length() : Int returns length of the string
    // concat(arg: Str) : Str performs string concatenation
    // substr(arg: Int, arg2: Int): Str substring selection

    ClassNode Str_class = new ClassNode(0, TreeConstants.Str, TreeConstants.Object_, filename);
    Str_class.add(new AttributeNode(0, TreeConstants.val, TreeConstants.Int, new NoExpressionNode(0)));

    Str_class.add(new AttributeNode(0, TreeConstants.str_field, TreeConstants.prim_slot, new NoExpressionNode(0)));
    Str_class.add(new MethodNode(0, TreeConstants.length, new LinkedList<FormalNode>(), TreeConstants.Int,
        new NoExpressionNode(0)));

    formals = new LinkedList<FormalNode>();
    formals.add(new FormalNode(0, TreeConstants.arg, TreeConstants.Str));
    Str_class.add(new MethodNode(0, TreeConstants.concat, formals, TreeConstants.Str, new NoExpressionNode(0)));

    formals = new LinkedList<FormalNode>();
    formals.add(new FormalNode(0, TreeConstants.arg, TreeConstants.Int));
    formals.add(new FormalNode(0, TreeConstants.arg2, TreeConstants.Int));

    Str_class.add(new MethodNode(0, TreeConstants.substr, formals, TreeConstants.Str, new NoExpressionNode(0)));

    // return arraylist of all builtInClasses for use elsewhere
    ArrayList<ClassNode> classes = new ArrayList<ClassNode>();
    classes.add(Object_class);
    classes.add(IO_class);
    classes.add(Int_class);
    classes.add(Str_class);
    classes.add(Bool_class);

    return classes;
  }

  private InheritanceGraphNode traverseInheritanceChain(ClassNode currentClass, List<ClassNode> userDefinedClasses) {
    InheritanceGraphNode targetNode = null;
    ArrayList<ClassNode> stack = new ArrayList<ClassNode>();
    ClassNode firstParent = getClassNode(currentClass.getParent(), userDefinedClasses);
    stack.add(firstParent);

    while (stack.size() > 0) {
      ClassNode current = stack.get(0);

      InheritanceGraphNode currentParentNode = this.inheritanceGraph.findNode(current.getParent());

      if (currentParentNode == null) {
        ClassNode parentClassNode = getClassNode(current.getParent(), userDefinedClasses);

        // check for cyclic
        if (stack.contains(parentClassNode)) {
          stack.remove(0);
          stack.add(stack.size(), currentClass);

          for (ClassNode cn : stack) {
            Utilities.semantError(cn)
                .println(Flags.in_filename + ":" + cn.getLineNumber() + ": Class " + cn.getName().getName()
                    + ", or an ancestor of " + cn.getName().getName() + ", is involved in an inheritance cycle.");
          }

          return null;
        }

        stack.add(0, parentClassNode);

      } else {
        stack.remove(0);
        targetNode = currentParentNode.addChild(current);

        if (stack.size() == 0) {
          return targetNode;
        }
      }
    }

    return targetNode;
  }

  // Auxiliary method for getting ClassNode from symbols
  private ClassNode getClassNode(Symbol sym, List<ClassNode> userDefinedClasses) {
    ClassNode currentClassNode = null;

    for (ClassNode cn : userDefinedClasses) {

      if (sym.getName().equals(cn.getName().getName())) {
        currentClassNode = cn;
        break;
      }
    }

    return currentClassNode;
  }
}

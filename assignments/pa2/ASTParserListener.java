// Generated from /Users/NCC1701-C/cool/LCARS/src/ast/parser/ASTParser.g4 by ANTLR 4.6
package ast.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASTParser}.
 */
public interface ASTParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ASTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ASTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#coolClass}.
	 * @param ctx the parse tree
	 */
	void enterCoolClass(ASTParser.CoolClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#coolClass}.
	 * @param ctx the parse tree
	 */
	void exitCoolClass(ASTParser.CoolClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(ASTParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(ASTParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ASTParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ASTParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(ASTParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(ASTParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(ASTParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(ASTParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ASTParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ASTParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ASTParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ASTParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticDispatch}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterStaticDispatch(ASTParser.StaticDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticDispatch}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitStaticDispatch(ASTParser.StaticDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DynamicDispatch}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterDynamicDispatch(ASTParser.DynamicDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DynamicDispatch}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitDynamicDispatch(ASTParser.DynamicDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterCond(ASTParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitCond(ASTParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ASTParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ASTParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ASTParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ASTParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Let}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterLet(ASTParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitLet(ASTParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Case}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterCase(ASTParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Case}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitCase(ASTParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code New}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterNew(ASTParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitNew(ASTParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Isvoid}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(ASTParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Isvoid}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(ASTParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterBinop(ASTParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitBinop(ASTParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterUnop(ASTParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitUnop(ASTParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInt}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterConstInt(ASTParser.ConstIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInt}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitConstInt(ASTParser.ConstIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstStr}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterConstStr(ASTParser.ConstStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstStr}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitConstStr(ASTParser.ConstStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstBool}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterConstBool(ASTParser.ConstBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstBool}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitConstBool(ASTParser.ConstBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Obj}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterObj(ASTParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Obj}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitObj(ASTParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoExpr}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void enterNoExpr(ASTParser.NoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoExpr}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 */
	void exitNoExpr(ASTParser.NoExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#simplecase}.
	 * @param ctx the parse tree
	 */
	void enterSimplecase(ASTParser.SimplecaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#simplecase}.
	 * @param ctx the parse tree
	 */
	void exitSimplecase(ASTParser.SimplecaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ASTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ASTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ASTParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ASTParser.IdContext ctx);
}
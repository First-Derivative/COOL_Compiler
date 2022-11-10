// Generated from /Users/NCC1701-C/cool/LCARS/src/ast/parser/ASTParser.g4 by ANTLR 4.6
package ast.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ASTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ASTParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ASTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ASTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#coolClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoolClass(ASTParser.CoolClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(ASTParser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ASTParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(ASTParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(ASTParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ASTParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ASTParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StaticDispatch}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticDispatch(ASTParser.StaticDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DynamicDispatch}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicDispatch(ASTParser.DynamicDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ASTParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ASTParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ASTParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(ASTParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Case}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(ASTParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code New}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(ASTParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Isvoid}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(ASTParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(ASTParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unop}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(ASTParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstInt}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInt(ASTParser.ConstIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstStr}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStr(ASTParser.ConstStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstBool}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBool(ASTParser.ConstBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Obj}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(ASTParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoExpr}
	 * labeled alternative in {@link ASTParser#expr_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExpr(ASTParser.NoExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#simplecase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplecase(ASTParser.SimplecaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ASTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ASTParser.IdContext ctx);
}
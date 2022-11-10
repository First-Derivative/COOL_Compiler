// Generated from /Users/NCC1701-C/cool/LCARS/src/CoolParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#coolClass}.
	 * @param ctx the parse tree
	 */
	void enterCoolClass(CoolParser.CoolClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#coolClass}.
	 * @param ctx the parse tree
	 */
	void exitCoolClass(CoolParser.CoolClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(CoolParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(CoolParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CoolParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CoolParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(CoolParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(CoolParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#letvars}.
	 * @param ctx the parse tree
	 */
	void enterLetvars(CoolParser.LetvarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#letvars}.
	 * @param ctx the parse tree
	 */
	void exitLetvars(CoolParser.LetvarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(CoolParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(CoolParser.ErrorContext ctx);
}
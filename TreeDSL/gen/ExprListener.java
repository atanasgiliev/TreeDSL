// Generated from /Users/atanasiliev/Desktop/cs59project/TreeDSL/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExprParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExprParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#firstLine}.
	 * @param ctx the parse tree
	 */
	void enterFirstLine(ExprParser.FirstLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#firstLine}.
	 * @param ctx the parse tree
	 */
	void exitFirstLine(ExprParser.FirstLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ExprParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ExprParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ExprParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ExprParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parents}.
	 * @param ctx the parse tree
	 */
	void enterParents(ExprParser.ParentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parents}.
	 * @param ctx the parse tree
	 */
	void exitParents(ExprParser.ParentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relations}.
	 * @param ctx the parse tree
	 */
	void enterRelations(ExprParser.RelationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relations}.
	 * @param ctx the parse tree
	 */
	void exitRelations(ExprParser.RelationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(ExprParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(ExprParser.SpecialContext ctx);
}
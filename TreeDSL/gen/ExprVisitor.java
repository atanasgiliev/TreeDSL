// Generated from /Users/atanasiliev/Desktop/cs59project/TreeDSL/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExprParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#firstLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstLine(ExprParser.FirstLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ExprParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ExprParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#parents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParents(ExprParser.ParentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelations(ExprParser.RelationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExprParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(ExprParser.SpecialContext ctx);
}
package grammar;

// Generated from JMRCompiler.g4 by ANTLR 4.7

        import java.util.HashMap;
        import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JMRCompilerParser}.
 */
public interface JMRCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JMRCompilerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JMRCompilerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#decVars}.
	 * @param ctx the parse tree
	 */
	void enterDecVars(JMRCompilerParser.DecVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#decVars}.
	 * @param ctx the parse tree
	 */
	void exitDecVars(JMRCompilerParser.DecVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(JMRCompilerParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(JMRCompilerParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void enterListaIDs(JMRCompilerParser.ListaIDsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void exitListaIDs(JMRCompilerParser.ListaIDsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#listaIDs2}.
	 * @param ctx the parse tree
	 */
	void enterListaIDs2(JMRCompilerParser.ListaIDs2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#listaIDs2}.
	 * @param ctx the parse tree
	 */
	void exitListaIDs2(JMRCompilerParser.ListaIDs2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#decConsts}.
	 * @param ctx the parse tree
	 */
	void enterDecConsts(JMRCompilerParser.DecConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#decConsts}.
	 * @param ctx the parse tree
	 */
	void exitDecConsts(JMRCompilerParser.DecConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(JMRCompilerParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(JMRCompilerParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#decFuncs}.
	 * @param ctx the parse tree
	 */
	void enterDecFuncs(JMRCompilerParser.DecFuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#decFuncs}.
	 * @param ctx the parse tree
	 */
	void exitDecFuncs(JMRCompilerParser.DecFuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros(JMRCompilerParser.Lista_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros(JMRCompilerParser.Lista_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JMRCompilerParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JMRCompilerParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(JMRCompilerParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(JMRCompilerParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(JMRCompilerParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(JMRCompilerParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(JMRCompilerParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(JMRCompilerParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(JMRCompilerParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(JMRCompilerParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(JMRCompilerParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(JMRCompilerParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(JMRCompilerParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(JMRCompilerParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(JMRCompilerParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(JMRCompilerParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JMRCompilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JMRCompilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(JMRCompilerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(JMRCompilerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterTerm2(JMRCompilerParser.Term2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitTerm2(JMRCompilerParser.Term2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(JMRCompilerParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(JMRCompilerParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(JMRCompilerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(JMRCompilerParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JMRCompilerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JMRCompilerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMRCompilerParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(JMRCompilerParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMRCompilerParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(JMRCompilerParser.ReadContext ctx);
}
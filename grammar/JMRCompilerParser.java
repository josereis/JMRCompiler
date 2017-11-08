// Generated from JMRCompiler.g4 by ANTLR 4.7

        import java.util.HashMap;
        import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JMRCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Tk_Class=1, Tk_Main=2, Tk_PtVirg=3, Tk_Virg=4, Tk_DoisPt=5, Tk_Eq=6, Tk_Int=7, 
		Tk_Str=8, Tk_Bool=9, Tk_Float=10, Tk_Void=11, Tk_Final=12, Tk_AbreChave=13, 
		Tk_FechChave=14, Tk_AbrePar=15, Tk_FechaPar=16, Tk_Return=17, Tk_If=18, 
		Tk_Else=19, Tk_For=20, Tk_Break=21, Tk_Print=22, Tk_Read=23, Tk_Inc=24, 
		Tk_Dec=25, Tk_Soma=26, Tk_Sub=27, Tk_Mult=28, Tk_Div=29, Tk_Equal=30, 
		Tk_Dif=31, Tk_Diff=32, Tk_Maiorq=33, Tk_Menorq=34, Tk_Maiorig=35, Tk_Menorig=36, 
		Tk_Ou=37, Tk_E=38, STRING=39, INT=40, REAL=41, BOOLEAN=42, ID=43, COMMENT_LINE=44, 
		COMMENT=45, WS=46;
	public static final int
		RULE_programa = 0, RULE_decVars = 1, RULE_tipo = 2, RULE_listaIDs = 3, 
		RULE_listaIDs2 = 4, RULE_decConsts = 5, RULE_valor = 6, RULE_decFuncs = 7, 
		RULE_lista_parametros = 8, RULE_main = 9, RULE_comandos = 10, RULE_atrib = 11, 
		RULE_funcao = 12, RULE_bool = 13, RULE_join = 14, RULE_rel = 15, RULE_equality = 16, 
		RULE_expr = 17, RULE_term = 18, RULE_term2 = 19, RULE_unary = 20, RULE_factor = 21, 
		RULE_print = 22, RULE_read = 23;
	public static final String[] ruleNames = {
		"programa", "decVars", "tipo", "listaIDs", "listaIDs2", "decConsts", "valor", 
		"decFuncs", "lista_parametros", "main", "comandos", "atrib", "funcao", 
		"bool", "join", "rel", "equality", "expr", "term", "term2", "unary", "factor", 
		"print", "read"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Class'", "'Main'", "';'", "','", "':'", "'='", "'Int'", "'Str'", 
		"'Bool'", "'Float'", "'Void'", "'final'", "'{'", "'}'", "'('", "')'", 
		"'return'", "'if'", "'else'", "'for'", "'break'", "'print'", "'read'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'!'", "'>'", 
		"'<'", "'>='", "'<='", "'||'", "'&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Tk_Class", "Tk_Main", "Tk_PtVirg", "Tk_Virg", "Tk_DoisPt", "Tk_Eq", 
		"Tk_Int", "Tk_Str", "Tk_Bool", "Tk_Float", "Tk_Void", "Tk_Final", "Tk_AbreChave", 
		"Tk_FechChave", "Tk_AbrePar", "Tk_FechaPar", "Tk_Return", "Tk_If", "Tk_Else", 
		"Tk_For", "Tk_Break", "Tk_Print", "Tk_Read", "Tk_Inc", "Tk_Dec", "Tk_Soma", 
		"Tk_Sub", "Tk_Mult", "Tk_Div", "Tk_Equal", "Tk_Dif", "Tk_Diff", "Tk_Maiorq", 
		"Tk_Menorq", "Tk_Maiorig", "Tk_Menorig", "Tk_Ou", "Tk_E", "STRING", "INT", 
		"REAL", "BOOLEAN", "ID", "COMMENT_LINE", "COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JMRCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	   
	        //Map<String,Integer> TabSimb = new HashMap<String,Integer>();

	public JMRCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public List<DecConstsContext> decConsts() {
			return getRuleContexts(DecConstsContext.class);
		}
		public DecConstsContext decConsts(int i) {
			return getRuleContext(DecConstsContext.class,i);
		}
		public List<DecFuncsContext> decFuncs() {
			return getRuleContexts(DecFuncsContext.class);
		}
		public DecFuncsContext decFuncs(int i) {
			return getRuleContext(DecFuncsContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(Tk_Class);
			setState(49);
			match(ID);
			setState(50);
			match(Tk_PtVirg);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float) | (1L << Tk_Void) | (1L << Tk_Final))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(51);
					decVars();
					}
					break;
				case 2:
					{
					setState(52);
					decConsts();
					}
					break;
				case 3:
					{
					setState(53);
					decFuncs();
					}
					break;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecVarsContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public DecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterDecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitDecVars(this);
		}
	}

	public final DecVarsContext decVars() throws RecognitionException {
		DecVarsContext _localctx = new DecVarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((DecVarsContext)_localctx).tipo = tipo();
			setState(62);
			match(Tk_DoisPt);
			setState(63);
			listaIDs(((DecVarsContext)_localctx).tipo.t);
			setState(64);
			match(Tk_PtVirg);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public int t;
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(Tk_Int);
				((TipoContext)_localctx).t =  1;
				}
				break;
			case Tk_Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(Tk_Str);
				((TipoContext)_localctx).t =  2;
				}
				break;
			case Tk_Bool:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(Tk_Bool);
				((TipoContext)_localctx).t =  3;
				}
				break;
			case Tk_Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(Tk_Float);
				((TipoContext)_localctx).t =  4;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaIDsContext extends ParserRuleContext {
		public int t;
		public List<TerminalNode> ID() { return getTokens(JMRCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JMRCompilerParser.ID, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListaIDsContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_listaIDs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitListaIDs(this);
		}
	}

	public final ListaIDsContext listaIDs(int t) throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState(), t);
		enterRule(_localctx, 6, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(77);
				match(Tk_Virg);
				setState(78);
				match(ID);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaIDs2Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JMRCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JMRCompilerParser.ID, i);
		}
		public ListaIDs2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIDs2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterListaIDs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitListaIDs2(this);
		}
	}

	public final ListaIDs2Context listaIDs2() throws RecognitionException {
		ListaIDs2Context _localctx = new ListaIDs2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaIDs2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(85);
				match(Tk_Virg);
				setState(86);
				match(ID);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecConstsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public TerminalNode Tk_Eq() { return getToken(JMRCompilerParser.Tk_Eq, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DecConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decConsts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterDecConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitDecConsts(this);
		}
	}

	public final DecConstsContext decConsts() throws RecognitionException {
		DecConstsContext _localctx = new DecConstsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decConsts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Tk_Final);
			setState(93);
			tipo();
			setState(94);
			match(ID);
			setState(95);
			match(Tk_Eq);
			setState(96);
			valor();
			setState(97);
			match(Tk_PtVirg);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JMRCompilerParser.INT, 0); }
		public TerminalNode REAL() { return getToken(JMRCompilerParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(JMRCompilerParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(JMRCompilerParser.BOOLEAN, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecFuncsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public List<DecConstsContext> decConsts() {
			return getRuleContexts(DecConstsContext.class);
		}
		public DecConstsContext decConsts(int i) {
			return getRuleContext(DecConstsContext.class,i);
		}
		public DecFuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFuncs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterDecFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitDecFuncs(this);
		}
	}

	public final DecFuncsContext decFuncs() throws RecognitionException {
		DecFuncsContext _localctx = new DecFuncsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Int:
			case Tk_Str:
			case Tk_Bool:
			case Tk_Float:
				{
				setState(101);
				tipo();
				}
				break;
			case Tk_Void:
				{
				setState(102);
				match(Tk_Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			match(ID);
			setState(106);
			match(Tk_AbrePar);
			setState(107);
			lista_parametros();
			setState(108);
			match(Tk_FechaPar);
			setState(109);
			match(Tk_AbreChave);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(110);
					comandos();
					}
					break;
				case 2:
					{
					setState(111);
					decVars();
					}
					break;
				case 3:
					{
					setState(112);
					decConsts();
					}
					break;
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float) | (1L << Tk_Final) | (1L << Tk_AbrePar) | (1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0) );
			setState(117);
			match(Tk_FechChave);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_parametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JMRCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JMRCompilerParser.ID, i);
		}
		public Lista_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterLista_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitLista_parametros(this);
		}
	}

	public final Lista_parametrosContext lista_parametros() throws RecognitionException {
		Lista_parametrosContext _localctx = new Lista_parametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			tipo();
			setState(120);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(121);
				match(Tk_Virg);
				setState(122);
				tipo();
				setState(123);
				match(ID);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public List<DecConstsContext> decConsts() {
			return getRuleContexts(DecConstsContext.class);
		}
		public DecConstsContext decConsts(int i) {
			return getRuleContext(DecConstsContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(Tk_Main);
			setState(131);
			match(Tk_AbreChave);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(132);
					comandos();
					}
					break;
				case 2:
					{
					setState(133);
					decVars();
					}
					break;
				case 3:
					{
					setState(134);
					decConsts();
					}
					break;
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float) | (1L << Tk_Final) | (1L << Tk_AbrePar) | (1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0) );
			setState(139);
			match(Tk_FechChave);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public DecConstsContext decConsts() {
			return getRuleContext(DecConstsContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandos);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(Tk_If);
				setState(142);
				match(Tk_AbrePar);
				setState(143);
				bool(0);
				setState(144);
				match(Tk_FechaPar);
				setState(145);
				match(Tk_AbreChave);
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					comandos();
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Final) | (1L << Tk_AbrePar) | (1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0) );
				setState(151);
				match(Tk_FechChave);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_Else) {
					{
					setState(152);
					match(Tk_Else);
					setState(153);
					match(Tk_AbreChave);
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(154);
						comandos();
						}
						}
						setState(157); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Final) | (1L << Tk_AbrePar) | (1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0) );
					setState(159);
					match(Tk_FechChave);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(Tk_For);
				setState(164);
				match(Tk_AbrePar);
				setState(165);
				atrib();
				setState(166);
				bool(0);
				setState(167);
				match(Tk_PtVirg);
				setState(168);
				bool(0);
				setState(169);
				match(Tk_FechaPar);
				setState(170);
				match(Tk_AbreChave);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Final) | (1L << Tk_AbrePar) | (1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(171);
					comandos();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(Tk_FechChave);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				decConsts();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				atrib();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				bool(0);
				setState(182);
				match(Tk_PtVirg);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				read();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(Tk_Break);
				setState(187);
				match(Tk_PtVirg);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				match(Tk_Return);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(189);
					bool(0);
					}
				}

				setState(192);
				match(Tk_PtVirg);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public TerminalNode Tk_Eq() { return getToken(JMRCompilerParser.Tk_Eq, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atrib);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(ID);
				setState(196);
				match(Tk_Eq);
				setState(197);
				bool(0);
				setState(198);
				match(Tk_PtVirg);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(ID);
				setState(201);
				match(Tk_Inc);
				setState(202);
				match(Tk_PtVirg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(ID);
				setState(204);
				match(Tk_Dec);
				setState(205);
				match(Tk_PtVirg);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(Tk_AbrePar);
			setState(210);
			bool(0);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(211);
				match(Tk_Virg);
				setState(212);
				bool(0);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(Tk_FechaPar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			join(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool);
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224);
					match(Tk_Ou);
					setState(225);
					join(0);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		return join(0);
	}

	private JoinContext join(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinContext _localctx = new JoinContext(_ctx, _parentState);
		JoinContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_join, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_join);
					setState(234);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(235);
					match(Tk_E);
					setState(236);
					rel();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rel);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				equality(0);
				setState(243);
				match(Tk_Menorq);
				setState(244);
				equality(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				equality(0);
				setState(247);
				match(Tk_Menorig);
				setState(248);
				equality(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				equality(0);
				setState(251);
				match(Tk_Maiorig);
				setState(252);
				equality(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				equality(0);
				setState(255);
				match(Tk_Maiorq);
				setState(256);
				equality(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				equality(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		return equality(0);
	}

	private EqualityContext equality(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityContext _localctx = new EqualityContext(_ctx, _parentState);
		EqualityContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(262);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(264);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(265);
						match(Tk_Equal);
						setState(266);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(267);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(268);
						match(Tk_Dif);
						setState(269);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(279);
						match(Tk_Soma);
						setState(280);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						match(Tk_Sub);
						setState(283);
						term(0);
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(290);
			term2();
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(292);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						match(Tk_Mult);
						setState(294);
						term2();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(295);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(296);
						match(Tk_Div);
						setState(297);
						term2();
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Term2Context extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitTerm2(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_term2);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				unary();
				setState(304);
				match(Tk_Inc);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				unary();
				setState(307);
				match(Tk_Dec);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				unary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unary);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Diff:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(Tk_Diff);
				setState(313);
				factor();
				}
				break;
			case Tk_Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(Tk_Sub);
				setState(315);
				factor();
				}
				break;
			case Tk_AbrePar:
			case STRING:
			case INT:
			case REAL:
			case BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(Tk_AbrePar);
				setState(322);
				bool(0);
				setState(323);
				match(Tk_FechaPar);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Tk_Print);
			setState(329);
			match(Tk_AbrePar);
			setState(330);
			bool(0);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(331);
				match(Tk_Virg);
				setState(332);
				bool(0);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			match(Tk_FechaPar);
			setState(339);
			match(Tk_PtVirg);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public ListaIDs2Context listaIDs2() {
			return getRuleContext(ListaIDs2Context.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Tk_Read);
			setState(342);
			match(Tk_AbrePar);
			setState(343);
			listaIDs2();
			setState(344);
			match(Tk_FechaPar);
			setState(345);
			match(Tk_PtVirg);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return bool_sempred((BoolContext)_localctx, predIndex);
		case 14:
			return join_sempred((JoinContext)_localctx, predIndex);
		case 16:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 18:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean join_sempred(JoinContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u015e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\7\5R\n\5\f"+
		"\5\16\5U\13\5\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t"+
		"t\n\t\r\t\16\tu\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n"+
		"\u0083\13\n\3\13\3\13\3\13\3\13\3\13\6\13\u008a\n\13\r\13\16\13\u008b"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0096\n\f\r\f\16\f\u0097\3\f\3"+
		"\f\3\f\3\f\6\f\u009e\n\f\r\f\16\f\u009f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\f\5\f\u00c4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00d8\n\16\f\16\16\16\u00db\13\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e5\n\17\f\17\16\17\u00e8\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f0\n\20\f\20\16\20\u00f3\13\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0106\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0111\n\22\f\22\16\22\u0114\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u011f\n\23\f\23\16\23\u0122\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u012d\n\24\f\24\16\24\u0130\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0139\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0140\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0149"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\7\30\u0150\n\30\f\30\16\30\u0153\13\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\2\7\34\36\"$&\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2),\2\u0179\2"+
		"\62\3\2\2\2\4?\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nV\3\2\2\2\f^\3\2\2\2\16"+
		"e\3\2\2\2\20i\3\2\2\2\22y\3\2\2\2\24\u0084\3\2\2\2\26\u00c3\3\2\2\2\30"+
		"\u00d0\3\2\2\2\32\u00d2\3\2\2\2\34\u00de\3\2\2\2\36\u00e9\3\2\2\2 \u0105"+
		"\3\2\2\2\"\u0107\3\2\2\2$\u0115\3\2\2\2&\u0123\3\2\2\2(\u0138\3\2\2\2"+
		"*\u013f\3\2\2\2,\u0148\3\2\2\2.\u014a\3\2\2\2\60\u0157\3\2\2\2\62\63\7"+
		"\3\2\2\63\64\7-\2\2\64:\7\5\2\2\659\5\4\3\2\669\5\f\7\2\679\5\20\t\28"+
		"\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3"+
		"\2\2\2<:\3\2\2\2=>\5\24\13\2>\3\3\2\2\2?@\5\6\4\2@A\7\7\2\2AB\5\b\5\2"+
		"BC\7\5\2\2C\5\3\2\2\2DE\7\t\2\2EM\b\4\1\2FG\7\n\2\2GM\b\4\1\2HI\7\13\2"+
		"\2IM\b\4\1\2JK\7\f\2\2KM\b\4\1\2LD\3\2\2\2LF\3\2\2\2LH\3\2\2\2LJ\3\2\2"+
		"\2M\7\3\2\2\2NS\7-\2\2OP\7\6\2\2PR\7-\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2\2V[\7-\2\2WX\7\6\2\2XZ\7-\2\2YW\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\13\3\2\2\2][\3\2\2\2^_\7\16\2\2_`"+
		"\5\6\4\2`a\7-\2\2ab\7\b\2\2bc\5\16\b\2cd\7\5\2\2d\r\3\2\2\2ef\t\2\2\2"+
		"f\17\3\2\2\2gj\5\6\4\2hj\7\r\2\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7-\2"+
		"\2lm\7\21\2\2mn\5\22\n\2no\7\22\2\2os\7\17\2\2pt\5\26\f\2qt\5\4\3\2rt"+
		"\5\f\7\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v"+
		"w\3\2\2\2wx\7\20\2\2x\21\3\2\2\2yz\5\6\4\2z\u0081\7-\2\2{|\7\6\2\2|}\5"+
		"\6\4\2}~\7-\2\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0085\7\4\2\2\u0085\u0089\7\17\2\2\u0086\u008a\5\26\f\2\u0087\u008a"+
		"\5\4\3\2\u0088\u008a\5\f\7\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\20\2\2\u008e\25\3\2\2\2\u008f\u0090"+
		"\7\24\2\2\u0090\u0091\7\21\2\2\u0091\u0092\5\34\17\2\u0092\u0093\7\22"+
		"\2\2\u0093\u0095\7\17\2\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u00a3\7\20\2\2\u009a\u009b\7\25\2\2\u009b\u009d\7\17\2\2\u009c"+
		"\u009e\5\26\f\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00c4\3\2"+
		"\2\2\u00a5\u00a6\7\26\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8\5\30\r\2\u00a8"+
		"\u00a9\5\34\17\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac"+
		"\7\22\2\2\u00ac\u00b0\7\17\2\2\u00ad\u00af\5\26\f\2\u00ae\u00ad\3\2\2"+
		"\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00c4\3\2\2\2"+
		"\u00b5\u00c4\5\f\7\2\u00b6\u00c4\5\30\r\2\u00b7\u00b8\5\34\17\2\u00b8"+
		"\u00b9\7\5\2\2\u00b9\u00c4\3\2\2\2\u00ba\u00c4\5.\30\2\u00bb\u00c4\5\60"+
		"\31\2\u00bc\u00bd\7\27\2\2\u00bd\u00c4\7\5\2\2\u00be\u00c0\7\23\2\2\u00bf"+
		"\u00c1\5\34\17\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c4\7\5\2\2\u00c3\u008f\3\2\2\2\u00c3\u00a5\3\2\2\2\u00c3"+
		"\u00b5\3\2\2\2\u00c3\u00b6\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2"+
		"\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4"+
		"\27\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5\34\17"+
		"\2\u00c8\u00c9\7\5\2\2\u00c9\u00d1\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc"+
		"\7\32\2\2\u00cc\u00d1\7\5\2\2\u00cd\u00ce\7-\2\2\u00ce\u00cf\7\33\2\2"+
		"\u00cf\u00d1\7\5\2\2\u00d0\u00c5\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd"+
		"\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3\u00d4\7\21\2\2\u00d4"+
		"\u00d9\5\34\17\2\u00d5\u00d6\7\6\2\2\u00d6\u00d8\5\34\17\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\22\2\2\u00dd\33\3\2\2"+
		"\2\u00de\u00df\b\17\1\2\u00df\u00e0\5\36\20\2\u00e0\u00e6\3\2\2\2\u00e1"+
		"\u00e2\f\4\2\2\u00e2\u00e3\7\'\2\2\u00e3\u00e5\5\36\20\2\u00e4\u00e1\3"+
		"\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\35\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\b\20\1\2\u00ea\u00eb\5 \21"+
		"\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7(\2\2\u00ee\u00f0"+
		"\5 \21\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\5\"\22"+
		"\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\5\"\22\2\u00f7\u0106\3\2\2\2\u00f8\u00f9"+
		"\5\"\22\2\u00f9\u00fa\7&\2\2\u00fa\u00fb\5\"\22\2\u00fb\u0106\3\2\2\2"+
		"\u00fc\u00fd\5\"\22\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0106"+
		"\3\2\2\2\u0100\u0101\5\"\22\2\u0101\u0102\7#\2\2\u0102\u0103\5\"\22\2"+
		"\u0103\u0106\3\2\2\2\u0104\u0106\5\"\22\2\u0105\u00f4\3\2\2\2\u0105\u00f8"+
		"\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"!\3\2\2\2\u0107\u0108\b\22\1\2\u0108\u0109\5$\23\2\u0109\u0112\3\2\2\2"+
		"\u010a\u010b\f\5\2\2\u010b\u010c\7 \2\2\u010c\u0111\5$\23\2\u010d\u010e"+
		"\f\4\2\2\u010e\u010f\7!\2\2\u010f\u0111\5$\23\2\u0110\u010a\3\2\2\2\u0110"+
		"\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113#\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\b\23\1\2\u0116\u0117"+
		"\5&\24\2\u0117\u0120\3\2\2\2\u0118\u0119\f\5\2\2\u0119\u011a\7\34\2\2"+
		"\u011a\u011f\5&\24\2\u011b\u011c\f\4\2\2\u011c\u011d\7\35\2\2\u011d\u011f"+
		"\5&\24\2\u011e\u0118\3\2\2\2\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121%\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0123\u0124\b\24\1\2\u0124\u0125\5(\25\2\u0125\u012e\3\2\2\2\u0126\u0127"+
		"\f\5\2\2\u0127\u0128\7\36\2\2\u0128\u012d\5(\25\2\u0129\u012a\f\4\2\2"+
		"\u012a\u012b\7\37\2\2\u012b\u012d\5(\25\2\u012c\u0126\3\2\2\2\u012c\u0129"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\'\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5*\26\2\u0132\u0133\7\32\2"+
		"\2\u0133\u0139\3\2\2\2\u0134\u0135\5*\26\2\u0135\u0136\7\33\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0139\5*\26\2\u0138\u0131\3\2\2\2\u0138\u0134\3\2"+
		"\2\2\u0138\u0137\3\2\2\2\u0139)\3\2\2\2\u013a\u013b\7\"\2\2\u013b\u0140"+
		"\5,\27\2\u013c\u013d\7\35\2\2\u013d\u0140\5,\27\2\u013e\u0140\5,\27\2"+
		"\u013f\u013a\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013e\3\2\2\2\u0140+\3"+
		"\2\2\2\u0141\u0149\5\32\16\2\u0142\u0149\5\16\b\2\u0143\u0144\7\21\2\2"+
		"\u0144\u0145\5\34\17\2\u0145\u0146\7\22\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0149\7-\2\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2"+
		"\2\2\u0148\u0147\3\2\2\2\u0149-\3\2\2\2\u014a\u014b\7\30\2\2\u014b\u014c"+
		"\7\21\2\2\u014c\u0151\5\34\17\2\u014d\u014e\7\6\2\2\u014e\u0150\5\34\17"+
		"\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\22\2\2"+
		"\u0155\u0156\7\5\2\2\u0156/\3\2\2\2\u0157\u0158\7\31\2\2\u0158\u0159\7"+
		"\21\2\2\u0159\u015a\5\n\6\2\u015a\u015b\7\22\2\2\u015b\u015c\7\5\2\2\u015c"+
		"\61\3\2\2\2\"8:LS[isu\u0081\u0089\u008b\u0097\u009f\u00a3\u00b0\u00c0"+
		"\u00c3\u00d0\u00d9\u00e6\u00f1\u0105\u0110\u0112\u011e\u0120\u012c\u012e"+
		"\u0138\u013f\u0148\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
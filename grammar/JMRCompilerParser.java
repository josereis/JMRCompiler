package grammar;

// Generated from JMRCompiler.g4 by ANTLR 4.7

        import java.util.HashMap;
        import java.util.Map;
        
       import models.ObjectSymbolTable;

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
		RULE_programa = 0, RULE_decVars = 1, RULE_tipo = 2, RULE_tipoF = 3, RULE_listaIDs = 4, 
		RULE_listaIDs2 = 5, RULE_decConsts = 6, RULE_valor = 7, RULE_decFuncs = 8, 
		RULE_parametro = 9, RULE_lista_parametros = 10, RULE_main = 11, RULE_comandos = 12, 
		RULE_atrib = 13, RULE_funcao = 14, RULE_bool = 15, RULE_join = 16, RULE_rel = 17, 
		RULE_equality = 18, RULE_expr = 19, RULE_term = 20, RULE_unary = 21, RULE_factor = 22, 
		RULE_print = 23, RULE_read = 24;
	public static final String[] ruleNames = {
		"programa", "decVars", "tipo", "tipoF", "listaIDs", "listaIDs2", "decConsts", 
		"valor", "decFuncs", "parametro", "lista_parametros", "main", "comandos", 
		"atrib", "funcao", "bool", "join", "rel", "equality", "expr", "term", 
		"unary", "factor", "print", "read"
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

	   
	        Map<String, ObjectSymbolTable> SymbolTable = new HashMap<String, ObjectSymbolTable>();

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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(Tk_Class);
			setState(51);
			match(ID);
			setState(52);
			match(Tk_PtVirg);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					decVars();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Final) {
				{
				{
				setState(59);
				decConsts();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float) | (1L << Tk_Void))) != 0)) {
				{
				{
				setState(65);
				decFuncs();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(73);
			((DecVarsContext)_localctx).tipo = tipo();
			setState(74);
			match(Tk_DoisPt);
			setState(75);
			listaIDs(((DecVarsContext)_localctx).tipo.type);
			setState(76);
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
		public int type;
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(Tk_Int);
				((TipoContext)_localctx).type =  1;
				}
				break;
			case Tk_Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(Tk_Float);
				((TipoContext)_localctx).type =  2;
				}
				break;
			case Tk_Str:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(Tk_Str);
				((TipoContext)_localctx).type =  3;
				}
				break;
			case Tk_Bool:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(Tk_Bool);
				((TipoContext)_localctx).type =  4;
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

	public static class TipoFContext extends ParserRuleContext {
		public int type;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterTipoF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitTipoF(this);
		}
	}

	public final TipoFContext tipoF() throws RecognitionException {
		TipoFContext _localctx = new TipoFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipoF);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Int:
			case Tk_Str:
			case Tk_Bool:
			case Tk_Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((TipoFContext)_localctx).tipo = tipo();
				((TipoFContext)_localctx).type =  ((TipoFContext)_localctx).tipo.type;
				}
				break;
			case Tk_Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(Tk_Void);
				((TipoFContext)_localctx).type =  0;
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
		public int type;
		public List<TerminalNode> ID() { return getTokens(JMRCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JMRCompilerParser.ID, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListaIDsContext(ParserRuleContext parent, int invokingState, int type) {
			super(parent, invokingState);
			this.type = type;
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

	public final ListaIDsContext listaIDs(int type) throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState(), type);
		enterRule(_localctx, 8, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(96);
				match(Tk_Virg);
				setState(97);
				match(ID);
				}
				}
				setState(102);
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
		enterRule(_localctx, 10, RULE_listaIDs2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(104);
				match(Tk_Virg);
				setState(105);
				match(ID);
				}
				}
				setState(110);
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
		enterRule(_localctx, 12, RULE_decConsts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Tk_Final);
			setState(112);
			tipo();
			setState(113);
			match(ID);
			setState(114);
			match(Tk_Eq);
			setState(115);
			valor();
			setState(116);
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
		public int type;
		public Object value;
		public Token INT;
		public Token REAL;
		public Token STRING;
		public Token BOOLEAN;
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
		enterRule(_localctx, 14, RULE_valor);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((ValorContext)_localctx).INT = match(INT);
				((ValorContext)_localctx).type =  1; ((ValorContext)_localctx).value =  Integer.parseInt((((ValorContext)_localctx).INT!=null?((ValorContext)_localctx).INT.getText():null));
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				((ValorContext)_localctx).REAL = match(REAL);
				((ValorContext)_localctx).type =  2; ((ValorContext)_localctx).value =  Float.parseFloat((((ValorContext)_localctx).REAL!=null?((ValorContext)_localctx).REAL.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				((ValorContext)_localctx).STRING = match(STRING);
				((ValorContext)_localctx).type =  3; ((ValorContext)_localctx).value =  (((ValorContext)_localctx).STRING!=null?((ValorContext)_localctx).STRING.getText():null);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				((ValorContext)_localctx).BOOLEAN = match(BOOLEAN);
				((ValorContext)_localctx).type =  4;
				     			if(((((ValorContext)_localctx).BOOLEAN!=null?((ValorContext)_localctx).BOOLEAN.getText():null)).equals("true"))
				     				((ValorContext)_localctx).value =  true;
				     			else
				     				((ValorContext)_localctx).value =  false;
				     			
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

	public static class DecFuncsContext extends ParserRuleContext {
		public TipoFContext tipoF() {
			return getRuleContext(TipoFContext.class,0);
		}
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
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
		enterRule(_localctx, 16, RULE_decFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			tipoF();
			setState(129);
			match(ID);
			setState(130);
			match(Tk_AbrePar);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float))) != 0)) {
				{
				setState(131);
				lista_parametros();
				}
			}

			setState(134);
			match(Tk_FechaPar);
			setState(135);
			match(Tk_AbreChave);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float))) != 0)) {
				{
				{
				setState(136);
				decVars();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				comandos();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
			setState(147);
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			tipo();
			setState(150);
			match(ID);
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
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
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
		enterRule(_localctx, 20, RULE_lista_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			parametro();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(153);
				match(Tk_Virg);
				setState(154);
				parametro();
				}
				}
				setState(159);
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
		enterRule(_localctx, 22, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(Tk_Main);
			setState(161);
			match(Tk_AbreChave);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				comandos();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
			setState(167);
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
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
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
		enterRule(_localctx, 24, RULE_comandos);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(Tk_If);
				setState(170);
				match(Tk_AbrePar);
				setState(171);
				bool(0);
				setState(172);
				match(Tk_FechaPar);
				setState(173);
				match(Tk_AbreChave);
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					comandos();
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
				setState(179);
				match(Tk_FechChave);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_Else) {
					{
					setState(180);
					match(Tk_Else);
					setState(181);
					match(Tk_AbreChave);
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(182);
						comandos();
						}
						}
						setState(185); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
					setState(187);
					match(Tk_FechChave);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(Tk_For);
				setState(192);
				match(Tk_AbrePar);
				setState(193);
				atrib();
				setState(194);
				bool(0);
				setState(195);
				match(Tk_PtVirg);
				setState(196);
				bool(0);
				setState(197);
				match(Tk_FechaPar);
				setState(198);
				match(Tk_AbreChave);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0)) {
					{
					{
					setState(199);
					comandos();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(Tk_FechChave);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				atrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				funcao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				read();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(Tk_Break);
				setState(212);
				match(Tk_PtVirg);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(213);
				match(Tk_Return);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(214);
					bool(0);
					}
				}

				setState(217);
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
		enterRule(_localctx, 26, RULE_atrib);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(ID);
				setState(221);
				match(Tk_Eq);
				setState(222);
				bool(0);
				setState(223);
				match(Tk_PtVirg);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(ID);
				setState(226);
				match(Tk_Inc);
				setState(227);
				match(Tk_PtVirg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(ID);
				setState(229);
				match(Tk_Dec);
				setState(230);
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
		enterRule(_localctx, 28, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ID);
			setState(234);
			match(Tk_AbrePar);
			setState(235);
			bool(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(236);
				match(Tk_Virg);
				setState(237);
				bool(0);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			join(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool);
					setState(248);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(249);
					match(Tk_Ou);
					setState(250);
					join(0);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_join, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_join);
					setState(259);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(260);
					match(Tk_E);
					setState(261);
					rel();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 34, RULE_rel);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				equality(0);
				setState(268);
				match(Tk_Menorq);
				setState(269);
				equality(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				equality(0);
				setState(272);
				match(Tk_Menorig);
				setState(273);
				equality(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				equality(0);
				setState(276);
				match(Tk_Maiorig);
				setState(277);
				equality(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				equality(0);
				setState(280);
				match(Tk_Maiorq);
				setState(281);
				equality(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(289);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(290);
						match(Tk_Equal);
						setState(291);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(292);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(293);
						match(Tk_Dif);
						setState(294);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(299);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(301);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						match(Tk_Soma);
						setState(305);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						match(Tk_Sub);
						setState(308);
						term(0);
						}
						break;
					}
					} 
				}
				setState(313);
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

	public static class TermContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(315);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						match(Tk_Mult);
						setState(319);
						unary();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(320);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(321);
						match(Tk_Div);
						setState(322);
						unary();
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 42, RULE_unary);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Diff:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(Tk_Diff);
				setState(329);
				factor();
				}
				break;
			case Tk_Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(Tk_Sub);
				setState(331);
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
				setState(332);
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
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(Tk_AbrePar);
				setState(338);
				bool(0);
				setState(339);
				match(Tk_FechaPar);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
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
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(Tk_Print);
			setState(345);
			match(Tk_AbrePar);
			setState(346);
			bool(0);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(347);
				match(Tk_Virg);
				setState(348);
				bool(0);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(Tk_FechaPar);
			setState(355);
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
		enterRule(_localctx, 48, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Tk_Read);
			setState(358);
			match(Tk_AbrePar);
			setState(359);
			listaIDs2();
			setState(360);
			match(Tk_FechaPar);
			setState(361);
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
		case 15:
			return bool_sempred((BoolContext)_localctx, predIndex);
		case 16:
			return join_sempred((JoinContext)_localctx, predIndex);
		case 18:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u016e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3"+
		"\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t"+
		"\3\n\3\n\3\n\3\n\5\n\u0087\n\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f"+
		"\13\n\3\n\6\n\u0092\n\n\r\n\16\n\u0093\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r\3\r\3\r\6\r\u00a6\n\r\r\r\16"+
		"\r\u00a7\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00b2\n\16\r\16\16"+
		"\16\u00b3\3\16\3\16\3\16\3\16\6\16\u00ba\n\16\r\16\16\16\u00bb\3\16\3"+
		"\16\5\16\u00c0\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00cb\n\16\f\16\16\16\u00ce\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00da\n\16\3\16\5\16\u00dd\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00fe\n\21\f\21\16\21\u0101\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0109\n\22\f\22\16\22\u010c\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u011f\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u012a\n\24\f\24\16\24\u012d\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0138\n\25\f\25\16\25\u013b\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0146\n\26\f\26\16\26\u0149\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0150\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0159\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u0160\n\31\f\31\16\31\u0163"+
		"\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\7 \"&(*\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\2\u0186\2\64"+
		"\3\2\2\2\4K\3\2\2\2\6X\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\fi\3\2\2\2\16q\3"+
		"\2\2\2\20\u0080\3\2\2\2\22\u0082\3\2\2\2\24\u0097\3\2\2\2\26\u009a\3\2"+
		"\2\2\30\u00a2\3\2\2\2\32\u00dc\3\2\2\2\34\u00e9\3\2\2\2\36\u00eb\3\2\2"+
		"\2 \u00f7\3\2\2\2\"\u0102\3\2\2\2$\u011e\3\2\2\2&\u0120\3\2\2\2(\u012e"+
		"\3\2\2\2*\u013c\3\2\2\2,\u014f\3\2\2\2.\u0158\3\2\2\2\60\u015a\3\2\2\2"+
		"\62\u0167\3\2\2\2\64\65\7\3\2\2\65\66\7-\2\2\66:\7\5\2\2\679\5\4\3\28"+
		"\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5\16\b"+
		"\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AF\3\2\2\2B@\3\2\2\2CE\5\22"+
		"\n\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\30"+
		"\r\2J\3\3\2\2\2KL\5\6\4\2LM\7\7\2\2MN\5\n\6\2NO\7\5\2\2O\5\3\2\2\2PQ\7"+
		"\t\2\2QY\b\4\1\2RS\7\f\2\2SY\b\4\1\2TU\7\n\2\2UY\b\4\1\2VW\7\13\2\2WY"+
		"\b\4\1\2XP\3\2\2\2XR\3\2\2\2XT\3\2\2\2XV\3\2\2\2Y\7\3\2\2\2Z[\5\6\4\2"+
		"[\\\b\5\1\2\\`\3\2\2\2]^\7\r\2\2^`\b\5\1\2_Z\3\2\2\2_]\3\2\2\2`\t\3\2"+
		"\2\2af\7-\2\2bc\7\6\2\2ce\7-\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\13\3\2\2\2hf\3\2\2\2in\7-\2\2jk\7\6\2\2km\7-\2\2lj\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2o\r\3\2\2\2pn\3\2\2\2qr\7\16\2\2rs\5\6\4\2st\7-"+
		"\2\2tu\7\b\2\2uv\5\20\t\2vw\7\5\2\2w\17\3\2\2\2xy\7*\2\2y\u0081\b\t\1"+
		"\2z{\7+\2\2{\u0081\b\t\1\2|}\7)\2\2}\u0081\b\t\1\2~\177\7,\2\2\177\u0081"+
		"\b\t\1\2\u0080x\3\2\2\2\u0080z\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\21\3\2\2\2\u0082\u0083\5\b\5\2\u0083\u0084\7-\2\2\u0084\u0086\7\21\2"+
		"\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7\22\2\2\u0089\u008d\7\17\2\2\u008a\u008c\5"+
		"\4\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\5\32"+
		"\16\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\20\2\2\u0096\23\3\2\2"+
		"\2\u0097\u0098\5\6\4\2\u0098\u0099\7-\2\2\u0099\25\3\2\2\2\u009a\u009f"+
		"\5\24\13\2\u009b\u009c\7\6\2\2\u009c\u009e\5\24\13\2\u009d\u009b\3\2\2"+
		"\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\27"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\7\17\2\2"+
		"\u00a4\u00a6\5\32\16\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\20\2\2"+
		"\u00aa\31\3\2\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae"+
		"\5 \21\2\u00ae\u00af\7\22\2\2\u00af\u00b1\7\17\2\2\u00b0\u00b2\5\32\16"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bf\7\20\2\2\u00b6\u00b7\7\25\2\2"+
		"\u00b7\u00b9\7\17\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\7\20\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00dd\3\2\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00c3\7"+
		"\21\2\2\u00c3\u00c4\5\34\17\2\u00c4\u00c5\5 \21\2\u00c5\u00c6\7\5\2\2"+
		"\u00c6\u00c7\5 \21\2\u00c7\u00c8\7\22\2\2\u00c8\u00cc\7\17\2\2\u00c9\u00cb"+
		"\5\32\16\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\7\20\2\2\u00d0\u00dd\3\2\2\2\u00d1\u00dd\5\34\17\2\u00d2\u00dd\5\36\20"+
		"\2\u00d3\u00dd\5\60\31\2\u00d4\u00dd\5\62\32\2\u00d5\u00d6\7\27\2\2\u00d6"+
		"\u00dd\7\5\2\2\u00d7\u00d9\7\23\2\2\u00d8\u00da\5 \21\2\u00d9\u00d8\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\7\5\2\2\u00dc"+
		"\u00ab\3\2\2\2\u00dc\u00c1\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d2\3\2"+
		"\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc"+
		"\u00d7\3\2\2\2\u00dd\33\3\2\2\2\u00de\u00df\7-\2\2\u00df\u00e0\7\b\2\2"+
		"\u00e0\u00e1\5 \21\2\u00e1\u00e2\7\5\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00e4"+
		"\7-\2\2\u00e4\u00e5\7\32\2\2\u00e5\u00ea\7\5\2\2\u00e6\u00e7\7-\2\2\u00e7"+
		"\u00e8\7\33\2\2\u00e8\u00ea\7\5\2\2\u00e9\u00de\3\2\2\2\u00e9\u00e3\3"+
		"\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\35\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed"+
		"\7\21\2\2\u00ed\u00f2\5 \21\2\u00ee\u00ef\7\6\2\2\u00ef\u00f1\5 \21\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\22\2\2"+
		"\u00f6\37\3\2\2\2\u00f7\u00f8\b\21\1\2\u00f8\u00f9\5\"\22\2\u00f9\u00ff"+
		"\3\2\2\2\u00fa\u00fb\f\4\2\2\u00fb\u00fc\7\'\2\2\u00fc\u00fe\5\"\22\2"+
		"\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100!\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\b\22\1\2\u0103"+
		"\u0104\5$\23\2\u0104\u010a\3\2\2\2\u0105\u0106\f\4\2\2\u0106\u0107\7("+
		"\2\2\u0107\u0109\5$\23\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b#\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u010e\5&\24\2\u010e\u010f\7$\2\2\u010f\u0110\5&\24\2\u0110\u011f"+
		"\3\2\2\2\u0111\u0112\5&\24\2\u0112\u0113\7&\2\2\u0113\u0114\5&\24\2\u0114"+
		"\u011f\3\2\2\2\u0115\u0116\5&\24\2\u0116\u0117\7%\2\2\u0117\u0118\5&\24"+
		"\2\u0118\u011f\3\2\2\2\u0119\u011a\5&\24\2\u011a\u011b\7#\2\2\u011b\u011c"+
		"\5&\24\2\u011c\u011f\3\2\2\2\u011d\u011f\5&\24\2\u011e\u010d\3\2\2\2\u011e"+
		"\u0111\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f%\3\2\2\2\u0120\u0121\b\24\1\2\u0121\u0122\5(\25\2\u0122\u012b"+
		"\3\2\2\2\u0123\u0124\f\5\2\2\u0124\u0125\7 \2\2\u0125\u012a\5(\25\2\u0126"+
		"\u0127\f\4\2\2\u0127\u0128\7!\2\2\u0128\u012a\5(\25\2\u0129\u0123\3\2"+
		"\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\'\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\b\25\1"+
		"\2\u012f\u0130\5*\26\2\u0130\u0139\3\2\2\2\u0131\u0132\f\5\2\2\u0132\u0133"+
		"\7\34\2\2\u0133\u0138\5*\26\2\u0134\u0135\f\4\2\2\u0135\u0136\7\35\2\2"+
		"\u0136\u0138\5*\26\2\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a)\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\b\26\1\2\u013d\u013e\5,\27\2\u013e\u0147\3"+
		"\2\2\2\u013f\u0140\f\5\2\2\u0140\u0141\7\36\2\2\u0141\u0146\5,\27\2\u0142"+
		"\u0143\f\4\2\2\u0143\u0144\7\37\2\2\u0144\u0146\5,\27\2\u0145\u013f\3"+
		"\2\2\2\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148+\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\"\2\2"+
		"\u014b\u0150\5.\30\2\u014c\u014d\7\35\2\2\u014d\u0150\5.\30\2\u014e\u0150"+
		"\5.\30\2\u014f\u014a\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"-\3\2\2\2\u0151\u0159\5\36\20\2\u0152\u0159\5\20\t\2\u0153\u0154\7\21"+
		"\2\2\u0154\u0155\5 \21\2\u0155\u0156\7\22\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0159\7-\2\2\u0158\u0151\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2"+
		"\2\2\u0158\u0157\3\2\2\2\u0159/\3\2\2\2\u015a\u015b\7\30\2\2\u015b\u015c"+
		"\7\21\2\2\u015c\u0161\5 \21\2\u015d\u015e\7\6\2\2\u015e\u0160\5 \21\2"+
		"\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\22\2\2"+
		"\u0165\u0166\7\5\2\2\u0166\61\3\2\2\2\u0167\u0168\7\31\2\2\u0168\u0169"+
		"\7\21\2\2\u0169\u016a\5\f\7\2\u016a\u016b\7\22\2\2\u016b\u016c\7\5\2\2"+
		"\u016c\63\3\2\2\2#:@FX_fn\u0080\u0086\u008d\u0093\u009f\u00a7\u00b3\u00bb"+
		"\u00bf\u00cc\u00d9\u00dc\u00e9\u00f2\u00ff\u010a\u011e\u0129\u012b\u0137"+
		"\u0139\u0145\u0147\u014f\u0158\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
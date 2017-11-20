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
		RULE_lista_parametros = 9, RULE_main = 10, RULE_comandos = 11, RULE_atrib = 12, 
		RULE_funcao = 13, RULE_bool = 14, RULE_join = 15, RULE_rel = 16, RULE_equality = 17, 
		RULE_expr = 18, RULE_term = 19, RULE_unary = 20, RULE_factor = 21, RULE_print = 22, 
		RULE_read = 23;
	public static final String[] ruleNames = {
		"programa", "decVars", "tipo", "tipoF", "listaIDs", "listaIDs2", "decConsts", 
		"valor", "decFuncs", "lista_parametros", "main", "comandos", "atrib", 
		"funcao", "bool", "join", "rel", "equality", "expr", "term", "unary", 
		"factor", "print", "read"
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
			setState(48);
			match(Tk_Class);
			setState(49);
			match(ID);
			setState(50);
			match(Tk_PtVirg);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					decVars();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Final) {
				{
				{
				setState(57);
				decConsts();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float) | (1L << Tk_Void))) != 0)) {
				{
				{
				setState(63);
				decFuncs();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
			setState(71);
			((DecVarsContext)_localctx).tipo = tipo();
			setState(72);
			match(Tk_DoisPt);
			setState(73);
			listaIDs(((DecVarsContext)_localctx).tipo.type);
			setState(74);
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Tk_Int);
				((TipoContext)_localctx).type =  1;
				}
				break;
			case Tk_Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(Tk_Float);
				((TipoContext)_localctx).type =  2;
				}
				break;
			case Tk_Str:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(Tk_Str);
				((TipoContext)_localctx).type =  3;
				}
				break;
			case Tk_Bool:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Int:
			case Tk_Str:
			case Tk_Bool:
			case Tk_Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((TipoFContext)_localctx).tipo = tipo();
				((TipoFContext)_localctx).type =  ((TipoFContext)_localctx).tipo.type;
				}
				break;
			case Tk_Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
			setState(93);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(94);
				match(Tk_Virg);
				setState(95);
				match(ID);
				}
				}
				setState(100);
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
			setState(101);
			match(ID);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(102);
				match(Tk_Virg);
				setState(103);
				match(ID);
				}
				}
				setState(108);
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
			setState(109);
			match(Tk_Final);
			setState(110);
			tipo();
			setState(111);
			match(ID);
			setState(112);
			match(Tk_Eq);
			setState(113);
			valor();
			setState(114);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((ValorContext)_localctx).INT = match(INT);
				((ValorContext)_localctx).type =  1; ((ValorContext)_localctx).value =  Integer.parseInt((((ValorContext)_localctx).INT!=null?((ValorContext)_localctx).INT.getText():null));
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((ValorContext)_localctx).REAL = match(REAL);
				((ValorContext)_localctx).type =  2; ((ValorContext)_localctx).value =  Float.parseFloat((((ValorContext)_localctx).REAL!=null?((ValorContext)_localctx).REAL.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				((ValorContext)_localctx).STRING = match(STRING);
				((ValorContext)_localctx).type =  3; ((ValorContext)_localctx).value =  (((ValorContext)_localctx).STRING!=null?((ValorContext)_localctx).STRING.getText():null);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
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
		public List<DecConstsContext> decConsts() {
			return getRuleContexts(DecConstsContext.class);
		}
		public DecConstsContext decConsts(int i) {
			return getRuleContext(DecConstsContext.class,i);
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
			setState(126);
			tipoF();
			setState(127);
			match(ID);
			setState(128);
			match(Tk_AbrePar);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float))) != 0)) {
				{
				setState(129);
				lista_parametros();
				}
			}

			setState(132);
			match(Tk_FechaPar);
			setState(133);
			match(Tk_AbreChave);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float))) != 0)) {
				{
				{
				setState(134);
				decVars();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Final) {
				{
				{
				setState(140);
				decConsts();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
			setState(151);
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
		enterRule(_localctx, 18, RULE_lista_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			tipo();
			setState(154);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(155);
				match(Tk_Virg);
				setState(156);
				tipo();
				setState(157);
				match(ID);
				}
				}
				setState(163);
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
		enterRule(_localctx, 20, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Tk_Main);
			setState(165);
			match(Tk_AbreChave);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				comandos();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
			setState(171);
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
		enterRule(_localctx, 22, RULE_comandos);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(Tk_If);
				setState(174);
				match(Tk_AbrePar);
				setState(175);
				bool(0);
				setState(176);
				match(Tk_FechaPar);
				setState(177);
				match(Tk_AbreChave);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					comandos();
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
				setState(183);
				match(Tk_FechChave);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_Else) {
					{
					setState(184);
					match(Tk_Else);
					setState(185);
					match(Tk_AbreChave);
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(186);
						comandos();
						}
						}
						setState(189); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
					setState(191);
					match(Tk_FechChave);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(Tk_For);
				setState(196);
				match(Tk_AbrePar);
				setState(197);
				atrib();
				setState(198);
				bool(0);
				setState(199);
				match(Tk_PtVirg);
				setState(200);
				bool(0);
				setState(201);
				match(Tk_FechaPar);
				setState(202);
				match(Tk_AbreChave);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0)) {
					{
					{
					setState(203);
					comandos();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(Tk_FechChave);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				atrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				funcao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				read();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				match(Tk_Break);
				setState(216);
				match(Tk_PtVirg);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(Tk_Return);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(218);
					bool(0);
					}
				}

				setState(221);
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
		enterRule(_localctx, 24, RULE_atrib);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(ID);
				setState(225);
				match(Tk_Eq);
				setState(226);
				bool(0);
				setState(227);
				match(Tk_PtVirg);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(ID);
				setState(230);
				match(Tk_Inc);
				setState(231);
				match(Tk_PtVirg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(ID);
				setState(233);
				match(Tk_Dec);
				setState(234);
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
		enterRule(_localctx, 26, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			setState(238);
			match(Tk_AbrePar);
			setState(239);
			bool(0);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(240);
				match(Tk_Virg);
				setState(241);
				bool(0);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			join(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool);
					setState(252);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(253);
					match(Tk_Ou);
					setState(254);
					join(0);
					}
					} 
				}
				setState(259);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_join, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(261);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_join);
					setState(263);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(264);
					match(Tk_E);
					setState(265);
					rel();
					}
					} 
				}
				setState(270);
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
		enterRule(_localctx, 32, RULE_rel);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				equality(0);
				setState(272);
				match(Tk_Menorq);
				setState(273);
				equality(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				equality(0);
				setState(276);
				match(Tk_Menorig);
				setState(277);
				equality(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				equality(0);
				setState(280);
				match(Tk_Maiorig);
				setState(281);
				equality(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				equality(0);
				setState(284);
				match(Tk_Maiorq);
				setState(285);
				equality(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(293);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(294);
						match(Tk_Equal);
						setState(295);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(296);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(297);
						match(Tk_Dif);
						setState(298);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(308);
						match(Tk_Soma);
						setState(309);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						match(Tk_Sub);
						setState(312);
						term(0);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(321);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(322);
						match(Tk_Mult);
						setState(323);
						unary();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(325);
						match(Tk_Div);
						setState(326);
						unary();
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 40, RULE_unary);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Diff:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(Tk_Diff);
				setState(333);
				factor();
				}
				break;
			case Tk_Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(Tk_Sub);
				setState(335);
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
				setState(336);
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
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(Tk_AbrePar);
				setState(342);
				bool(0);
				setState(343);
				match(Tk_FechaPar);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
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
			setState(348);
			match(Tk_Print);
			setState(349);
			match(Tk_AbrePar);
			setState(350);
			bool(0);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(351);
				match(Tk_Virg);
				setState(352);
				bool(0);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(Tk_FechaPar);
			setState(359);
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
			setState(361);
			match(Tk_Read);
			setState(362);
			match(Tk_AbrePar);
			setState(363);
			listaIDs2();
			setState(364);
			match(Tk_FechaPar);
			setState(365);
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
		case 14:
			return bool_sempred((BoolContext)_localctx, predIndex);
		case 15:
			return join_sempred((JoinContext)_localctx, predIndex);
		case 17:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0172\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3"+
		"\n\3\n\5\n\u0085\n\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3\n"+
		"\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3\n\6\n\u0096\n\n\r\n\16\n\u0097\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5"+
		"\13\13\3\f\3\f\3\f\6\f\u00aa\n\f\r\f\16\f\u00ab\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\6\r\u00b6\n\r\r\r\16\r\u00b7\3\r\3\r\3\r\3\r\6\r\u00be\n\r"+
		"\r\r\16\r\u00bf\3\r\3\r\5\r\u00c4\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00de\n\r\3\r\5\r\u00e1\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00ee\n\16\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00f5\n\17\f\17\16\17\u00f8\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0102\n\20\f\20\16\20\u0105\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u010d\n\21\f\21\16\21\u0110\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0123"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u012e\n\23\f\23"+
		"\16\23\u0131\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u013c"+
		"\n\24\f\24\16\24\u013f\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u014a\n\25\f\25\16\25\u014d\13\25\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u0154\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u015d\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0164\n\30\f\30\16\30\u0167\13\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\2\7\36 $&(\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\2\u018c\2\62\3\2\2\2\4I\3\2\2"+
		"\2\6V\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fg\3\2\2\2\16o\3\2\2\2\20~\3\2\2\2"+
		"\22\u0080\3\2\2\2\24\u009b\3\2\2\2\26\u00a6\3\2\2\2\30\u00e0\3\2\2\2\32"+
		"\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u00fb\3\2\2\2 \u0106\3\2\2\2\"\u0122"+
		"\3\2\2\2$\u0124\3\2\2\2&\u0132\3\2\2\2(\u0140\3\2\2\2*\u0153\3\2\2\2,"+
		"\u015c\3\2\2\2.\u015e\3\2\2\2\60\u016b\3\2\2\2\62\63\7\3\2\2\63\64\7-"+
		"\2\2\648\7\5\2\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\28"+
		"9\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\16\b\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\5\22\n\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\5\26\f\2H\3\3\2\2\2IJ\5\6\4\2JK\7\7"+
		"\2\2KL\5\n\6\2LM\7\5\2\2M\5\3\2\2\2NO\7\t\2\2OW\b\4\1\2PQ\7\f\2\2QW\b"+
		"\4\1\2RS\7\n\2\2SW\b\4\1\2TU\7\13\2\2UW\b\4\1\2VN\3\2\2\2VP\3\2\2\2VR"+
		"\3\2\2\2VT\3\2\2\2W\7\3\2\2\2XY\5\6\4\2YZ\b\5\1\2Z^\3\2\2\2[\\\7\r\2\2"+
		"\\^\b\5\1\2]X\3\2\2\2][\3\2\2\2^\t\3\2\2\2_d\7-\2\2`a\7\6\2\2ac\7-\2\2"+
		"b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\13\3\2\2\2fd\3\2\2\2gl\7-\2"+
		"\2hi\7\6\2\2ik\7-\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\r\3\2\2"+
		"\2nl\3\2\2\2op\7\16\2\2pq\5\6\4\2qr\7-\2\2rs\7\b\2\2st\5\20\t\2tu\7\5"+
		"\2\2u\17\3\2\2\2vw\7*\2\2w\177\b\t\1\2xy\7+\2\2y\177\b\t\1\2z{\7)\2\2"+
		"{\177\b\t\1\2|}\7,\2\2}\177\b\t\1\2~v\3\2\2\2~x\3\2\2\2~z\3\2\2\2~|\3"+
		"\2\2\2\177\21\3\2\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7-\2\2\u0082\u0084"+
		"\7\21\2\2\u0083\u0085\5\24\13\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0087\7\22\2\2\u0087\u008b\7\17\2\2\u0088"+
		"\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u0091\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\5\16\b\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\20\2\2\u009a"+
		"\23\3\2\2\2\u009b\u009c\5\6\4\2\u009c\u00a3\7-\2\2\u009d\u009e\7\6\2\2"+
		"\u009e\u009f\5\6\4\2\u009f\u00a0\7-\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\25\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a9\7\17\2"+
		"\2\u00a8\u00aa\5\30\r\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\20"+
		"\2\2\u00ae\27\3\2\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\7\21\2\2\u00b1"+
		"\u00b2\5\36\20\2\u00b2\u00b3\7\22\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b6"+
		"\5\30\r\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c3\7\20\2\2\u00ba\u00bb"+
		"\7\25\2\2\u00bb\u00bd\7\17\2\2\u00bc\u00be\5\30\r\2\u00bd\u00bc\3\2\2"+
		"\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00ba\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00e1\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c7"+
		"\7\21\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca\7\5"+
		"\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\7\22\2\2\u00cc\u00d0\7\17\2\2\u00cd"+
		"\u00cf\5\30\r\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\7\20\2\2\u00d4\u00e1\3\2\2\2\u00d5\u00e1\5\32\16\2\u00d6\u00e1"+
		"\5\34\17\2\u00d7\u00e1\5.\30\2\u00d8\u00e1\5\60\31\2\u00d9\u00da\7\27"+
		"\2\2\u00da\u00e1\7\5\2\2\u00db\u00dd\7\23\2\2\u00dc\u00de\5\36\20\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\5"+
		"\2\2\u00e0\u00af\3\2\2\2\u00e0\u00c5\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0"+
		"\u00d6\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00d9\3\2"+
		"\2\2\u00e0\u00db\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3\u00e4"+
		"\7\b\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7\5\2\2\u00e6\u00ee\3\2\2\2"+
		"\u00e7\u00e8\7-\2\2\u00e8\u00e9\7\32\2\2\u00e9\u00ee\7\5\2\2\u00ea\u00eb"+
		"\7-\2\2\u00eb\u00ec\7\33\2\2\u00ec\u00ee\7\5\2\2\u00ed\u00e2\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f0\7-\2\2"+
		"\u00f0\u00f1\7\21\2\2\u00f1\u00f6\5\36\20\2\u00f2\u00f3\7\6\2\2\u00f3"+
		"\u00f5\5\36\20\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7\22\2\2\u00fa\35\3\2\2\2\u00fb\u00fc\b\20\1\2\u00fc\u00fd\5 \21"+
		"\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\f\4\2\2\u00ff\u0100\7\'\2\2\u0100\u0102"+
		"\5 \21\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\37\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\b\21\1"+
		"\2\u0107\u0108\5\"\22\2\u0108\u010e\3\2\2\2\u0109\u010a\f\4\2\2\u010a"+
		"\u010b\7(\2\2\u010b\u010d\5\"\22\2\u010c\u0109\3\2\2\2\u010d\u0110\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f!\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0112\5$\23\2\u0112\u0113\7$\2\2\u0113\u0114\5$\23\2\u0114"+
		"\u0123\3\2\2\2\u0115\u0116\5$\23\2\u0116\u0117\7&\2\2\u0117\u0118\5$\23"+
		"\2\u0118\u0123\3\2\2\2\u0119\u011a\5$\23\2\u011a\u011b\7%\2\2\u011b\u011c"+
		"\5$\23\2\u011c\u0123\3\2\2\2\u011d\u011e\5$\23\2\u011e\u011f\7#\2\2\u011f"+
		"\u0120\5$\23\2\u0120\u0123\3\2\2\2\u0121\u0123\5$\23\2\u0122\u0111\3\2"+
		"\2\2\u0122\u0115\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011d\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123#\3\2\2\2\u0124\u0125\b\23\1\2\u0125\u0126\5&\24\2"+
		"\u0126\u012f\3\2\2\2\u0127\u0128\f\5\2\2\u0128\u0129\7 \2\2\u0129\u012e"+
		"\5&\24\2\u012a\u012b\f\4\2\2\u012b\u012c\7!\2\2\u012c\u012e\5&\24\2\u012d"+
		"\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130%\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133"+
		"\b\24\1\2\u0133\u0134\5(\25\2\u0134\u013d\3\2\2\2\u0135\u0136\f\5\2\2"+
		"\u0136\u0137\7\34\2\2\u0137\u013c\5(\25\2\u0138\u0139\f\4\2\2\u0139\u013a"+
		"\7\35\2\2\u013a\u013c\5(\25\2\u013b\u0135\3\2\2\2\u013b\u0138\3\2\2\2"+
		"\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\'\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\b\25\1\2\u0141\u0142\5*\26\2\u0142"+
		"\u014b\3\2\2\2\u0143\u0144\f\5\2\2\u0144\u0145\7\36\2\2\u0145\u014a\5"+
		"*\26\2\u0146\u0147\f\4\2\2\u0147\u0148\7\37\2\2\u0148\u014a\5*\26\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c)\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\7\"\2\2\u014f\u0154\5,\27\2\u0150\u0151\7\35\2\2\u0151\u0154\5,\27\2"+
		"\u0152\u0154\5,\27\2\u0153\u014e\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0152"+
		"\3\2\2\2\u0154+\3\2\2\2\u0155\u015d\5\34\17\2\u0156\u015d\5\20\t\2\u0157"+
		"\u0158\7\21\2\2\u0158\u0159\5\36\20\2\u0159\u015a\7\22\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u015d\7-\2\2\u015c\u0155\3\2\2\2\u015c\u0156\3\2\2\2\u015c"+
		"\u0157\3\2\2\2\u015c\u015b\3\2\2\2\u015d-\3\2\2\2\u015e\u015f\7\30\2\2"+
		"\u015f\u0160\7\21\2\2\u0160\u0165\5\36\20\2\u0161\u0162\7\6\2\2\u0162"+
		"\u0164\5\36\20\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u0169\7\22\2\2\u0169\u016a\7\5\2\2\u016a/\3\2\2\2\u016b\u016c\7\31\2"+
		"\2\u016c\u016d\7\21\2\2\u016d\u016e\5\f\7\2\u016e\u016f\7\22\2\2\u016f"+
		"\u0170\7\5\2\2\u0170\61\3\2\2\2$8>DV]dl~\u0084\u008b\u0091\u0097\u00a3"+
		"\u00ab\u00b7\u00bf\u00c3\u00d0\u00dd\u00e0\u00ed\u00f6\u0103\u010e\u0122"+
		"\u012d\u012f\u013b\u013d\u0149\u014b\u0153\u015c\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
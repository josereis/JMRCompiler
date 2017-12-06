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
		RULE_decConsts = 5, RULE_valor = 6, RULE_decFuncs = 7, RULE_parametro = 8, 
		RULE_lista_parametros = 9, RULE_main = 10, RULE_comandos = 11, RULE_atrib = 12, 
		RULE_parametros = 13, RULE_funcao = 14, RULE_bool = 15, RULE_join = 16, 
		RULE_rel = 17, RULE_equality = 18, RULE_expr = 19, RULE_term = 20, RULE_unary = 21, 
		RULE_factor = 22, RULE_print = 23, RULE_read = 24;
	public static final String[] ruleNames = {
		"programa", "decVars", "tipo", "tipoF", "listaIDs", "decConsts", "valor", 
		"decFuncs", "parametro", "lista_parametros", "main", "comandos", "atrib", 
		"parametros", "funcao", "bool", "join", "rel", "equality", "expr", "term", 
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
			setState(103);
			match(Tk_Final);
			setState(104);
			tipo();
			setState(105);
			match(ID);
			setState(106);
			match(Tk_Eq);
			setState(107);
			valor();
			setState(108);
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
		enterRule(_localctx, 12, RULE_valor);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((ValorContext)_localctx).INT = match(INT);
				((ValorContext)_localctx).type =  1; ((ValorContext)_localctx).value =  Integer.parseInt((((ValorContext)_localctx).INT!=null?((ValorContext)_localctx).INT.getText():null));
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((ValorContext)_localctx).REAL = match(REAL);
				((ValorContext)_localctx).type =  2; ((ValorContext)_localctx).value =  Float.parseFloat((((ValorContext)_localctx).REAL!=null?((ValorContext)_localctx).REAL.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				((ValorContext)_localctx).STRING = match(STRING);
				((ValorContext)_localctx).type =  3; ((ValorContext)_localctx).value =  (((ValorContext)_localctx).STRING!=null?((ValorContext)_localctx).STRING.getText():null);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
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
		enterRule(_localctx, 14, RULE_decFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			tipoF();
			setState(121);
			match(ID);
			setState(122);
			match(Tk_AbrePar);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float))) != 0)) {
				{
				setState(123);
				lista_parametros();
				}
			}

			setState(126);
			match(Tk_FechaPar);
			setState(127);
			match(Tk_AbreChave);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Int) | (1L << Tk_Str) | (1L << Tk_Bool) | (1L << Tk_Float))) != 0)) {
				{
				{
				setState(128);
				decVars();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				comandos();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
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
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			tipo();
			setState(142);
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
		enterRule(_localctx, 18, RULE_lista_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			parametro();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(145);
				match(Tk_Virg);
				setState(146);
				parametro();
				}
				}
				setState(151);
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
			setState(152);
			match(Tk_Main);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
			setState(159);
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(Tk_If);
				setState(162);
				match(Tk_AbrePar);
				setState(163);
				bool(0);
				setState(164);
				match(Tk_FechaPar);
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
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_Else) {
					{
					setState(172);
					match(Tk_Else);
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
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(Tk_For);
				setState(184);
				match(Tk_AbrePar);
				setState(185);
				atrib();
				setState(186);
				match(Tk_PtVirg);
				setState(187);
				bool(0);
				setState(188);
				match(Tk_PtVirg);
				setState(189);
				atrib();
				setState(190);
				match(Tk_FechaPar);
				setState(191);
				match(Tk_AbreChave);
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					comandos();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_Return) | (1L << Tk_If) | (1L << Tk_For) | (1L << Tk_Break) | (1L << Tk_Print) | (1L << Tk_Read) | (1L << ID))) != 0) );
				setState(197);
				match(Tk_FechChave);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				atrib();
				setState(200);
				match(Tk_PtVirg);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				funcao();
				setState(203);
				match(Tk_PtVirg);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				read();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(Tk_Break);
				setState(208);
				match(Tk_PtVirg);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				match(Tk_Return);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(210);
					bool(0);
					}
				}

				setState(213);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(ID);
				setState(217);
				match(Tk_Eq);
				setState(218);
				bool(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ID);
				setState(220);
				match(Tk_Inc);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(ID);
				setState(222);
				match(Tk_Dec);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JMRCompilerListener ) ((JMRCompilerListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			bool(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(226);
				match(Tk_Virg);
				setState(227);
				bool(0);
				}
				}
				setState(232);
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JMRCompilerParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
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
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_AbrePar) | (1L << Tk_Sub) | (1L << Tk_Diff) | (1L << STRING) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(235);
				parametros();
				}
			}

			setState(238);
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
			setState(241);
			join(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
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
					setState(243);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(244);
					match(Tk_Ou);
					setState(245);
					join(0);
					}
					} 
				}
				setState(250);
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
			setState(252);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
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
					setState(254);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(255);
					match(Tk_E);
					setState(256);
					rel();
					}
					} 
				}
				setState(261);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				equality(0);
				setState(263);
				match(Tk_Menorq);
				setState(264);
				equality(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				equality(0);
				setState(267);
				match(Tk_Menorig);
				setState(268);
				equality(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				equality(0);
				setState(271);
				match(Tk_Maiorig);
				setState(272);
				equality(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				equality(0);
				setState(275);
				match(Tk_Maiorq);
				setState(276);
				equality(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
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
			setState(282);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(284);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(285);
						match(Tk_Equal);
						setState(286);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(287);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(288);
						match(Tk_Dif);
						setState(289);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(294);
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
			setState(296);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(299);
						match(Tk_Soma);
						setState(300);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(302);
						match(Tk_Sub);
						setState(303);
						term(0);
						}
						break;
					}
					} 
				}
				setState(308);
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
			setState(310);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(312);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(313);
						match(Tk_Mult);
						setState(314);
						unary();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(316);
						match(Tk_Div);
						setState(317);
						unary();
						}
						break;
					}
					} 
				}
				setState(322);
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
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_Diff:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(Tk_Diff);
				setState(324);
				factor();
				}
				break;
			case Tk_Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(Tk_Sub);
				setState(326);
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
				setState(327);
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
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(Tk_AbrePar);
				setState(333);
				bool(0);
				setState(334);
				match(Tk_FechaPar);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
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
			setState(339);
			match(Tk_Print);
			setState(340);
			match(Tk_AbrePar);
			setState(341);
			bool(0);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(342);
				match(Tk_Virg);
				setState(343);
				bool(0);
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(Tk_FechaPar);
			setState(350);
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
		public List<TerminalNode> ID() { return getTokens(JMRCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JMRCompilerParser.ID, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(Tk_Read);
			setState(353);
			match(Tk_AbrePar);
			setState(354);
			match(ID);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_Virg) {
				{
				{
				setState(355);
				match(Tk_Virg);
				setState(356);
				match(ID);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(Tk_FechaPar);
			setState(363);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0170\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3"+
		"\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\5\t\177\n\t\3\t\3\t\3\t"+
		"\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\t\6\t\u008a\n\t\r\t\16\t\u008b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13"+
		"\13\3\f\3\f\3\f\6\f\u009e\n\f\r\f\16\f\u009f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\6\r\u00aa\n\r\r\r\16\r\u00ab\3\r\3\r\3\r\3\r\6\r\u00b2\n\r\r\r"+
		"\16\r\u00b3\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\6\r\u00c4\n\r\r\r\16\r\u00c5\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\r\5\r\u00d9\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00e2\n\16\3\17\3\17\3\17\7\17\u00e7\n\17\f\17"+
		"\16\17\u00ea\13\17\3\20\3\20\3\20\5\20\u00ef\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00f9\n\21\f\21\16\21\u00fc\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0104\n\22\f\22\16\22\u0107\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u011a\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0125\n\24\f\24\16\24\u0128\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0133\n\25\f\25\16\25\u0136\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0141\n\26\f\26\16\26\u0144\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u014b\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0154\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u015b\n\31\f\31\16\31\u015e"+
		"\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u0168\n\32\f\32\16"+
		"\32\u016b\13\32\3\32\3\32\3\32\3\32\2\7 \"&(*\33\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\2\u0189\2\64\3\2\2\2\4K\3\2\2\2"+
		"\6X\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\fi\3\2\2\2\16x\3\2\2\2\20z\3\2\2\2\22"+
		"\u008f\3\2\2\2\24\u0092\3\2\2\2\26\u009a\3\2\2\2\30\u00d8\3\2\2\2\32\u00e1"+
		"\3\2\2\2\34\u00e3\3\2\2\2\36\u00eb\3\2\2\2 \u00f2\3\2\2\2\"\u00fd\3\2"+
		"\2\2$\u0119\3\2\2\2&\u011b\3\2\2\2(\u0129\3\2\2\2*\u0137\3\2\2\2,\u014a"+
		"\3\2\2\2.\u0153\3\2\2\2\60\u0155\3\2\2\2\62\u0162\3\2\2\2\64\65\7\3\2"+
		"\2\65\66\7-\2\2\66:\7\5\2\2\679\5\4\3\28\67\3\2\2\29<\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5\f\7\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AF\3\2\2\2B@\3\2\2\2CE\5\20\t\2DC\3\2\2\2EH\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\26\f\2J\3\3\2\2\2KL\5\6\4\2LM\7"+
		"\7\2\2MN\5\n\6\2NO\7\5\2\2O\5\3\2\2\2PQ\7\t\2\2QY\b\4\1\2RS\7\f\2\2SY"+
		"\b\4\1\2TU\7\n\2\2UY\b\4\1\2VW\7\13\2\2WY\b\4\1\2XP\3\2\2\2XR\3\2\2\2"+
		"XT\3\2\2\2XV\3\2\2\2Y\7\3\2\2\2Z[\5\6\4\2[\\\b\5\1\2\\`\3\2\2\2]^\7\r"+
		"\2\2^`\b\5\1\2_Z\3\2\2\2_]\3\2\2\2`\t\3\2\2\2af\7-\2\2bc\7\6\2\2ce\7-"+
		"\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\13\3\2\2\2hf\3\2\2\2ij\7"+
		"\16\2\2jk\5\6\4\2kl\7-\2\2lm\7\b\2\2mn\5\16\b\2no\7\5\2\2o\r\3\2\2\2p"+
		"q\7*\2\2qy\b\b\1\2rs\7+\2\2sy\b\b\1\2tu\7)\2\2uy\b\b\1\2vw\7,\2\2wy\b"+
		"\b\1\2xp\3\2\2\2xr\3\2\2\2xt\3\2\2\2xv\3\2\2\2y\17\3\2\2\2z{\5\b\5\2{"+
		"|\7-\2\2|~\7\21\2\2}\177\5\24\13\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0081\7\22\2\2\u0081\u0085\7\17\2\2\u0082\u0084\5\4\3\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\5\30\r\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\20\2\2\u008e\21\3\2\2\2\u008f\u0090"+
		"\5\6\4\2\u0090\u0091\7-\2\2\u0091\23\3\2\2\2\u0092\u0097\5\22\n\2\u0093"+
		"\u0094\7\6\2\2\u0094\u0096\5\22\n\2\u0095\u0093\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\25\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7\4\2\2\u009b\u009d\7\17\2\2\u009c\u009e\5"+
		"\30\r\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\27\3\2\2"+
		"\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\5 \21\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\u00a9\7\17\2\2\u00a8\u00aa\5\30\r\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b7\7\20\2\2\u00ae\u00af\7\25\2\2\u00af\u00b1\7"+
		"\17\2\2\u00b0\u00b2\5\30\r\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\20"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00d9\3\2\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\5"+
		"\32\16\2\u00bc\u00bd\7\5\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\5\2\2\u00bf"+
		"\u00c0\5\32\16\2\u00c0\u00c1\7\22\2\2\u00c1\u00c3\7\17\2\2\u00c2\u00c4"+
		"\5\30\r\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\20\2\2\u00c8\u00d9"+
		"\3\2\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7\5\2\2\u00cb\u00d9\3\2\2\2"+
		"\u00cc\u00cd\5\36\20\2\u00cd\u00ce\7\5\2\2\u00ce\u00d9\3\2\2\2\u00cf\u00d9"+
		"\5\60\31\2\u00d0\u00d9\5\62\32\2\u00d1\u00d2\7\27\2\2\u00d2\u00d9\7\5"+
		"\2\2\u00d3\u00d5\7\23\2\2\u00d4\u00d6\5 \21\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\7\5\2\2\u00d8\u00a3\3\2"+
		"\2\2\u00d8\u00b9\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8"+
		"\u00cf\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d3\3\2"+
		"\2\2\u00d9\31\3\2\2\2\u00da\u00db\7-\2\2\u00db\u00dc\7\b\2\2\u00dc\u00e2"+
		"\5 \21\2\u00dd\u00de\7-\2\2\u00de\u00e2\7\32\2\2\u00df\u00e0\7-\2\2\u00e0"+
		"\u00e2\7\33\2\2\u00e1\u00da\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e8\5 \21\2\u00e4\u00e5\7\6\2\2\u00e5"+
		"\u00e7\5 \21\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\35\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec"+
		"\7-\2\2\u00ec\u00ee\7\21\2\2\u00ed\u00ef\5\34\17\2\u00ee\u00ed\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\22\2\2\u00f1\37"+
		"\3\2\2\2\u00f2\u00f3\b\21\1\2\u00f3\u00f4\5\"\22\2\u00f4\u00fa\3\2\2\2"+
		"\u00f5\u00f6\f\4\2\2\u00f6\u00f7\7\'\2\2\u00f7\u00f9\5\"\22\2\u00f8\u00f5"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"!\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\b\22\1\2\u00fe\u00ff\5$\23\2"+
		"\u00ff\u0105\3\2\2\2\u0100\u0101\f\4\2\2\u0101\u0102\7(\2\2\u0102\u0104"+
		"\5$\23\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106#\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5&\24\2"+
		"\u0109\u010a\7$\2\2\u010a\u010b\5&\24\2\u010b\u011a\3\2\2\2\u010c\u010d"+
		"\5&\24\2\u010d\u010e\7&\2\2\u010e\u010f\5&\24\2\u010f\u011a\3\2\2\2\u0110"+
		"\u0111\5&\24\2\u0111\u0112\7%\2\2\u0112\u0113\5&\24\2\u0113\u011a\3\2"+
		"\2\2\u0114\u0115\5&\24\2\u0115\u0116\7#\2\2\u0116\u0117\5&\24\2\u0117"+
		"\u011a\3\2\2\2\u0118\u011a\5&\24\2\u0119\u0108\3\2\2\2\u0119\u010c\3\2"+
		"\2\2\u0119\u0110\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"%\3\2\2\2\u011b\u011c\b\24\1\2\u011c\u011d\5(\25\2\u011d\u0126\3\2\2\2"+
		"\u011e\u011f\f\5\2\2\u011f\u0120\7 \2\2\u0120\u0125\5(\25\2\u0121\u0122"+
		"\f\4\2\2\u0122\u0123\7!\2\2\u0123\u0125\5(\25\2\u0124\u011e\3\2\2\2\u0124"+
		"\u0121\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\'\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\b\25\1\2\u012a\u012b"+
		"\5*\26\2\u012b\u0134\3\2\2\2\u012c\u012d\f\5\2\2\u012d\u012e\7\34\2\2"+
		"\u012e\u0133\5*\26\2\u012f\u0130\f\4\2\2\u0130\u0131\7\35\2\2\u0131\u0133"+
		"\5*\26\2\u0132\u012c\3\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135)\3\2\2\2\u0136\u0134\3\2\2\2"+
		"\u0137\u0138\b\26\1\2\u0138\u0139\5,\27\2\u0139\u0142\3\2\2\2\u013a\u013b"+
		"\f\5\2\2\u013b\u013c\7\36\2\2\u013c\u0141\5,\27\2\u013d\u013e\f\4\2\2"+
		"\u013e\u013f\7\37\2\2\u013f\u0141\5,\27\2\u0140\u013a\3\2\2\2\u0140\u013d"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"+\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\"\2\2\u0146\u014b\5.\30\2"+
		"\u0147\u0148\7\35\2\2\u0148\u014b\5.\30\2\u0149\u014b\5.\30\2\u014a\u0145"+
		"\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0149\3\2\2\2\u014b-\3\2\2\2\u014c"+
		"\u0154\5\36\20\2\u014d\u0154\5\16\b\2\u014e\u014f\7\21\2\2\u014f\u0150"+
		"\5 \21\2\u0150\u0151\7\22\2\2\u0151\u0154\3\2\2\2\u0152\u0154\7-\2\2\u0153"+
		"\u014c\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u0152\3\2"+
		"\2\2\u0154/\3\2\2\2\u0155\u0156\7\30\2\2\u0156\u0157\7\21\2\2\u0157\u015c"+
		"\5 \21\2\u0158\u0159\7\6\2\2\u0159\u015b\5 \21\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7\22\2\2\u0160\u0161\7\5\2\2\u0161"+
		"\61\3\2\2\2\u0162\u0163\7\31\2\2\u0163\u0164\7\21\2\2\u0164\u0169\7-\2"+
		"\2\u0165\u0166\7\6\2\2\u0166\u0168\7-\2\2\u0167\u0165\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016d\7\22\2\2\u016d\u016e\7\5\2\2\u016e\63\3\2\2"+
		"\2$:@FX_fx~\u0085\u008b\u0097\u009f\u00ab\u00b3\u00b7\u00c5\u00d5\u00d8"+
		"\u00e1\u00e8\u00ee\u00fa\u0105\u0119\u0124\u0126\u0132\u0134\u0140\u0142"+
		"\u014a\u0153\u015c\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
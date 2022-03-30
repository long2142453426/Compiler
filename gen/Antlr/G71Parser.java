// Generated from C:/Users/long2/Desktop/Compiler/src/main/java/Antlr\G71.g4 by ANTLR 4.9.1
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class G71Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, INTEGER=2, ELSE=3, FALSE=4, IF=5, THEN=6, WHILE=7, TRUE=8, 
		ASS=9, MUL=10, ADD=11, SUB=12, EQUAL=13, NEQ=14, GT=15, GTE=16, LT=17, 
		LTE=18, AND=19, OR=20, NOT=21, OUT=22, THREAD=23, GLOBAL=24, LBRACE=25, 
		LPAR=26, LBRACK=27, RBRACE=28, RPAR=29, RBRACK=30, SEMI=31, COLON=32, 
		COMMA=33, LOCK=34, UNLOCK=35, RETURN=36, ID=37, NUM=38, COMMENT=39, WS=40;
	public static final int
		RULE_program = 0, RULE_mainProg = 1, RULE_function = 2, RULE_globalDecl = 3, 
		RULE_block = 4, RULE_parBlock = 5, RULE_stat = 6, RULE_params = 7, RULE_dimension = 8, 
		RULE_exprDimension = 9, RULE_expr = 10, RULE_paramMap = 11, RULE_addOp = 12, 
		RULE_mulOp = 13, RULE_booleanOp = 14, RULE_compOp = 15, RULE_type = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainProg", "function", "globalDecl", "block", "parBlock", 
			"stat", "params", "dimension", "exprDimension", "expr", "paramMap", "addOp", 
			"mulOp", "booleanOp", "compOp", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'int'", "'else'", "'false'", "'if'", "'then'", "'while'", 
			"'true'", "'='", "'*'", "'+'", "'-'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'&'", "'|'", "'!'", "'out'", "'thread'", "'global'", 
			"'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "':'", "','", "'lock'", 
			"'unlock'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "INTEGER", "ELSE", "FALSE", "IF", "THEN", "WHILE", "TRUE", 
			"ASS", "MUL", "ADD", "SUB", "EQUAL", "NEQ", "GT", "GTE", "LT", "LTE", 
			"AND", "OR", "NOT", "OUT", "THREAD", "GLOBAL", "LBRACE", "LPAR", "LBRACK", 
			"RBRACE", "RPAR", "RBRACK", "SEMI", "COLON", "COMMA", "LOCK", "UNLOCK", 
			"RETURN", "ID", "NUM", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "G71.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public G71Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainProgContext mainProg() {
			return getRuleContext(MainProgContext.class,0);
		}
		public List<GlobalDeclContext> globalDecl() {
			return getRuleContexts(GlobalDeclContext.class);
		}
		public GlobalDeclContext globalDecl(int i) {
			return getRuleContext(GlobalDeclContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(34);
				globalDecl();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					function();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(46);
			mainProg();
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

	public static class MainProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterMainProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitMainProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitMainProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProgContext mainProg() throws RecognitionException {
		MainProgContext _localctx = new MainProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainProg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << SUB) | (1L << NOT) | (1L << OUT) | (1L << THREAD) | (1L << LBRACE) | (1L << LPAR) | (1L << LBRACK) | (1L << LOCK) | (1L << UNLOCK) | (1L << RETURN) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(48);
				stat();
				}
				}
				setState(53);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(G71Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(G71Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(G71Parser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << LBRACK))) != 0)) {
				{
				setState(54);
				type();
				}
			}

			setState(57);
			match(ID);
			setState(58);
			match(LPAR);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << LBRACK))) != 0)) {
				{
				setState(59);
				params();
				}
			}

			setState(62);
			match(RPAR);
			setState(63);
			block();
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

	public static class GlobalDeclContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(G71Parser.GLOBAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(G71Parser.ID, 0); }
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterGlobalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitGlobalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitGlobalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(GLOBAL);
			setState(66);
			type();
			setState(67);
			match(ID);
			setState(68);
			match(SEMI);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(G71Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(G71Parser.RBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LBRACE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << SUB) | (1L << NOT) | (1L << OUT) | (1L << THREAD) | (1L << LBRACE) | (1L << LPAR) | (1L << LBRACK) | (1L << LOCK) | (1L << UNLOCK) | (1L << RETURN) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(71);
				stat();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RBRACE);
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

	public static class ParBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterParBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitParBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitParBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParBlockContext parBlock() throws RecognitionException {
		ParBlockContext _localctx = new ParBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			block();
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssStatContext extends StatContext {
		public TerminalNode ID() { return getToken(G71Parser.ID, 0); }
		public TerminalNode ASS() { return getToken(G71Parser.ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public List<ExprDimensionContext> exprDimension() {
			return getRuleContexts(ExprDimensionContext.class);
		}
		public ExprDimensionContext exprDimension(int i) {
			return getRuleContext(ExprDimensionContext.class,i);
		}
		public AssStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterAssStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitAssStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitAssStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatContext {
		public TerminalNode IF() { return getToken(G71Parser.IF, 0); }
		public TerminalNode LPAR() { return getToken(G71Parser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(G71Parser.RPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(G71Parser.ELSE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LockStatContext extends StatContext {
		public TerminalNode LOCK() { return getToken(G71Parser.LOCK, 0); }
		public TerminalNode LPAR() { return getToken(G71Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(G71Parser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public LockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterLockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitLockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitLockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutStatContext extends StatContext {
		public TerminalNode OUT() { return getToken(G71Parser.OUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public OutStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterOutStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitOutStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitOutStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public ExprStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterExprStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitExprStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitExprStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatContext extends StatContext {
		public TerminalNode RETURN() { return getToken(G71Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclStatContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(G71Parser.ID, 0); }
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public DeclStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterDeclStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitDeclStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitDeclStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParallelStatContext extends StatContext {
		public TerminalNode THREAD() { return getToken(G71Parser.THREAD, 0); }
		public TerminalNode LBRACE() { return getToken(G71Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(G71Parser.RBRACE, 0); }
		public List<ParBlockContext> parBlock() {
			return getRuleContexts(ParBlockContext.class);
		}
		public ParBlockContext parBlock(int i) {
			return getRuleContext(ParBlockContext.class,i);
		}
		public ParallelStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterParallelStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitParallelStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitParallelStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnlockStatContext extends StatContext {
		public TerminalNode UNLOCK() { return getToken(G71Parser.UNLOCK, 0); }
		public TerminalNode LPAR() { return getToken(G71Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(G71Parser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(G71Parser.SEMI, 0); }
		public UnlockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterUnlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitUnlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitUnlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatContext {
		public TerminalNode WHILE() { return getToken(G71Parser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(G71Parser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(G71Parser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AssStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(82);
					exprDimension();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(ASS);
				setState(89);
				expr(0);
				setState(90);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				type();
				setState(93);
				match(ID);
				setState(94);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ParallelStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(THREAD);
				setState(97);
				match(LBRACE);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					parBlock();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACE );
				setState(103);
				match(RBRACE);
				}
				break;
			case 4:
				_localctx = new LockStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(LOCK);
				setState(106);
				match(LPAR);
				setState(107);
				match(RPAR);
				setState(108);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new UnlockStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(UNLOCK);
				setState(110);
				match(LPAR);
				setState(111);
				match(RPAR);
				setState(112);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				match(IF);
				setState(114);
				match(LPAR);
				setState(115);
				expr(0);
				setState(116);
				match(RPAR);
				setState(117);
				block();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(118);
					match(ELSE);
					setState(119);
					block();
					}
				}

				}
				break;
			case 7:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(WHILE);
				setState(123);
				match(LPAR);
				setState(124);
				expr(0);
				setState(125);
				match(RPAR);
				setState(126);
				block();
				}
				break;
			case 8:
				_localctx = new OutStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(OUT);
				setState(129);
				expr(0);
				setState(130);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				match(RETURN);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << SUB) | (1L << NOT) | (1L << LPAR) | (1L << LBRACK) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(133);
					expr(0);
					}
				}

				setState(136);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				expr(0);
				setState(138);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				block();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(G71Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(G71Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(G71Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(G71Parser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			type();
			setState(144);
			match(ID);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				type();
				setState(147);
				match(ID);
				}
				}
				setState(153);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(G71Parser.LBRACK, 0); }
		public TerminalNode NUM() { return getToken(G71Parser.NUM, 0); }
		public TerminalNode RBRACK() { return getToken(G71Parser.RBRACK, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LBRACK);
			setState(155);
			match(NUM);
			setState(156);
			match(RBRACK);
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

	public static class ExprDimensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(G71Parser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(G71Parser.RBRACK, 0); }
		public ExprDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterExprDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitExprDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitExprDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDimensionContext exprDimension() throws RecognitionException {
		ExprDimensionContext _localctx = new ExprDimensionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LBRACK);
			setState(159);
			expr(0);
			setState(160);
			match(RBRACK);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(G71Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(G71Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(G71Parser.RPAR, 0); }
		public List<ParamMapContext> paramMap() {
			return getRuleContexts(ParamMapContext.class);
		}
		public ParamMapContext paramMap(int i) {
			return getRuleContext(ParamMapContext.class,i);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public TerminalNode LBRACK() { return getToken(G71Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(G71Parser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(G71Parser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(G71Parser.NUM, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(G71Parser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(G71Parser.RPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(G71Parser.EQUAL, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(G71Parser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExprContext extends ExprContext {
		public TerminalNode SUB() { return getToken(G71Parser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitNegExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class,0);
		}
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(G71Parser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(G71Parser.ID, 0); }
		public List<ExprDimensionContext> exprDimension() {
			return getRuleContexts(ExprDimensionContext.class);
		}
		public ExprDimensionContext exprDimension(int i) {
			return getRuleContext(ExprDimensionContext.class,i);
		}
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(163);
				match(NOT);
				setState(164);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(SUB);
				setState(166);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(LPAR);
				setState(168);
				expr(0);
				setState(169);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(ID);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(172);
						exprDimension();
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 5:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(NUM);
				}
				break;
			case 6:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(LBRACK);
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					expr(0);
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << SUB) | (1L << NOT) | (1L << LPAR) | (1L << LBRACK) | (1L << ID) | (1L << NUM))) != 0) );
				setState(185);
				match(RBRACK);
				}
				break;
			case 7:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(ID);
				setState(188);
				match(LPAR);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(189);
					paramMap();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(201);
						mulOp();
						setState(202);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(205);
						addOp();
						setState(206);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(209);
						booleanOp();
						setState(210);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(213);
						compOp();
						setState(214);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(217);
						match(EQUAL);
						setState(218);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ParamMapContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(G71Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(G71Parser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterParamMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitParamMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitParamMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamMapContext paramMap() throws RecognitionException {
		ParamMapContext _localctx = new ParamMapContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(225);
			match(COLON);
			setState(226);
			expr(0);
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

	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(G71Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(G71Parser.SUB, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class MulOpContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(G71Parser.MUL, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mulOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(MUL);
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

	public static class BooleanOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(G71Parser.AND, 0); }
		public TerminalNode OR() { return getToken(G71Parser.OR, 0); }
		public BooleanOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterBooleanOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitBooleanOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitBooleanOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOpContext booleanOp() throws RecognitionException {
		BooleanOpContext _localctx = new BooleanOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(G71Parser.NEQ, 0); }
		public TerminalNode GT() { return getToken(G71Parser.GT, 0); }
		public TerminalNode GTE() { return getToken(G71Parser.GTE, 0); }
		public TerminalNode LT() { return getToken(G71Parser.LT, 0); }
		public TerminalNode LTE() { return getToken(G71Parser.LTE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(G71Parser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(G71Parser.BOOLEAN, 0); }
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G71Listener ) ((G71Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof G71Visitor ) return ((G71Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(BOOLEAN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				dimension();
				setState(239);
				type();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\4\5\4:\n\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\6\bf\n\b\r\b\16\bg\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0089\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b0"+
		"\n\f\f\f\16\f\u00b3\13\f\3\f\3\f\3\f\6\f\u00b8\n\f\r\f\16\f\u00b9\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13\f\3\f\3\f\3\f\5\f\u00c9"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00f4\n\22"+
		"\3\22\2\3\26\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\r\16"+
		"\3\2\25\26\3\2\20\24\2\u010b\2\'\3\2\2\2\4\65\3\2\2\2\69\3\2\2\2\bC\3"+
		"\2\2\2\nH\3\2\2\2\fQ\3\2\2\2\16\u008f\3\2\2\2\20\u0091\3\2\2\2\22\u009c"+
		"\3\2\2\2\24\u00a0\3\2\2\2\26\u00c8\3\2\2\2\30\u00e2\3\2\2\2\32\u00e6\3"+
		"\2\2\2\34\u00e8\3\2\2\2\36\u00ea\3\2\2\2 \u00ec\3\2\2\2\"\u00f3\3\2\2"+
		"\2$&\5\b\5\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3"+
		"\2\2\2*,\5\6\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/"+
		"-\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64\5\16\b\2\63\62\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\28:\5\""+
		"\22\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\'\2\2<>\7\34\2\2=?\5\20\t\2>="+
		"\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\37\2\2AB\5\n\6\2B\7\3\2\2\2CD\7\32\2"+
		"\2DE\5\"\22\2EF\7\'\2\2FG\7!\2\2G\t\3\2\2\2HL\7\33\2\2IK\5\16\b\2JI\3"+
		"\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\36\2\2P\13"+
		"\3\2\2\2QR\5\n\6\2R\r\3\2\2\2SW\7\'\2\2TV\5\24\13\2UT\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\13\2\2[\\\5\26\f\2\\]\7"+
		"!\2\2]\u0090\3\2\2\2^_\5\"\22\2_`\7\'\2\2`a\7!\2\2a\u0090\3\2\2\2bc\7"+
		"\31\2\2ce\7\33\2\2df\5\f\7\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h"+
		"i\3\2\2\2ij\7\36\2\2j\u0090\3\2\2\2kl\7$\2\2lm\7\34\2\2mn\7\37\2\2n\u0090"+
		"\7!\2\2op\7%\2\2pq\7\34\2\2qr\7\37\2\2r\u0090\7!\2\2st\7\7\2\2tu\7\34"+
		"\2\2uv\5\26\f\2vw\7\37\2\2wz\5\n\6\2xy\7\5\2\2y{\5\n\6\2zx\3\2\2\2z{\3"+
		"\2\2\2{\u0090\3\2\2\2|}\7\t\2\2}~\7\34\2\2~\177\5\26\f\2\177\u0080\7\37"+
		"\2\2\u0080\u0081\5\n\6\2\u0081\u0090\3\2\2\2\u0082\u0083\7\30\2\2\u0083"+
		"\u0084\5\26\f\2\u0084\u0085\7!\2\2\u0085\u0090\3\2\2\2\u0086\u0088\7&"+
		"\2\2\u0087\u0089\5\26\f\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0090\7!\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7!"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u0090\5\n\6\2\u008fS\3\2\2\2\u008f^\3\2"+
		"\2\2\u008fb\3\2\2\2\u008fk\3\2\2\2\u008fo\3\2\2\2\u008fs\3\2\2\2\u008f"+
		"|\3\2\2\2\u008f\u0082\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u008b\3\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\17\3\2\2\2\u0091\u0092\5\"\22\2\u0092\u0099"+
		"\7\'\2\2\u0093\u0094\7#\2\2\u0094\u0095\5\"\22\2\u0095\u0096\7\'\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\21\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\7\35\2\2\u009d\u009e\7(\2\2\u009e\u009f\7 \2\2\u009f\23\3\2\2\2\u00a0"+
		"\u00a1\7\35\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7 \2\2\u00a3\25\3\2\2"+
		"\2\u00a4\u00a5\b\f\1\2\u00a5\u00a6\7\27\2\2\u00a6\u00c9\5\26\f\20\u00a7"+
		"\u00a8\7\16\2\2\u00a8\u00c9\5\26\f\17\u00a9\u00aa\7\34\2\2\u00aa\u00ab"+
		"\5\26\f\2\u00ab\u00ac\7\37\2\2\u00ac\u00c9\3\2\2\2\u00ad\u00b1\7\'\2\2"+
		"\u00ae\u00b0\5\24\13\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00c9\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00c9\7(\2\2\u00b5\u00b7\7\35\2\2\u00b6\u00b8\5\26\f\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7 \2\2\u00bc\u00c9\3\2\2\2\u00bd\u00be\7\'"+
		"\2\2\u00be\u00c2\7\34\2\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\7\37\2\2\u00c6\u00c9\7\n\2\2\u00c7"+
		"\u00c9\7\6\2\2\u00c8\u00a4\3\2\2\2\u00c8\u00a7\3\2\2\2\u00c8\u00a9\3\2"+
		"\2\2\u00c8\u00ad\3\2\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00b5\3\2\2\2\u00c8"+
		"\u00bd\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00df\3\2"+
		"\2\2\u00ca\u00cb\f\16\2\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\5\26\f\17"+
		"\u00cd\u00de\3\2\2\2\u00ce\u00cf\f\r\2\2\u00cf\u00d0\5\32\16\2\u00d0\u00d1"+
		"\5\26\f\16\u00d1\u00de\3\2\2\2\u00d2\u00d3\f\f\2\2\u00d3\u00d4\5\36\20"+
		"\2\u00d4\u00d5\5\26\f\r\u00d5\u00de\3\2\2\2\u00d6\u00d7\f\13\2\2\u00d7"+
		"\u00d8\5 \21\2\u00d8\u00d9\5\26\f\f\u00d9\u00de\3\2\2\2\u00da\u00db\f"+
		"\n\2\2\u00db\u00dc\7\17\2\2\u00dc\u00de\5\26\f\13\u00dd\u00ca\3\2\2\2"+
		"\u00dd\u00ce\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00da"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3\u00e4\7\"\2"+
		"\2\u00e4\u00e5\5\26\f\2\u00e5\31\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7\33"+
		"\3\2\2\2\u00e8\u00e9\7\f\2\2\u00e9\35\3\2\2\2\u00ea\u00eb\t\3\2\2\u00eb"+
		"\37\3\2\2\2\u00ec\u00ed\t\4\2\2\u00ed!\3\2\2\2\u00ee\u00f4\7\4\2\2\u00ef"+
		"\u00f4\7\3\2\2\u00f0\u00f1\5\22\n\2\u00f1\u00f2\5\"\22\2\u00f2\u00f4\3"+
		"\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4"+
		"#\3\2\2\2\25\'-\659>LWgz\u0088\u008f\u0099\u00b1\u00b9\u00c2\u00c8\u00dd"+
		"\u00df\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
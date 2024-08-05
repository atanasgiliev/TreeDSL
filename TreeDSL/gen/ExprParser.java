// Generated from /Users/atanasiliev/Desktop/cs59project/TreeDSL/Expr.g4 by ANTLR 4.13.1

import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SPECIAL=3, WORD=4, NONZERO=5, DIGIT=6, SPACE=7, INDENT=8, 
		NEWLINE=9;
	public static final int
		RULE_start = 0, RULE_firstLine = 1, RULE_line = 2, RULE_name = 3, RULE_parents = 4, 
		RULE_relations = 5, RULE_number = 6, RULE_special = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "firstLine", "line", "name", "parents", "relations", "number", 
			"special"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "':'", null, null, null, null, "' '", "'    '", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SPECIAL", "WORD", "NONZERO", "DIGIT", "SPACE", "INDENT", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Stack<Integer> indentationLevels = new Stack<>();
	    int lastIndentationLevel = 0;

	    private void correctIndentation(int currentIndent) {
	        if (!indentationLevels.isEmpty()) {
	            int lastIndent = indentationLevels.peek();
	            if (currentIndent > lastIndent + 1) {
	                throw new RuntimeException("Invalid indentation level: " + currentIndent + ". Expected: " + lastIndent + " or " + (lastIndent + 1));
	            }
	        }
	        indentationLevels.push(currentIndent);
	    }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public FirstLineContext firstLine() {
			return getRuleContext(FirstLineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			firstLine();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(17);
				match(NEWLINE);
				setState(18);
				line();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FirstLineContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ExprParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ExprParser.SPACE, i);
		}
		public ParentsContext parents() {
			return getRuleContext(ParentsContext.class,0);
		}
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public FirstLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFirstLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFirstLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFirstLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstLineContext firstLine() throws RecognitionException {
		FirstLineContext _localctx = new FirstLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_firstLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			name();
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27);
					match(SPACE);
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(33);
				parents();
				}
				break;
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(36);
				match(SPACE);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONZERO) {
				{
				setState(42);
				relations();
				}
			}

			 correctIndentation(0); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public Token INDENT;
		public List<Token> indent = new ArrayList<Token>();
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ExprParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ExprParser.SPACE, i);
		}
		public ParentsContext parents() {
			return getRuleContext(ParentsContext.class,0);
		}
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(ExprParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(ExprParser.INDENT, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(47);
				((LineContext)_localctx).INDENT = match(INDENT);
				((LineContext)_localctx).indent.add(((LineContext)_localctx).INDENT);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			name();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					match(SPACE);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(60);
				parents();
				}
				break;
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(63);
				match(SPACE);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONZERO) {
				{
				setState(69);
				relations();
				}
			}

			 correctIndentation(((LineContext)_localctx).indent.size()); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ExprParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ExprParser.WORD, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(ExprParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ExprParser.SPACE, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(WORD);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					match(SPACE);
					setState(76);
					match(WORD);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParentsContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentsContext parents() throws RecognitionException {
		ParentsContext _localctx = new ParentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			number();
			setState(83);
			match(T__0);
			setState(84);
			number();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationsContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public RelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRelations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRelations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationsContext relations() throws RecognitionException {
		RelationsContext _localctx = new RelationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			number();
			setState(87);
			match(T__1);
			setState(88);
			special();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NONZERO() { return getToken(ExprParser.NONZERO, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ExprParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ExprParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(NONZERO);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(91);
				match(DIGIT);
				}
				}
				setState(96);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode SPECIAL() { return getToken(ExprParser.SPECIAL, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SPECIAL);
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

	public static final String _serializedATN =
		"\u0004\u0001\td\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001d\b\u0001\n\u0001\f\u0001 \t\u0001\u0001\u0001\u0003\u0001#\b\u0001"+
		"\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"1\b\u0002\n\u0002\f\u00024\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"8\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001"+
		"\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001\u0002\u0003"+
		"\u0002G\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u0006]\b\u0006\n\u0006\f\u0006`\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0000g\u0000\u0010\u0001\u0000\u0000\u0000\u0002"+
		"\u001a\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006J\u0001"+
		"\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000"+
		"\fZ\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010\u0015"+
		"\u0003\u0002\u0001\u0000\u0011\u0012\u0005\t\u0000\u0000\u0012\u0014\u0003"+
		"\u0004\u0002\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001"+
		"\u0000\u0000\u0000\u001a\u001e\u0003\u0006\u0003\u0000\u001b\u001d\u0005"+
		"\u0007\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000!#\u0003\b\u0004\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#\'\u0001\u0000\u0000\u0000$&\u0005\u0007\u0000\u0000%$\u0001"+
		"\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000*,\u0003\n\u0005\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-.\u0006\u0001\uffff\uffff\u0000.\u0003"+
		"\u0001\u0000\u0000\u0000/1\u0005\b\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"14\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000059\u0003\u0006"+
		"\u0003\u000068\u0005\u0007\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0003\b\u0004\u0000"+
		"=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>B\u0001\u0000\u0000"+
		"\u0000?A\u0005\u0007\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0003\n\u0005\u0000FE\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HI\u0006\u0002\uffff\uffff\u0000I\u0005\u0001\u0000\u0000\u0000JO\u0005"+
		"\u0004\u0000\u0000KL\u0005\u0007\u0000\u0000LN\u0005\u0004\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u0007\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005\u0001\u0000\u0000TU\u0003"+
		"\f\u0006\u0000U\t\u0001\u0000\u0000\u0000VW\u0003\f\u0006\u0000WX\u0005"+
		"\u0002\u0000\u0000XY\u0003\u000e\u0007\u0000Y\u000b\u0001\u0000\u0000"+
		"\u0000Z^\u0005\u0005\u0000\u0000[]\u0005\u0006\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_\r\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"ab\u0005\u0003\u0000\u0000b\u000f\u0001\u0000\u0000\u0000\f\u0015\u001e"+
		"\"\'+29=BFO^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
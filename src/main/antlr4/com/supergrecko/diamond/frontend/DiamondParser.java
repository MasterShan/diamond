// Generated from /mnt/d/Projects/Kotlin/Diamond/src/main/antlr4/com/supergrecko/diamond/frontend/Diamond.g4 by ANTLR 4.7.2
package com.supergrecko.diamond.frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiamondParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, CONST=2, CONTINUE=3, DEFINE=4, DERIVES=5, ELSE=6, ENTRY=7, EXTERN=8, 
		FUN=9, GUARD=10, IF=11, IMPORT=12, LINK=13, LOOP=14, MUT=15, RETURN=16, 
		STATIC=17, STRUCT=18, THIS=19, TYPEDEF=20, WHEN=21, YIELD=22, LARR=23, 
		RARR=24, LBRACE=25, RBRACE=26, LBRACKET=27, RBRACKET=28, LPAREN=29, RPAREN=30, 
		DOT=31, COMMA=32, COLON=33, SEMICOLON=34, STAR=35, SLASH=36, PLUS=37, 
		MINUS=38, EQUAL=39, BANG=40, NOTEQUAL=41, OR=42, AND=43, LESSEQUAL=44, 
		GREATEQUAL=45, COLONCOLON=46, ARROW=47, NULL=48, TRUE=49, FALSE=50, INT=51, 
		DOUBLE=52, STRING=53, ID=54, COMMENT=55, WS=56, UNKNOWN=57;
	public static final int
		RULE_program = 0, RULE_entryDeclaration = 1, RULE_topLevelDeclaration = 2, 
		RULE_structDeclaration = 3, RULE_genericType = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "entryDeclaration", "topLevelDeclaration", "structDeclaration", 
			"genericType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'const'", "'continue'", "'define'", "'derives'", "'else'", 
			"'entry'", "'extern'", "'fun'", "'guard'", "'if'", "'import'", "'link'", 
			"'loop'", "'mut'", "'return'", "'static'", "'struct'", "'this'", "'typedef'", 
			"'when'", "'yield'", "'<'", "'>'", "'{'", "'}'", "'['", "']'", "'('", 
			"')'", "'.'", "','", "':'", "';'", "'*'", "'/'", "'+'", "'-'", "'='", 
			"'!'", "'!='", "'||'", "'&&'", "'<='", "'>='", "'::'", "'->'", "'null'", 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "CONST", "CONTINUE", "DEFINE", "DERIVES", "ELSE", "ENTRY", 
			"EXTERN", "FUN", "GUARD", "IF", "IMPORT", "LINK", "LOOP", "MUT", "RETURN", 
			"STATIC", "STRUCT", "THIS", "TYPEDEF", "WHEN", "YIELD", "LARR", "RARR", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "DOT", 
			"COMMA", "COLON", "SEMICOLON", "STAR", "SLASH", "PLUS", "MINUS", "EQUAL", 
			"BANG", "NOTEQUAL", "OR", "AND", "LESSEQUAL", "GREATEQUAL", "COLONCOLON", 
			"ARROW", "NULL", "TRUE", "FALSE", "INT", "DOUBLE", "STRING", "ID", "COMMENT", 
			"WS", "UNKNOWN"
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
	public String getGrammarFileName() { return "Diamond.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiamondParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TopLevelDeclarationContext topLevelDeclaration() {
			return getRuleContext(TopLevelDeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			topLevelDeclaration();
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

	public static class EntryDeclarationContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(DiamondParser.ENTRY, 0); }
		public TerminalNode LBRACE() { return getToken(DiamondParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DiamondParser.RBRACE, 0); }
		public EntryDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).enterEntryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).exitEntryDeclaration(this);
		}
	}

	public final EntryDeclarationContext entryDeclaration() throws RecognitionException {
		EntryDeclarationContext _localctx = new EntryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entryDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(ENTRY);
			setState(13);
			match(LBRACE);
			setState(14);
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

	public static class TopLevelDeclarationContext extends ParserRuleContext {
		public EntryDeclarationContext entryDeclaration() {
			return getRuleContext(EntryDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public TopLevelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).enterTopLevelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).exitTopLevelDeclaration(this);
		}
	}

	public final TopLevelDeclarationContext topLevelDeclaration() throws RecognitionException {
		TopLevelDeclarationContext _localctx = new TopLevelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topLevelDeclaration);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				entryDeclaration();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				structDeclaration();
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token ID;
		public List<Token> generics = new ArrayList<Token>();
		public TerminalNode STRUCT() { return getToken(DiamondParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(DiamondParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DiamondParser.RBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(DiamondParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DiamondParser.ID, i);
		}
		public TerminalNode LARR() { return getToken(DiamondParser.LARR, 0); }
		public TerminalNode RARR() { return getToken(DiamondParser.RARR, 0); }
		public TerminalNode COMMA() { return getToken(DiamondParser.COMMA, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(STRUCT);
			setState(21);
			((StructDeclarationContext)_localctx).name = match(ID);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LARR) {
				{
				setState(22);
				match(LARR);
				setState(23);
				((StructDeclarationContext)_localctx).ID = match(ID);
				((StructDeclarationContext)_localctx).generics.add(((StructDeclarationContext)_localctx).ID);
				{
				setState(24);
				match(COMMA);
				setState(25);
				((StructDeclarationContext)_localctx).ID = match(ID);
				((StructDeclarationContext)_localctx).generics.add(((StructDeclarationContext)_localctx).ID);
				}
				setState(27);
				match(RARR);
				}
			}

			setState(30);
			match(LBRACE);
			setState(31);
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

	public static class GenericTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DiamondParser.ID, 0); }
		public TerminalNode LARR() { return getToken(DiamondParser.LARR, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public TerminalNode RARR() { return getToken(DiamondParser.RARR, 0); }
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiamondListener ) ((DiamondListener)listener).exitGenericType(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(34);
			match(LARR);
			setState(35);
			genericType();
			setState(36);
			match(RARR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;)\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\25\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\37\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2%\2\f\3\2\2\2\4\16\3\2\2\2\6\24\3\2\2\2"+
		"\b\26\3\2\2\2\n#\3\2\2\2\f\r\5\6\4\2\r\3\3\2\2\2\16\17\7\t\2\2\17\20\7"+
		"\33\2\2\20\21\7\34\2\2\21\5\3\2\2\2\22\25\5\4\3\2\23\25\5\b\5\2\24\22"+
		"\3\2\2\2\24\23\3\2\2\2\25\7\3\2\2\2\26\27\7\24\2\2\27\36\78\2\2\30\31"+
		"\7\31\2\2\31\32\78\2\2\32\33\7\"\2\2\33\34\78\2\2\34\35\3\2\2\2\35\37"+
		"\7\32\2\2\36\30\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\33\2\2!\"\7\34\2"+
		"\2\"\t\3\2\2\2#$\78\2\2$%\7\31\2\2%&\5\n\6\2&\'\7\32\2\2\'\13\3\2\2\2"+
		"\4\24\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
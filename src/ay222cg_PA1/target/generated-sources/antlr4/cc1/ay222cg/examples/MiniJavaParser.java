// Generated from MiniJava.g4 by ANTLR 4.5.1

	package cc1.ay222cg.examples;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, ID=45, Number=46, 
		FIXSTR=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_mainClassName = 2, RULE_mainMethod = 3, 
		RULE_mainMethodSigniture = 4, RULE_mainMethodType = 5, RULE_mainMethodName = 6, 
		RULE_clazz = 7, RULE_clazzName = 8, RULE_method = 9, RULE_methodSigniture = 10, 
		RULE_methodParameter = 11, RULE_methodType = 12, RULE_methodName = 13, 
		RULE_methodBody = 14, RULE_statement = 15, RULE_printSt = 16, RULE_defineVarSt = 17, 
		RULE_assignSt = 18, RULE_assignArrayItem = 19, RULE_ifSt = 20, RULE_elseSt = 21, 
		RULE_whileSt = 22, RULE_returnSt = 23, RULE_conditions = 24, RULE_condition = 25, 
		RULE_comparer = 26, RULE_conjuction = 27, RULE_negativeSing = 28, RULE_operation = 29, 
		RULE_element = 30, RULE_arrayItem = 31, RULE_arrayName = 32, RULE_arrayIndex = 33, 
		RULE_objectMethodCall = 34, RULE_newObjectMethodCall = 35, RULE_objectName = 36, 
		RULE_newObject = 37, RULE_methodCall = 38, RULE_callParams = 39, RULE_callParameter = 40, 
		RULE_type = 41, RULE_operator = 42;
	public static final String[] ruleNames = {
		"program", "mainClass", "mainClassName", "mainMethod", "mainMethodSigniture", 
		"mainMethodType", "mainMethodName", "clazz", "clazzName", "method", "methodSigniture", 
		"methodParameter", "methodType", "methodName", "methodBody", "statement", 
		"printSt", "defineVarSt", "assignSt", "assignArrayItem", "ifSt", "elseSt", 
		"whileSt", "returnSt", "conditions", "condition", "comparer", "conjuction", 
		"negativeSing", "operation", "element", "arrayItem", "arrayName", "arrayIndex", 
		"objectMethodCall", "newObjectMethodCall", "objectName", "newObject", 
		"methodCall", "callParams", "callParameter", "type", "operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "'public'", "'static'", "'('", "'String[]'", 
		"')'", "'void'", "'main'", "';'", "','", "'break'", "'System.out.println('", 
		"'='", "'['", "']'", "'if'", "'else'", "'while'", "'return'", "'<'", "'>'", 
		"'=='", "'<='", "'>='", "'&&'", "'||'", "'!'", "'.'", "'''", "'new'", 
		"'boolean'", "'Character'", "'char'", "'String'", "'Integer'", "'int[]'", 
		"'int'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "ID", "Number", 
		"FIXSTR", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClazzContext> clazz() {
			return getRuleContexts(ClazzContext.class);
		}
		public ClazzContext clazz(int i) {
			return getRuleContext(ClazzContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			mainClass();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(87);
				clazz();
				}
				}
				setState(92);
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

	public static class MainClassContext extends ParserRuleContext {
		public MainClassNameContext mainClassName() {
			return getRuleContext(MainClassNameContext.class,0);
		}
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			mainClassName();
			setState(95);
			match(T__1);
			setState(96);
			mainMethod();
			setState(97);
			match(T__2);
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

	public static class MainClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public MainClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassNameContext mainClassName() throws RecognitionException {
		MainClassNameContext _localctx = new MainClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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

	public static class MainMethodContext extends ParserRuleContext {
		public MainMethodSignitureContext mainMethodSigniture() {
			return getRuleContext(MainMethodSignitureContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			mainMethodSigniture();
			setState(102);
			match(T__1);
			setState(103);
			methodBody();
			setState(104);
			match(T__2);
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

	public static class MainMethodSignitureContext extends ParserRuleContext {
		public MainMethodTypeContext mainMethodType() {
			return getRuleContext(MainMethodTypeContext.class,0);
		}
		public MainMethodNameContext mainMethodName() {
			return getRuleContext(MainMethodNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public MainMethodSignitureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodSigniture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethodSigniture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethodSigniture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainMethodSigniture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodSignitureContext mainMethodSigniture() throws RecognitionException {
		MainMethodSignitureContext _localctx = new MainMethodSignitureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainMethodSigniture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__3);
			setState(107);
			match(T__4);
			setState(108);
			mainMethodType();
			setState(109);
			mainMethodName();
			setState(110);
			match(T__5);
			setState(111);
			match(T__6);
			setState(112);
			match(ID);
			setState(113);
			match(T__7);
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

	public static class MainMethodTypeContext extends ParserRuleContext {
		public MainMethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodTypeContext mainMethodType() throws RecognitionException {
		MainMethodTypeContext _localctx = new MainMethodTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainMethodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__8);
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

	public static class MainMethodNameContext extends ParserRuleContext {
		public MainMethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodNameContext mainMethodName() throws RecognitionException {
		MainMethodNameContext _localctx = new MainMethodNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainMethodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
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

	public static class ClazzContext extends ParserRuleContext {
		public ClazzNameContext clazzName() {
			return getRuleContext(ClazzNameContext.class,0);
		}
		public List<DefineVarStContext> defineVarSt() {
			return getRuleContexts(DefineVarStContext.class);
		}
		public DefineVarStContext defineVarSt(int i) {
			return getRuleContext(DefineVarStContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClazzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClazz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClazz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClazz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClazzContext clazz() throws RecognitionException {
		ClazzContext _localctx = new ClazzContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clazz);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__0);
			setState(120);
			clazzName();
			setState(121);
			match(T__1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					defineVarSt();
					setState(123);
					match(T__10);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ID))) != 0)) {
				{
				{
				setState(130);
				method();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__2);
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

	public static class ClazzNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ClazzNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazzName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClazzName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClazzName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClazzName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClazzNameContext clazzName() throws RecognitionException {
		ClazzNameContext _localctx = new ClazzNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_clazzName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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

	public static class MethodContext extends ParserRuleContext {
		public MethodSignitureContext methodSigniture() {
			return getRuleContext(MethodSignitureContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			methodSigniture();
			setState(141);
			match(T__1);
			setState(142);
			methodBody();
			setState(143);
			match(T__2);
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

	public static class MethodSignitureContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public MethodSignitureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSigniture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodSigniture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodSigniture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodSigniture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSignitureContext methodSigniture() throws RecognitionException {
		MethodSignitureContext _localctx = new MethodSignitureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodSigniture);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			methodType();
			setState(146);
			methodName();
			setState(147);
			match(T__5);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					methodParameter();
					setState(149);
					match(T__11);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ID))) != 0)) {
				{
				setState(156);
				methodParameter();
				}
			}

			setState(159);
			match(T__7);
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

	public static class MethodParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			type();
			setState(162);
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			type();
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ID))) != 0)) {
				{
				{
				setState(168);
				statement();
				}
				}
				setState(173);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintStContext printSt() {
			return getRuleContext(PrintStContext.class,0);
		}
		public DefineVarStContext defineVarSt() {
			return getRuleContext(DefineVarStContext.class,0);
		}
		public AssignArrayItemContext assignArrayItem() {
			return getRuleContext(AssignArrayItemContext.class,0);
		}
		public AssignStContext assignSt() {
			return getRuleContext(AssignStContext.class,0);
		}
		public ReturnStContext returnSt() {
			return getRuleContext(ReturnStContext.class,0);
		}
		public IfStContext ifSt() {
			return getRuleContext(IfStContext.class,0);
		}
		public WhileStContext whileSt() {
			return getRuleContext(WhileStContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__20:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(180);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(174);
					match(T__12);
					}
					break;
				case 2:
					{
					setState(175);
					printSt();
					}
					break;
				case 3:
					{
					setState(176);
					defineVarSt();
					}
					break;
				case 4:
					{
					setState(177);
					assignArrayItem();
					}
					break;
				case 5:
					{
					setState(178);
					assignSt();
					}
					break;
				case 6:
					{
					setState(179);
					returnSt();
					}
					break;
				}
				setState(182);
				match(T__10);
				}
				}
				break;
			case T__17:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(183);
					ifSt();
					}
					break;
				case T__19:
					{
					setState(184);
					whileSt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class PrintStContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrintStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrintSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStContext printSt() throws RecognitionException {
		PrintStContext _localctx = new PrintStContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__13);
			setState(190);
			operation();
			setState(191);
			match(T__7);
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

	public static class DefineVarStContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public AssignStContext assignSt() {
			return getRuleContext(AssignStContext.class,0);
		}
		public DefineVarStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineVarSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDefineVarSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDefineVarSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitDefineVarSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineVarStContext defineVarSt() throws RecognitionException {
		DefineVarStContext _localctx = new DefineVarStContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defineVarSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			type();
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(194);
				match(ID);
				}
				break;
			case 2:
				{
				setState(195);
				assignSt();
				}
				break;
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

	public static class AssignStContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AssignStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStContext assignSt() throws RecognitionException {
		AssignStContext _localctx = new AssignStContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(T__14);
			setState(200);
			operation();
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

	public static class AssignArrayItemContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode Number() { return getToken(MiniJavaParser.Number, 0); }
		public AssignArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignArrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignArrayItemContext assignArrayItem() throws RecognitionException {
		AssignArrayItemContext _localctx = new AssignArrayItemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignArrayItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ID);
			{
			setState(203);
			match(T__15);
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(205);
			match(T__16);
			}
			setState(207);
			match(T__14);
			setState(208);
			operation();
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

	public static class IfStContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStContext elseSt() {
			return getRuleContext(ElseStContext.class,0);
		}
		public IfStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStContext ifSt() throws RecognitionException {
		IfStContext _localctx = new IfStContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__17);
			setState(211);
			match(T__5);
			setState(212);
			conditions();
			setState(213);
			match(T__7);
			setState(223);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(214);
				match(T__1);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ID))) != 0)) {
					{
					{
					setState(215);
					statement();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(T__2);
				}
				}
				break;
			case T__12:
			case T__13:
			case T__17:
			case T__19:
			case T__20:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case ID:
				{
				setState(222);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(225);
				elseSt();
				}
				break;
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

	public static class ElseStContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterElseSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitElseSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitElseSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStContext elseSt() throws RecognitionException {
		ElseStContext _localctx = new ElseStContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__18);
			setState(238);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(229);
				match(T__1);
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					statement();
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ID))) != 0) );
				setState(235);
				match(T__2);
				}
				break;
			case T__12:
			case T__13:
			case T__17:
			case T__19:
			case T__20:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case ID:
				{
				setState(237);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WhileStContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStContext whileSt() throws RecognitionException {
		WhileStContext _localctx = new WhileStContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__19);
			setState(241);
			match(T__5);
			setState(242);
			conditions();
			setState(243);
			match(T__7);
			setState(244);
			match(T__1);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ID))) != 0)) {
				{
				{
				setState(245);
				statement();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(T__2);
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

	public static class ReturnStContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public TerminalNode Number() { return getToken(MiniJavaParser.Number, 0); }
		public ReturnStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturnSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStContext returnSt() throws RecognitionException {
		ReturnStContext _localctx = new ReturnStContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__20);
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public NegativeSingContext negativeSing() {
			return getRuleContext(NegativeSingContext.class,0);
		}
		public List<ConjuctionContext> conjuction() {
			return getRuleContexts(ConjuctionContext.class);
		}
		public ConjuctionContext conjuction(int i) {
			return getRuleContext(ConjuctionContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(256);
				negativeSing();
				setState(257);
				match(T__5);
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					condition();
					setState(262);
					conjuction();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(269);
			condition();
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(270);
				match(T__7);
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ComparerContext comparer() {
			return getRuleContext(ComparerContext.class,0);
		}
		public NegativeSingContext negativeSing() {
			return getRuleContext(NegativeSingContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition);
		int _la;
		try {
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__5);
				setState(274);
				condition();
				setState(275);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				operation();
				setState(281);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
					{
					setState(278);
					comparer();
					setState(279);
					operation();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				negativeSing();
				setState(284);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(286);
					negativeSing();
					}
				}

				setState(289);
				match(T__5);
				setState(290);
				operation();
				setState(294);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
					{
					setState(291);
					comparer();
					setState(292);
					operation();
					}
				}

				setState(296);
				match(T__7);
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

	public static class ComparerContext extends ParserRuleContext {
		public ComparerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterComparer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitComparer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitComparer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparerContext comparer() throws RecognitionException {
		ComparerContext _localctx = new ComparerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConjuctionContext extends ParserRuleContext {
		public ConjuctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterConjuction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitConjuction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitConjuction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuctionContext conjuction() throws RecognitionException {
		ConjuctionContext _localctx = new ConjuctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conjuction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NegativeSingContext extends ParserRuleContext {
		public NegativeSingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeSing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNegativeSing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNegativeSing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNegativeSing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeSingContext negativeSing() throws RecognitionException {
		NegativeSingContext _localctx = new NegativeSingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_negativeSing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__28);
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

	public static class OperationContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					element(0);
					setState(307);
					operator();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(314);
			element(0);
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

	public static class ElementContext extends ParserRuleContext {
		public ObjectMethodCallContext objectMethodCall() {
			return getRuleContext(ObjectMethodCallContext.class,0);
		}
		public NewObjectMethodCallContext newObjectMethodCall() {
			return getRuleContext(NewObjectMethodCallContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
		public TerminalNode Number() { return getToken(MiniJavaParser.Number, 0); }
		public TerminalNode FIXSTR() { return getToken(MiniJavaParser.FIXSTR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		return element(0);
	}

	private ElementContext element(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElementContext _localctx = new ElementContext(_ctx, _parentState);
		ElementContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_element, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(317);
				objectMethodCall();
				}
				break;
			case 2:
				{
				setState(318);
				newObjectMethodCall();
				}
				break;
			case 3:
				{
				setState(319);
				match(T__5);
				setState(320);
				element(0);
				setState(321);
				match(T__7);
				}
				break;
			case 4:
				{
				setState(323);
				newObject();
				}
				break;
			case 5:
				{
				setState(324);
				methodCall();
				}
				break;
			case 6:
				{
				setState(325);
				match(T__30);
				setState(327);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(326);
					matchWildcard();
					}
					break;
				}
				setState(329);
				match(T__30);
				}
				break;
			case 7:
				{
				setState(330);
				match(ID);
				}
				break;
			case 8:
				{
				setState(331);
				arrayItem();
				}
				break;
			case 9:
				{
				setState(332);
				match(Number);
				}
				break;
			case 10:
				{
				setState(333);
				match(FIXSTR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(336);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(337);
						match(T__29);
						setState(338);
						element(11);
						}
						break;
					case 2:
						{
						_localctx = new ElementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(339);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(340);
						operator();
						setState(341);
						element(9);
						}
						break;
					}
					} 
				}
				setState(347);
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

	public static class ArrayItemContext extends ParserRuleContext {
		public ArrayNameContext arrayName() {
			return getRuleContext(ArrayNameContext.class,0);
		}
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			arrayName();
			setState(349);
			match(T__15);
			setState(350);
			arrayIndex();
			setState(351);
			match(T__16);
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

	public static class ArrayNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ArrayNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayNameContext arrayName() throws RecognitionException {
		ArrayNameContext _localctx = new ArrayNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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

	public static class ArrayIndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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

	public static class ObjectMethodCallContext extends ParserRuleContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ObjectMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterObjectMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitObjectMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitObjectMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectMethodCallContext objectMethodCall() throws RecognitionException {
		ObjectMethodCallContext _localctx = new ObjectMethodCallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_objectMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			objectName();
			setState(358);
			match(T__29);
			setState(359);
			methodCall();
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

	public static class NewObjectMethodCallContext extends ParserRuleContext {
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NewObjectMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObjectMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewObjectMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewObjectMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewObjectMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjectMethodCallContext newObjectMethodCall() throws RecognitionException {
		NewObjectMethodCallContext _localctx = new NewObjectMethodCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_newObjectMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			newObject();
			setState(362);
			match(T__29);
			setState(363);
			methodCall();
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

	public static class ObjectNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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

	public static class NewObjectContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public NewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__31);
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				{
				setState(368);
				type();
				setState(369);
				match(T__15);
				setState(370);
				match(ID);
				setState(371);
				match(T__16);
				}
				}
				break;
			case 2:
				{
				{
				setState(373);
				match(ID);
				setState(374);
				match(T__5);
				setState(375);
				match(T__7);
				}
				}
				break;
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

	public static class MethodCallContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			methodName();
			setState(379);
			match(T__5);
			setState(381);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__30) | (1L << T__31) | (1L << ID) | (1L << Number) | (1L << FIXSTR))) != 0)) {
				{
				setState(380);
				callParams();
				}
			}

			setState(383);
			match(T__7);
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

	public static class CallParamsContext extends ParserRuleContext {
		public List<CallParameterContext> callParameter() {
			return getRuleContexts(CallParameterContext.class);
		}
		public CallParameterContext callParameter(int i) {
			return getRuleContext(CallParameterContext.class,i);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_callParams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					callParameter();
					setState(386);
					match(T__11);
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(393);
			callParameter();
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

	public static class CallParameterContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode FIXSTR() { return getToken(MiniJavaParser.FIXSTR, 0); }
		public CallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCallParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCallParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParameterContext callParameter() throws RecognitionException {
		CallParameterContext _localctx = new CallParameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_callParameter);
		try {
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				element(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(396);
				match(T__30);
				setState(400);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(397);
					matchWildcard();
					}
					break;
				case 2:
					{
					setState(398);
					match(T__11);
					}
					break;
				case 3:
					{
					setState(399);
					match(T__29);
					}
					break;
				}
				setState(402);
				match(T__30);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(FIXSTR);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return element_sempred((ElementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean element_sempred(ElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u019d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t\3\t\7\t\u0086"+
		"\n\t\f\t\16\t\u0089\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u009a\n\f\f\f\16\f\u009d\13\f\3\f\5\f\u00a0\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u00ac\n\20\f\20\16"+
		"\20\u00af\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\3\21\3\21"+
		"\3\21\5\21\u00bc\n\21\5\21\u00be\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\5\23\u00c7\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00db\n\26\f\26\16\26\u00de"+
		"\13\26\3\26\3\26\5\26\u00e2\n\26\3\26\5\26\u00e5\n\26\3\27\3\27\3\27\6"+
		"\27\u00ea\n\27\r\27\16\27\u00eb\3\27\3\27\3\27\5\27\u00f1\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u00f9\n\30\f\30\16\30\u00fc\13\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0106\n\32\3\32\3\32\3\32\7\32"+
		"\u010b\n\32\f\32\16\32\u010e\13\32\3\32\3\32\5\32\u0112\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011c\n\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0122\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0129\n\33\3\33\3\33\5\33\u012d"+
		"\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u0138\n\37\f\37"+
		"\16\37\u013b\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u014a"+
		"\n \3 \3 \3 \3 \3 \5 \u0151\n \3 \3 \3 \3 \3 \3 \3 \7 \u015a\n \f \16"+
		" \u015d\13 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u017b\n\'\3(\3(\3(\5(\u0180"+
		"\n(\3(\3(\3)\3)\3)\7)\u0187\n)\f)\16)\u018a\13)\3)\3)\3*\3*\3*\3*\3*\5"+
		"*\u0193\n*\3*\3*\5*\u0197\n*\3+\3+\3,\3,\3,\2\3>-\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\7\3\2/\60\3"+
		"\2\30\34\3\2\35\36\4\2#)//\3\2*.\u01a2\2X\3\2\2\2\4_\3\2\2\2\6e\3\2\2"+
		"\2\bg\3\2\2\2\nl\3\2\2\2\fu\3\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22\u008c\3"+
		"\2\2\2\24\u008e\3\2\2\2\26\u0093\3\2\2\2\30\u00a3\3\2\2\2\32\u00a6\3\2"+
		"\2\2\34\u00a8\3\2\2\2\36\u00ad\3\2\2\2 \u00bd\3\2\2\2\"\u00bf\3\2\2\2"+
		"$\u00c3\3\2\2\2&\u00c8\3\2\2\2(\u00cc\3\2\2\2*\u00d4\3\2\2\2,\u00e6\3"+
		"\2\2\2.\u00f2\3\2\2\2\60\u00ff\3\2\2\2\62\u0105\3\2\2\2\64\u012c\3\2\2"+
		"\2\66\u012e\3\2\2\28\u0130\3\2\2\2:\u0132\3\2\2\2<\u0139\3\2\2\2>\u0150"+
		"\3\2\2\2@\u015e\3\2\2\2B\u0163\3\2\2\2D\u0165\3\2\2\2F\u0167\3\2\2\2H"+
		"\u016b\3\2\2\2J\u016f\3\2\2\2L\u0171\3\2\2\2N\u017c\3\2\2\2P\u0188\3\2"+
		"\2\2R\u0196\3\2\2\2T\u0198\3\2\2\2V\u019a\3\2\2\2X\\\5\4\3\2Y[\5\20\t"+
		"\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\3\3\2\2\2^\\\3\2\2\2_`\7"+
		"\3\2\2`a\5\6\4\2ab\7\4\2\2bc\5\b\5\2cd\7\5\2\2d\5\3\2\2\2ef\7/\2\2f\7"+
		"\3\2\2\2gh\5\n\6\2hi\7\4\2\2ij\5\36\20\2jk\7\5\2\2k\t\3\2\2\2lm\7\6\2"+
		"\2mn\7\7\2\2no\5\f\7\2op\5\16\b\2pq\7\b\2\2qr\7\t\2\2rs\7/\2\2st\7\n\2"+
		"\2t\13\3\2\2\2uv\7\13\2\2v\r\3\2\2\2wx\7\f\2\2x\17\3\2\2\2yz\7\3\2\2z"+
		"{\5\22\n\2{\u0081\7\4\2\2|}\5$\23\2}~\7\r\2\2~\u0080\3\2\2\2\177|\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5\24\13\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\5\2\2\u008b\21\3\2\2\2\u008c"+
		"\u008d\7/\2\2\u008d\23\3\2\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7\4\2"+
		"\2\u0090\u0091\5\36\20\2\u0091\u0092\7\5\2\2\u0092\25\3\2\2\2\u0093\u0094"+
		"\5\32\16\2\u0094\u0095\5\34\17\2\u0095\u009b\7\b\2\2\u0096\u0097\5\30"+
		"\r\2\u0097\u0098\7\16\2\2\u0098\u009a\3\2\2\2\u0099\u0096\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\5\30\r\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2\27\3\2\2"+
		"\2\u00a3\u00a4\5T+\2\u00a4\u00a5\7/\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\5"+
		"T+\2\u00a7\33\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\35\3\2\2\2\u00aa\u00ac"+
		"\5 \21\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b7\7\17\2"+
		"\2\u00b1\u00b7\5\"\22\2\u00b2\u00b7\5$\23\2\u00b3\u00b7\5(\25\2\u00b4"+
		"\u00b7\5&\24\2\u00b5\u00b7\5\60\31\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3"+
		"\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00be\7\r\2\2\u00b9\u00bc\5*"+
		"\26\2\u00ba\u00bc\5.\30\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be!\3\2\2\2"+
		"\u00bf\u00c0\7\20\2\2\u00c0\u00c1\5<\37\2\u00c1\u00c2\7\n\2\2\u00c2#\3"+
		"\2\2\2\u00c3\u00c6\5T+\2\u00c4\u00c7\7/\2\2\u00c5\u00c7\5&\24\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7%\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9"+
		"\u00ca\7\21\2\2\u00ca\u00cb\5<\37\2\u00cb\'\3\2\2\2\u00cc\u00cd\7/\2\2"+
		"\u00cd\u00ce\7\22\2\2\u00ce\u00cf\t\2\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\5<\37\2\u00d3)\3\2\2\2\u00d4"+
		"\u00d5\7\24\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00d7\5\62\32\2\u00d7\u00e1"+
		"\7\n\2\2\u00d8\u00dc\7\4\2\2\u00d9\u00db\5 \21\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e2\7\5\2\2\u00e0\u00e2\5 \21\2\u00e1"+
		"\u00d8\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\5,"+
		"\27\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00f0"+
		"\7\25\2\2\u00e7\u00e9\7\4\2\2\u00e8\u00ea\5 \21\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\7\5\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\5 \21\2\u00f0"+
		"\u00e7\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1-\3\2\2\2\u00f2\u00f3\7\26\2\2"+
		"\u00f3\u00f4\7\b\2\2\u00f4\u00f5\5\62\32\2\u00f5\u00f6\7\n\2\2\u00f6\u00fa"+
		"\7\4\2\2\u00f7\u00f9\5 \21\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\7\5\2\2\u00fe/\3\2\2\2\u00ff\u0100\7\27\2\2\u0100\u0101"+
		"\t\2\2\2\u0101\61\3\2\2\2\u0102\u0103\5:\36\2\u0103\u0104\7\b\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010c\3\2"+
		"\2\2\u0107\u0108\5\64\33\2\u0108\u0109\58\35\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\5\64\33\2\u0110"+
		"\u0112\7\n\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\63\3\2\2"+
		"\2\u0113\u0114\7\b\2\2\u0114\u0115\5\64\33\2\u0115\u0116\7\n\2\2\u0116"+
		"\u012d\3\2\2\2\u0117\u011b\5<\37\2\u0118\u0119\5\66\34\2\u0119\u011a\5"+
		"<\37\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u012d\3\2\2\2\u011d\u011e\5:\36\2\u011e\u011f\5<\37\2\u011f\u012d\3\2"+
		"\2\2\u0120\u0122\5:\36\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\7\b\2\2\u0124\u0128\5<\37\2\u0125\u0126\5\66"+
		"\34\2\u0126\u0127\5<\37\2\u0127\u0129\3\2\2\2\u0128\u0125\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\n\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u0113\3\2\2\2\u012c\u0117\3\2\2\2\u012c\u011d\3\2\2\2\u012c"+
		"\u0121\3\2\2\2\u012d\65\3\2\2\2\u012e\u012f\t\3\2\2\u012f\67\3\2\2\2\u0130"+
		"\u0131\t\4\2\2\u01319\3\2\2\2\u0132\u0133\7\37\2\2\u0133;\3\2\2\2\u0134"+
		"\u0135\5> \2\u0135\u0136\5V,\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2"+
		"\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\5> \2\u013d=\3\2\2\2\u013e\u013f"+
		"\b \1\2\u013f\u0151\5F$\2\u0140\u0151\5H%\2\u0141\u0142\7\b\2\2\u0142"+
		"\u0143\5> \2\u0143\u0144\7\n\2\2\u0144\u0151\3\2\2\2\u0145\u0151\5L\'"+
		"\2\u0146\u0151\5N(\2\u0147\u0149\7!\2\2\u0148\u014a\13\2\2\2\u0149\u0148"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0151\7!\2\2\u014c"+
		"\u0151\7/\2\2\u014d\u0151\5@!\2\u014e\u0151\7\60\2\2\u014f\u0151\7\61"+
		"\2\2\u0150\u013e\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0141\3\2\2\2\u0150"+
		"\u0145\3\2\2\2\u0150\u0146\3\2\2\2\u0150\u0147\3\2\2\2\u0150\u014c\3\2"+
		"\2\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u015b\3\2\2\2\u0152\u0153\f\f\2\2\u0153\u0154\7 \2\2\u0154\u015a\5> "+
		"\r\u0155\u0156\f\n\2\2\u0156\u0157\5V,\2\u0157\u0158\5> \13\u0158\u015a"+
		"\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0155\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c?\3\2\2\2\u015d\u015b\3\2\2\2"+
		"\u015e\u015f\5B\"\2\u015f\u0160\7\22\2\2\u0160\u0161\5D#\2\u0161\u0162"+
		"\7\23\2\2\u0162A\3\2\2\2\u0163\u0164\7/\2\2\u0164C\3\2\2\2\u0165\u0166"+
		"\7/\2\2\u0166E\3\2\2\2\u0167\u0168\5J&\2\u0168\u0169\7 \2\2\u0169\u016a"+
		"\5N(\2\u016aG\3\2\2\2\u016b\u016c\5L\'\2\u016c\u016d\7 \2\2\u016d\u016e"+
		"\5N(\2\u016eI\3\2\2\2\u016f\u0170\7/\2\2\u0170K\3\2\2\2\u0171\u017a\7"+
		"\"\2\2\u0172\u0173\5T+\2\u0173\u0174\7\22\2\2\u0174\u0175\7/\2\2\u0175"+
		"\u0176\7\23\2\2\u0176\u017b\3\2\2\2\u0177\u0178\7/\2\2\u0178\u0179\7\b"+
		"\2\2\u0179\u017b\7\n\2\2\u017a\u0172\3\2\2\2\u017a\u0177\3\2\2\2\u017b"+
		"M\3\2\2\2\u017c\u017d\5\34\17\2\u017d\u017f\7\b\2\2\u017e\u0180\5P)\2"+
		"\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\7\n\2\2\u0182O\3\2\2\2\u0183\u0184\5R*\2\u0184\u0185\7\16\2\2\u0185\u0187"+
		"\3\2\2\2\u0186\u0183\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5R"+
		"*\2\u018cQ\3\2\2\2\u018d\u0197\5> \2\u018e\u0192\7!\2\2\u018f\u0193\13"+
		"\2\2\2\u0190\u0193\7\16\2\2\u0191\u0193\7 \2\2\u0192\u018f\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\7!"+
		"\2\2\u0195\u0197\7\61\2\2\u0196\u018d\3\2\2\2\u0196\u018e\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u0197S\3\2\2\2\u0198\u0199\t\5\2\2\u0199U\3\2\2\2\u019a"+
		"\u019b\t\6\2\2\u019bW\3\2\2\2#\\\u0081\u0087\u009b\u009f\u00ad\u00b6\u00bb"+
		"\u00bd\u00c6\u00dc\u00e1\u00e4\u00eb\u00f0\u00fa\u0105\u010c\u0111\u011b"+
		"\u0121\u0128\u012c\u0139\u0149\u0150\u0159\u015b\u017a\u017f\u0188\u0192"+
		"\u0196";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
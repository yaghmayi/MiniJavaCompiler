// Generated from MiniJava.g4 by ANTLR 4.4

	package cc1.ay222cg.examples;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__43=1, T__42=2, T__41=3, T__40=4, T__39=5, T__38=6, T__37=7, T__36=8, 
		T__35=9, T__34=10, T__33=11, T__32=12, T__31=13, T__30=14, T__29=15, T__28=16, 
		T__27=17, T__26=18, T__25=19, T__24=20, T__23=21, T__22=22, T__21=23, 
		T__20=24, T__19=25, T__18=26, T__17=27, T__16=28, T__15=29, T__14=30, 
		T__13=31, T__12=32, T__11=33, T__10=34, T__9=35, T__8=36, T__7=37, T__6=38, 
		T__5=39, T__4=40, T__3=41, T__2=42, T__1=43, T__0=44, ID=45, Number=46, 
		FIXSTR=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'"
	};
	public static final String[] ruleNames = {
		"T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", "T__36", 
		"T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", 
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ID", "Number", "FIXSTR", "WS", "COMMENT", "LINE_COMMENT"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u015b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\7.\u0129\n.\f.\16.\u012c\13.\3/\6/"+
		"\u012f\n/\r/\16/\u0130\3\60\3\60\7\60\u0135\n\60\f\60\16\60\u0138\13\60"+
		"\3\60\3\60\3\61\6\61\u013d\n\61\r\61\16\61\u013e\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\7\62\u0147\n\62\f\62\16\62\u014a\13\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\7\63\u0155\n\63\f\63\16\63\u0158\13\63\3\63\3"+
		"\63\3\u0148\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7n\3\2\2\2"+
		"\ts\3\2\2\2\13w\3\2\2\2\r~\3\2\2\2\17\u0087\3\2\2\2\21\u008d\3\2\2\2\23"+
		"\u0090\3\2\2\2\25\u0096\3\2\2\2\27\u00aa\3\2\2\2\31\u00ac\3\2\2\2\33\u00b1"+
		"\3\2\2\2\35\u00b3\3\2\2\2\37\u00b6\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2"+
		"\2%\u00c2\3\2\2\2\'\u00c5\3\2\2\2)\u00c8\3\2\2\2+\u00ce\3\2\2\2-\u00d2"+
		"\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2"+
		"\2\2\67\u00dc\3\2\2\29\u00e2\3\2\2\2;\u00ea\3\2\2\2=\u00ed\3\2\2\2?\u00ef"+
		"\3\2\2\2A\u00f6\3\2\2\2C\u00f9\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I"+
		"\u0104\3\2\2\2K\u0106\3\2\2\2M\u0108\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2"+
		"\2\2S\u0116\3\2\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2Y\u011c\3\2\2\2[\u0126"+
		"\3\2\2\2]\u012e\3\2\2\2_\u0132\3\2\2\2a\u013c\3\2\2\2c\u0142\3\2\2\2e"+
		"\u0150\3\2\2\2gh\7\61\2\2h\4\3\2\2\2ij\7o\2\2jk\7c\2\2kl\7k\2\2lm\7p\2"+
		"\2m\6\3\2\2\2no\7e\2\2op\7j\2\2pq\7c\2\2qr\7t\2\2r\b\3\2\2\2st\7p\2\2"+
		"tu\7g\2\2uv\7y\2\2v\n\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7v\2\2z{\7w\2\2{|\7"+
		"t\2\2|}\7p\2\2}\f\3\2\2\2~\177\7U\2\2\177\u0080\7v\2\2\u0080\u0081\7t"+
		"\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084\u0085"+
		"\7]\2\2\u0085\u0086\7_\2\2\u0086\16\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089"+
		"\7n\2\2\u0089\u008a\7c\2\2\u008a\u008b\7u\2\2\u008b\u008c\7u\2\2\u008c"+
		"\20\3\2\2\2\u008d\u008e\7~\2\2\u008e\u008f\7~\2\2\u008f\22\3\2\2\2\u0090"+
		"\u0091\7y\2\2\u0091\u0092\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2"+
		"\u0094\u0095\7g\2\2\u0095\24\3\2\2\2\u0096\u0097\7U\2\2\u0097\u0098\7"+
		"{\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7o\2\2\u009c\u009d\7\60\2\2\u009d\u009e\7q\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7\60\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7t\2"+
		"\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7*\2\2\u00a9\26\3\2\2\2\u00aa\u00ab"+
		"\7=\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7x\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7f\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2\34"+
		"\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b5\7(\2\2\u00b5\36\3\2\2\2\u00b6"+
		"\u00b7\7K\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\u00bb\7i\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2\u00bd \3\2\2"+
		"\2\u00be\u00bf\7?\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\7\177\2\2\u00c1$\3\2"+
		"\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4&\3\2\2\2\u00c5\u00c6"+
		"\7>\2\2\u00c6\u00c7\7?\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca"+
		"\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7m\2\2\u00cd"+
		"*\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\7)\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7*\2\2\u00d5\60"+
		"\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9"+
		"\64\3\2\2\2\u00da\u00db\7\60\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7]\2\2\u00e0\u00e1\7_\2\2"+
		"\u00e18\3\2\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7q\2"+
		"\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9"+
		"\7p\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec\7?\2\2\u00ec<\3"+
		"\2\2\2\u00ed\u00ee\7]\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7U\2\2\u00f0\u00f1"+
		"\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7i\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8\7?\2\2\u00f8"+
		"B\3\2\2\2\u00f9\u00fa\7>\2\2\u00faD\3\2\2\2\u00fb\u00fc\7_\2\2\u00fcF"+
		"\3\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7d\2\2\u0100"+
		"\u0101\7n\2\2\u0101\u0102\7k\2\2\u0102\u0103\7e\2\2\u0103H\3\2\2\2\u0104"+
		"\u0105\7@\2\2\u0105J\3\2\2\2\u0106\u0107\7#\2\2\u0107L\3\2\2\2\u0108\u0109"+
		"\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7k\2\2\u010d\u010e\7e\2\2\u010eN\3\2\2\2\u010f\u0110\7\'\2\2\u0110"+
		"P\3\2\2\2\u0111\u0112\7g\2\2\u0112\u0113\7n\2\2\u0113\u0114\7u\2\2\u0114"+
		"\u0115\7g\2\2\u0115R\3\2\2\2\u0116\u0117\7+\2\2\u0117T\3\2\2\2\u0118\u0119"+
		"\7-\2\2\u0119V\3\2\2\2\u011a\u011b\7/\2\2\u011bX\3\2\2\2\u011c\u011d\7"+
		"E\2\2\u011d\u011e\7j\2\2\u011e\u011f\7c\2\2\u011f\u0120\7t\2\2\u0120\u0121"+
		"\7c\2\2\u0121\u0122\7e\2\2\u0122\u0123\7v\2\2\u0123\u0124\7g\2\2\u0124"+
		"\u0125\7t\2\2\u0125Z\3\2\2\2\u0126\u012a\t\2\2\2\u0127\u0129\t\3\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\\\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\t\4\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"^\3\2\2\2\u0132\u0136\7$\2\2\u0133\u0135\n\5\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7$\2\2\u013a`\3\2\2\2\u013b\u013d"+
		"\t\6\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\61\2\2\u0141b\3\2\2\2"+
		"\u0142\u0143\7\61\2\2\u0143\u0144\7,\2\2\u0144\u0148\3\2\2\2\u0145\u0147"+
		"\13\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c"+
		"\7,\2\2\u014c\u014d\7\61\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b\62\2\2"+
		"\u014fd\3\2\2\2\u0150\u0151\7\61\2\2\u0151\u0152\7\61\2\2\u0152\u0156"+
		"\3\2\2\2\u0153\u0155\n\5\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u015a\b\63\2\2\u015af\3\2\2\2\t\2\u012a\u0130\u0136\u013e\u0148"+
		"\u0156\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package runner.strGeneration;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.omg.CORBA.Object;

import cc1.grammar.examples.MiniJavaLexer;
import cc1.grammar.examples.MiniJavaParser;

public class StructureGenerator 
{
	public static ProgramStr generateStr(String javaFilePath) throws Exception
	{
		ProgramStr programStr = null;
		try
		{
			StrGenerationVisitor<Object> strGenVisitor = new StrGenerationVisitor<>();
			strGenVisitor.visit(getParsTree(javaFilePath));
			programStr = strGenVisitor.getProgramStr();
		}
		catch (Exception ex)
		{
			throw ex;
		}
		
		return programStr;
	}
	
	private static ParseTree getParsTree(String filePath) throws Exception
	{
		try
		{
			File file = new File(filePath);
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
			MiniJavaLexer lexer = new MiniJavaLexer(input);
			MiniJavaParser parser = new MiniJavaParser(new BufferedTokenStream(lexer));
			ParseTree tree = parser.program();
			
			return tree;
		}
		catch (Exception ex)
		{
			throw ex;
		}
	}
}

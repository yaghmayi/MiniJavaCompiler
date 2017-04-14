package ay222cg_PA2.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.omg.CORBA.Object;

import ay222cg_PA2.errors.Error;
import ay222cg_PA2.symbolTbl.SymbolTable;
import ay222cg_PA2.visitors.SemanticVisitor;
import ay222cg_PA2.visitors.SymTblVisitor;
import cc1.ay222cg.examples.*;

public class MiniJavaCompiler 
{
	private static List<Error> errors = new ArrayList<Error>();
	
	public static List<Error> getErrors()
	{
		return errors;
	}
	
	public static List<SymbolTable> createSymbolTablesFromFolder(String folderPath) throws Exception 
	{
		List<SymbolTable> symblTables = new ArrayList<SymbolTable>();
		File folder = new File(folderPath);
		System.out.println(folderPath + ": ");
		
		try
		{
			for (final File fileEntry : folder.listFiles()) 
			{
		        if (fileEntry.isFile() && fileEntry.getName().endsWith(".java")) 
		        	symblTables.add(createSymbolTableFromFile(fileEntry.getPath()));
		    }
		}
		catch (Exception ex)
		{
			throw ex;
		}
		
		return symblTables;
	}
	
	public static SymbolTable createSymbolTableFromFile(String filePath) throws Exception
	{
		SymbolTable symblTable = null;
		System.out.println("- "  + filePath);
		if (filePath.endsWith(".java"))
		{
			try
			{
				SymTblVisitor<Object> symTblVisitor = new SymTblVisitor<>();
				symTblVisitor.visit(getParsTree(filePath));
				symTblVisitor.getSymbolTable().resetTable();
				symblTable = symTblVisitor.getSymbolTable();
		
			}
			catch (Exception ex)
			{
				throw ex;
			}
		}
		
		return symblTable;
	}
	
	public static boolean compileFile(String filePath) throws Exception 
	{
		if (filePath.endsWith(".java"))
		{
			try
			{
				SymbolTable symbolTable = createSymbolTableFromFile(filePath);
				SemanticVisitor<Object> semanticVisitor = new SemanticVisitor<>(symbolTable);
				semanticVisitor.visit(getParsTree(filePath));
				errors = semanticVisitor.getErrors();
				
				if (errors.size() == 0)
				{
					System.out.println("compiled successfully.\n");
					return true;
				}
				else
				{
					semanticVisitor.printErrors();
					System.out.println("");
					return false;
				}
			}
			catch (Exception ex)
			{
				throw ex;
			}
		}
		System.out.println("It is not a java file.");
			return true;
	}
	
	public static boolean compileFolder(String folderPath) throws Exception 
	{
		boolean folderCompile = true;
		
		File folder = new File(folderPath);
		System.out.println(folderPath + ": ");
		for (final File fileEntry : folder.listFiles()) 
		{
	        if (fileEntry.isFile() && fileEntry.getName().endsWith(".java")) 
	        {
	        	boolean fileCompile = compileFile(fileEntry.getPath());
	        	if (!fileCompile)
	        		folderCompile = false;
	        }
	    }
		
		return folderCompile;
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

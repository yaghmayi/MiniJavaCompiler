package compiler.unitTests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import compiler.main.MiniJavaCompiler;
import compiler.symbolTbl.SymbolTable;

public class MiniJavaCompilerTest 
{
	protected boolean compilerResult;
	protected boolean exceptionHappen;
	protected String baseFolder = null;
	
	@Before
	public void setup()
	{
		compilerResult = false;
		exceptionHappen = false;
		
		baseFolder = new File("").getAbsolutePath() + "\\src\\compiler\\unitTests\\";
	}
	
	protected void compile(String filePath)
	{
		try
		{
			compilerResult = MiniJavaCompiler.compileFile(filePath);
		}
		catch(Exception ex)
		{
			exceptionHappen = true;
			ex.printStackTrace(System.out);
		}
	}
	
	protected SymbolTable createSymbolTableFromFile(String filePath)
	{
		SymbolTable symbolTable = null;
		try
		{
			symbolTable = MiniJavaCompiler.createSymbolTableFromFile(filePath);
		}
		catch(Exception ex)
		{
			exceptionHappen = true;
			ex.printStackTrace(System.out);
		}
		
		return symbolTable;
	}
	
	protected List<SymbolTable> createSymbolTablesFromFolder(String folderPath)
	{
		List<SymbolTable> symbolTables = new ArrayList<SymbolTable>();
		
		try
		{
			symbolTables = MiniJavaCompiler.createSymbolTablesFromFolder(folderPath);
		}
		catch(Exception ex)
		{
			exceptionHappen = true;
			ex.printStackTrace(System.out);
		}
		
		return symbolTables;
	}
}

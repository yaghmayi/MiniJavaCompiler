package ay222cg_PA2.unitTests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ay222cg_PA2.symbolTbl.ParameterRecord;
import ay222cg_PA2.symbolTbl.Record;
import ay222cg_PA2.symbolTbl.Scope;
import ay222cg_PA2.symbolTbl.SymbolTable;
import ay222cg_PA2.symbolTbl.VariableRecord;

public class MiniJavaCreateSymbolTableTest extends MiniJavaCompilerTest
{
	@Test
	public void methodParam()
	{
		SymbolTable symTbl = createSymbolTableFromFile(baseFolder + "\\SymTblSamples\\MethodParam.java");
		System.out.println();
		Assert.assertFalse(exceptionHappen);
		Assert.assertNotNull(symTbl);
		
		Scope programScope = symTbl.getCurrentScope();
		Scope classScope = programScope.getChildScope("MethodParam");
		Assert.assertNotNull(classScope);
		
		Scope methodScope = classScope.getChildScope("Test");
		Assert.assertNotNull(methodScope);
		
		assertParameterRecord(methodScope.getRecord("index"), "int");
		assertParameterRecord(methodScope.getRecord("s"), "String");
		assertVariableRecord(methodScope.getRecord("i"), "int");
		assertVariableRecord(methodScope.getRecord("foo"), "String");
		assertVariableRecord(methodScope.getRecord("arr"), "int[]");
	}
	
	@Test
	public void classField()
	{
		SymbolTable symTbl = createSymbolTableFromFile(baseFolder + "\\SymTblSamples\\ClassField.java");
		System.out.println();
		Assert.assertFalse(exceptionHappen);
		Assert.assertNotNull(symTbl);
		
		Scope programScope = symTbl.getCurrentScope();
		Scope classScope = programScope.getChildScope("ClassField");
		Assert.assertNotNull(classScope);
		
		Scope methodScope = classScope.getChildScope("Test");
		Assert.assertNotNull(methodScope);
		
		assertVariableRecord(classScope.getRecord("size"), "int");
		assertVariableRecord(classScope.getRecord("flag"), "boolean");
		Assert.assertFalse(methodScope.containsRecord("size"));
		Assert.assertFalse(methodScope.containsRecord("flag"));
	}
	
	@Test
	public void mainClass()
	{
		SymbolTable symTbl = createSymbolTableFromFile(baseFolder + "\\SymTblSamples\\MainClass.java");
		System.out.println();
		Assert.assertFalse(exceptionHappen);
		Assert.assertNotNull(symTbl);
		
		Scope programScope = symTbl.getCurrentScope();
		Scope classScope = programScope.getChildScope("MainClass");
		Assert.assertNotNull(classScope);
		
		Scope methodScope = classScope.getChildScope("main");
		Assert.assertNotNull(methodScope);
		
		Assert.assertTrue(methodScope.containsRecord("i"));
		Assert.assertTrue(methodScope.containsRecord("s"));
	}
	
	@Test
	public void symboleTableFromFailSamples()
	{
		List<SymbolTable> symbolTables = createSymbolTablesFromFolder(baseFolder + "\\FailSamples");
		System.out.println();
		Assert.assertFalse(exceptionHappen);
		Assert.assertEquals(15, symbolTables.size());
	}
	
	@Test
	public void symboleTableFromPassSmples()
	{
		List<SymbolTable> symbolTables = createSymbolTablesFromFolder(baseFolder + "\\PassSamples");
		System.out.println();
		Assert.assertFalse(exceptionHappen);
		Assert.assertEquals(15, symbolTables.size());
	}
	
	private void assertParameterRecord(Record record, String type)
	{
		Assert.assertNotNull(record);
		Assert.assertTrue(record instanceof ParameterRecord);
		Assert.assertEquals(type, ((ParameterRecord) record).getType());
	}
	
	private void assertVariableRecord(Record record, String type)
	{
		Assert.assertNotNull(record);
		Assert.assertTrue(record instanceof VariableRecord);
		Assert.assertEquals(type, ((VariableRecord) record).getType());
	}
}

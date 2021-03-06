package runner.unitTests;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ay222cg_PA3.codeGeneration.ClassFile;
import ay222cg_PA3.codeGeneration.CodeGenerator;
import runner.base.FileHelper;
import runner.strGeneration.ProgramStr;
import runner.strGeneration.StructureGenerator;

public class CodeGeneratorTest 
{
	private boolean exceptionHappen = false;
	private String baseFolder;
	

	@Before
	public void setup()
	{
		exceptionHappen = false;
		baseFolder = new File("").getAbsolutePath() + "\\src\\runner\\unitTests\\Samples\\";
	}
	
	@Test
	public void test()
	{
		File folder = new File(baseFolder);
		for (final File fileEntry : folder.listFiles()) 
		{
//			System.out.println(fileEntry.getName());
	        if (fileEntry.isFile() && fileEntry.getName().endsWith(".java"))
	        {
	        	AssertFile(fileEntry.getPath());
//	        	StrGen(fileEntry.getPath());
	        }

	    }
	}
	
	private void StrGen(String filePath)
	{
		try
		{
			ProgramStr pstr = StructureGenerator.generateStr(filePath);
			pstr.Print();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private boolean AssertFile(String filePath)
	{
		ClassFile classFile = generateCode(filePath);
		
		String tjcFilePath = filePath.replace(".java", ".tjc");
		classFile.save(tjcFilePath);
		
		try
		{
			String content = FileHelper.readFile(tjcFilePath);
			String expectedTjcFileName = tjcFilePath.replace(".tjc", "Expected.tjc");
			String expectedContent = FileHelper.readFile(expectedTjcFileName);
			Assert.assertFalse(exceptionHappen);
			Assert.assertEquals(expectedContent, content);
		}
		catch (Exception ex)
		{
			System.out.println(ex.toString());
		}
		return false;
	}
	
	private ClassFile generateCode(String filePath)
	{
		ClassFile classFile = null;
		try
		{
			classFile = CodeGenerator.generateCode(filePath);
		}
		catch (Exception ex)
		{
			exceptionHappen = true;
			ex.printStackTrace(System.out);
		}
		
		return classFile;
	}
}

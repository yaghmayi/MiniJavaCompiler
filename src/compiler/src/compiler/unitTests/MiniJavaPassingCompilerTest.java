package compiler.unitTests;

import org.junit.Assert;
import org.junit.Test;

import compiler.main.MiniJavaCompiler;

public class MiniJavaPassingCompilerTest extends MiniJavaCompilerTest
{
	@Test
	public void compilePassSamples()
	{
		compileFolder(baseFolder + "\\PassSamples");
		Assert.assertFalse(exceptionHappen);
		Assert.assertTrue(compilerResult);
		Assert.assertEquals(0, MiniJavaCompiler.getErrors().size());
	}
	
	private void compileFolder(String folderPath)
	{
		try
		{
			compilerResult = MiniJavaCompiler.compileFolder(folderPath);
		}
		catch(Exception ex)
		{
			exceptionHappen = true;
			ex.printStackTrace(System.out);
		}
	}
}

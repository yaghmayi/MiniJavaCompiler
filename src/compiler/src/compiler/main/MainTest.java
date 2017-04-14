package compiler.main;

import java.io.File;

public class  MainTest 
{
	public static void main(String[] arg) throws Exception
	{
		String baseFolder = new File("").getAbsolutePath() + "\\src\\compiler\\main\\MainTestSamples\\";
		String javaFilePath = baseFolder + "mychar.java";
		MiniJavaCompiler.compileFile(javaFilePath);
	}
}

package ay222cg_PA2.main;

import java.io.File;

public class  MainTest 
{
	public static void main(String[] arg) throws Exception
	{
		String baseFolder = new File("").getAbsolutePath() + "\\src\\ay222cg_PA2\\main\\MainTestSamples\\";
		String javaFilePath = baseFolder + "mychar.java";
		MiniJavaCompiler.compileFile(javaFilePath);
	}
}

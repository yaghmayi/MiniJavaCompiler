package ay222cg_PA3.main;

import java.io.File;

import ay222cg_PA3.runner.CodeRunner;

public class Inrepreter 
{
	public static void main(String[] arg) 
	{
		String baseFolder = new File("").getAbsolutePath() + "\\src\\ay222cg_PA3\\main\\Samples\\";
		String tjcFilePath = baseFolder + "Sum.tjc";
		CodeRunner.run(tjcFilePath);
	}
}

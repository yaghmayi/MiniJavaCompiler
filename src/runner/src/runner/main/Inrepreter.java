package runner.main;

import java.io.File;

import runner.components.CodeRunner;

public class Inrepreter 
{
	public static void main(String[] arg) 
	{
		String baseFolder = new File("").getAbsolutePath() + "\\src\\runner\\main\\Samples\\";
		String tjcFilePath = baseFolder + "Sum.tjc";
		CodeRunner.run(tjcFilePath);
	}
}

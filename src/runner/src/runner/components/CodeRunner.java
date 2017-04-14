package runner.components;

import ay222cg_PA3.codeGeneration.ClassFile;
import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;
import ay222cg_PA3.codeGeneration.Method;
import runner.base.FileHelper;

public class CodeRunner 
{
	public static void run(String tjcFilePath)
	{
		ClassFile classFile = getClassFile(tjcFilePath);
		ClassFileRunner classFileRunner = new ClassFileRunner(classFile);
		classFileRunner.run();
	}
	
	private static ClassFile getClassFile(String filePath)
	{
		String content = FileHelper.readFile(filePath);
		ClassFile classFile = new ClassFile();
		Method currentMethod = null;
		for (String line : content.split("\n"))
		{
			line = line.trim().replace("\t", " ");
			if (!line.equals("\n") && !line.equals(""))
			{
				String[] splitedLine = line.split(" ");
				String icodeString = null;
				if (splitedLine.length == 1)
					icodeString = splitedLine[0];
				else
					icodeString = splitedLine[1];
				
				if (ICodes.isIcode(icodeString))
				{
					ICodes icode = ICodes.getIcode(icodeString);
					String argument = null;
					if (splitedLine.length > 2)
						argument = splitedLine[2];
					
					Instruction instructio = new Instruction(icode, argument);
					currentMethod.AddInstruction(instructio);
				}
				else
				{
					currentMethod = new Method(line);
					classFile.addMethod(currentMethod);
				}
			}
		}
		
		return classFile;
	}

}

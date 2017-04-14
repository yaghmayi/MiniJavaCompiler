package ay222cg_PA3.codeGeneration;

import runner.strGeneration.ClassStr;
import runner.strGeneration.MethodStr;
import runner.strGeneration.ProgramStr;
import runner.strGeneration.StatementStr;
import runner.strGeneration.StructureGenerator;

public class CodeGenerator 
{
	public static ClassFile generateCode(String javaFilePath) throws Exception
	{
		ProgramStr programStr = StructureGenerator.generateStr(javaFilePath);
		ClassFile classFile = new ClassFile();
		
		for (ClassStr classStr : programStr.getClasses())
		{
			for (MethodStr methodStr : classStr.getMethods())
			{
				Method method = new Method(classStr.getName() + "." + methodStr.getName());
				
				for (String param : methodStr.getParams())
					method.AddInstruction(new Instruction(ICodes.IStore, param));
				
				for (StatementStr statementStr : methodStr.getStatements())
				{
					method.AddInstructions(statementStr.createInstructions());
					if (methodStr.getName().equals("main"))
						method.AddInstruction(new Instruction(ICodes.Stop));
				}
				
				for (int i=0; i<method.getInstructionsSize(); i++)
				{
					Instruction instruction = method.getInstruction(i);
					
					if (instruction.getCode().equals(ICodes.ILoad) || instruction.getCode().equals(ICodes.IStore))
						instruction.setArgument("#" + methodStr.getVariables().indexOf(instruction.getArgument()));
					else if (instruction.getCode().equals(ICodes.If_false) || instruction.getCode().equals(ICodes.Goto))
					{
						int jumpAddress = Integer.parseInt(instruction.getArgument().toString());
						jumpAddress = jumpAddress + i;
						instruction.setArgument(jumpAddress);
					}
				}
				
				classFile.addMethod(method);
			}
		}
		
		return classFile;
	}
}

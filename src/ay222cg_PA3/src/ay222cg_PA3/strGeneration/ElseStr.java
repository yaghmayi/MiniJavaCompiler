package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.Instruction;

public class ElseStr extends BlockStatementStr
{
	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		
		for (StatementStr statement : this.getStatements())
			instructions.addAll(statement.createInstructions());
		
		return instructions;
	}
}

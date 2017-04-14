package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class PrintStr extends StatementStr 
{
	private OperationStr operation;

	public void setOperation(OperationStr operation) 
	{
		this.operation = operation;
	}

	@Override
	public String toString() 
	{
		String str = "Print(";
		
		if (operation != null)
			str += operation.toString();
		
		str += ")";
		
		return str;
	}

	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		instructions.addAll(operation.createInstructions());
		instructions.add(new Instruction(ICodes.Print));
		
		return instructions;
	}

	
	
	
	
}

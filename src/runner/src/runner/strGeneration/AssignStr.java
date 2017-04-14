package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.Instruction;

public class AssignStr extends StatementStr 
{	
	private IdentifierStr assignTo;
	private OperationStr assignFrom;
	
	public void setAssignTo(IdentifierStr assignTo) 
	{
		this.assignTo = assignTo;
	}
	
	public void setAssignFrom(OperationStr assignFrom) 
	{
		this.assignFrom = assignFrom;
	}

	@Override
	public String toString() 
	{
		String str = assignTo.getName() + " = " + assignFrom.toString();
		
		return str;
	}

	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		
		instructions.addAll(assignFrom.createInstructions());
		instructions.add(assignTo.createStoreInstruction());
		
		return instructions;
	}
}

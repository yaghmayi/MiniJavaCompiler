package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class ReturnStr extends StatementStr
{
	private SimpleElementStr returnElement;
	
	public ReturnStr(SimpleElementStr returnElement) 
	{
		this.returnElement = returnElement;
	}

	@Override
	public String toString() 
	{
		String str = "return " + returnElement.getText();
		
		return str;
	}

	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		
		if (returnElement instanceof IdentifierStr)
			instructions.add(new Instruction(ICodes.ILoad, returnElement.getText()));
		else if (returnElement instanceof NumberStr)
			instructions.add(new Instruction(ICodes.IConst, returnElement.getText()));
		
		instructions.add(new Instruction(ICodes.IReturn));
		
		return instructions;
	}
}

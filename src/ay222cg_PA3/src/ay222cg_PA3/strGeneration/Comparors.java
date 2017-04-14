package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public enum Comparors implements IInstructionBox
{
	Less,
	Equal;

	@Override
	public List<Instruction> createInstructions() 
	{
		ICodes icode = null;
		if (this.equals(Comparors.Less))
			icode = ICodes.ILt;
		else if (this.equals(Comparors.Equal))
			icode = ICodes.IEq;
		
		List<Instruction> instructions = new ArrayList<>();
		if (icode != null)
			instructions.add(new Instruction(icode));
		
		return instructions;
	}
}

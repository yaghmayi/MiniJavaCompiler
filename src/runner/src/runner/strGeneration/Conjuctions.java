package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public enum Conjuctions implements IInstructionBox
{
	And,
	Or;

	@Override
	public List<Instruction> createInstructions() 
	{
		ICodes icode = null;
		if (this.equals(Conjuctions.And))
			icode = ICodes.IAnd;
		else if (this.equals(Conjuctions.Or))
			icode = ICodes.IOr;
		
		List<Instruction> instructions = new ArrayList<>();
		if (icode != null)
			instructions.add(new Instruction(icode));
		
		return instructions;
	}
}

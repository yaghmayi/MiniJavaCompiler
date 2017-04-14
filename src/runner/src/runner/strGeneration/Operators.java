package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public enum Operators implements IInstructionBox
{
	Add,
	Sub,
	Mul,
	Div;
	
	@Override
	public List<Instruction> createInstructions() 
	{
		ICodes icode = null;
		if (this.equals(Operators.Add))
			icode = ICodes.IAdd;
		else if (this.equals(Operators.Sub))
			icode = ICodes.ISub;
		else if (this.equals(Operators.Mul))
			icode = ICodes.IMul;
		else if (this.equals(Operators.Div))
			icode = ICodes.IDiv;
		
		List<Instruction> instructions = new ArrayList<>();
		if (icode != null)
			instructions.add(new Instruction(icode));
		
		return instructions;
	}
}

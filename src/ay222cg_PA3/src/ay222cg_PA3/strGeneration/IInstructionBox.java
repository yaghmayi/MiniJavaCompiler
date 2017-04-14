package ay222cg_PA3.strGeneration;

import java.util.List;

import ay222cg_PA3.codeGeneration.Instruction;

public interface IInstructionBox 
{
	public abstract List<Instruction> createInstructions();
}

package runner.strGeneration;

import ay222cg_PA3.codeGeneration.Instruction;

public abstract class SimpleElementStr 
{
	public abstract String getText();
	public abstract Instruction createLoadInstruction();
	
	@Override
	public String toString() 
	{
		return this.getText();
	}
}

package runner.strGeneration;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class NumberStr extends SimpleElementStr 
{
	private String number;
	
	public String getNumber() 
	{
		return number;
	}

	public NumberStr(String number) 
	{
		this.number = number;
	}

	@Override
	public String getText() 
	{
		return getNumber();
	}

	@Override
	public Instruction createLoadInstruction() 
	{
		return new Instruction(ICodes.IConst, getNumber());
	}
}

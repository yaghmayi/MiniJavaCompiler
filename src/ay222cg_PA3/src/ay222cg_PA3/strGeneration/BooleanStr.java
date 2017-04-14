package ay222cg_PA3.strGeneration;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class BooleanStr extends SimpleElementStr
{
	private String val;
	
	public String getValue() 
	{
		if (val.equals("true"))
			return "1";
		else
			return "0";
	}

	public BooleanStr(String val) 
	{
		this.val = val;
	}

	@Override
	public String getText() 
	{
		return getValue();
	}

	@Override
	public Instruction createLoadInstruction() 
	{
		return new Instruction(ICodes.IConst, getValue());
	}
}

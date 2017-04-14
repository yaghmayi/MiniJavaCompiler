package runner.strGeneration;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class IdentifierStr extends SimpleElementStr
{
	private String name;
	
	public IdentifierStr(String name) 
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public String getText() 
	{
		return getName();
	}

	@Override
	public Instruction createLoadInstruction() 
	{
		return new Instruction(ICodes.ILoad, getName());
	}
	
	public Instruction createStoreInstruction()
	{
		return new Instruction(ICodes.IStore, getName());
	}
}

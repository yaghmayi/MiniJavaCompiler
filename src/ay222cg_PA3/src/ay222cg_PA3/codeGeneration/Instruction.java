package ay222cg_PA3.codeGeneration;

public class Instruction 
{
	private ICodes code;
	private Object argument;
	
	public Instruction(ICodes code) 
	{
		this(code, null);
	}
	
	public Instruction(ICodes code, Object arg)
	{
		this.code = code;
		this.argument = arg;
	}
	
	public void setArgument(Object argument)
	{
		this.argument = argument;
	}
	
	public Object getArgument()
	{
		return this.argument;
	}
	
	public ICodes getCode()
	{
		return this.code;
	}
	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	@Override
	public String toString()
	{
		String str = this.code.toString().toLowerCase();

		if (this.argument != null)
			str += " " + this.argument;
		
		return str;
	}
}

package compiler.symbolTbl;

public class NameTypeRecord extends Record
{
	private String type;
	
	public NameTypeRecord(String name, String type)
	{
		super(name);
		
		this.type = type;
	}
	
	public String getType()
	{
		return type;
		
	}
}

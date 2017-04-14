package ay222cg_PA2.errors;

public class IndexTypeError extends VariableError
{
	private String arrayName;
	
	public String getArrayName()
	{
		return this.arrayName;
	}
	
	public String getIndexName()
	{
		return getVariableName();
	}
	
	public IndexTypeError(String className, String methodName, String arrayName, String indexName)
	{
		super(className, methodName, indexName);
		this.arrayName = arrayName;
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : %2s as index part of array %3s should be int.", 
							 super.toString(), getIndexName(), getArrayName()); 
	}

}

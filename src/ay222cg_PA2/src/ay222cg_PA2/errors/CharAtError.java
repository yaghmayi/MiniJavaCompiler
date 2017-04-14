package ay222cg_PA2.errors;

public class CharAtError extends VariableError
{
	public CharAtError(String className, String methodName, String variableName) 
	{
		super(className, methodName, variableName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : '%2s'.charAt is invalid; charAt method could be call only for String type.", 
							 super.toString(), getVariableName()); 
	}
}

package ay222cg_PA2.errors;

public class PrintParameterTypeError extends VariableError 
{
	public PrintParameterTypeError(String className, String methodName, String variableName)
	{
		super(className, methodName, variableName);
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : the type of '%2s' as a print parameter should be Integer or String.", 
				 super.toString(), getVariableName()); 
	}
}

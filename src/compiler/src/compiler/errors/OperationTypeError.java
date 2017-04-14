package compiler.errors;

public class OperationTypeError extends VariableError
{
	private String variableType;
	
	public String getVariableType()
	{
		return this.variableType;
	}
	
	public OperationTypeError(String className, String methodName, String variableName, String variableType)
	{
		super(className, methodName, variableName);
		this.variableType = variableType;
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : '%2s' as a %2s type is invalid in the operation.", 
							  super.toString(), getVariableName(), getVariableType()); 
	}
}

package compiler.errors;

public class MismatchAssignTypeError extends VariableError
{
	private String assignFrom;
	
	public String getAssignTo()
	{
		return getVariableName();
	}
	
	public String getAssignFrom()
	{
		return this.assignFrom;
	}
	
	public MismatchAssignTypeError(String className, String methodName, String assignTo, String assignFrom)
	{
		super(className, methodName, assignTo);
		this.assignFrom = assignFrom;
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : Mismatch type in assigning %2s to %3s.", 
				  			 super.toString(), getAssignFrom(), getAssignTo());
	}
}

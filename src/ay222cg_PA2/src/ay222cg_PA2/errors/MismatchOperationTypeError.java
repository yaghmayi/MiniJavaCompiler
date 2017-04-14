package ay222cg_PA2.errors;

public class MismatchOperationTypeError extends VariableError 
{
	String secondElement;
	
	public String getFisrtElement()
	{
		return getVariableName();
	}
	
	public String getSecondElement()
	{
		return this.secondElement;
	}
	
	public MismatchOperationTypeError(String className, String methodName, String firstElement, String secondElement)
	{
		super(className, methodName, firstElement);
		this.secondElement = secondElement;
	}
	
	@Override
	public String toString()
	{
		return String.format("%1s : Mismatch operation type for %2s, %3s.", 
						     super.toString(), getFisrtElement(), getSecondElement());
	}
}

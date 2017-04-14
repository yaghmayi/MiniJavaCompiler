package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.Instruction;

public class OperationStr implements IInstructionBox
{
	private OperationTypes operationType;
	private SimpleElementStr simpleElement;
	private ObjMethodCallStr objMethodCall;
	private OperationStr firstOperation = null;
	private Operators operator = null;
	private OperationStr secondOperation = null;
	
	public OperationStr() 
	{
	}

	public OperationStr(ObjMethodCallStr objMethodCall) 
	{
		this.objMethodCall = objMethodCall;
	}
	

	public void setSimpleElement(SimpleElementStr simpleElement) 
	{
		this.simpleElement = simpleElement;
	}

	public void setFirstOperation(OperationStr firstOperation) 
	{
		this.firstOperation = firstOperation;
	}

	public void setOperator(Operators operator) 
	{
		this.operator = operator;
	}

	public void setSecondOperation(OperationStr secondOperation) 
	{
		this.secondOperation = secondOperation;
	}

	public OperationTypes getOperationType() 
	{
		return operationType;
	}

	public void setOperationType(OperationTypes operationType) 
	{
		this.operationType = operationType;
	}

	public ObjMethodCallStr getObjMethodCall() 
	{
		return objMethodCall;
	}

	public void setObjMethodCall(ObjMethodCallStr objMethodCall) 
	{
		this.objMethodCall = objMethodCall;
	}

	public String toString() 
	{
		String str = null;
		
		if (this.operationType.equals(OperationTypes.Identifier) 
				|| this.operationType.equals(OperationTypes.Number)
				|| this.operationType.equals(OperationTypes.Boolean))
		{
			str = this.simpleElement.getText();
		}
		else if (this.operationType.equals(OperationTypes.ObjMethodCall))
			str = objMethodCall.toString();
		else if (this.operationType.equals(OperationTypes.MixedOperation))
			str = firstOperation.toString() + " " + operator.toString() + " " + secondOperation.toString();
		
		return str;
	}
	
	@Override
	public List<Instruction> createInstructions()
	{
		List<Instruction> instructions = new ArrayList<>();
		
		if (this.operationType.equals(OperationTypes.Identifier) 
				|| this.operationType.equals(OperationTypes.Number)
				|| this.operationType.equals(OperationTypes.Boolean))
		{
			instructions.add(this.simpleElement.createLoadInstruction());
		}
		else if (this.operationType.equals(OperationTypes.ObjMethodCall))
			instructions.addAll(this.objMethodCall.createInstructions());
		else if (this.operationType.equals(OperationTypes.MixedOperation))
		{
			instructions.addAll(this.firstOperation.createInstructions());
			instructions.addAll(this.secondOperation.createInstructions());
			instructions.addAll(this.operator.createInstructions());
		}
		
		return instructions;
	}
}

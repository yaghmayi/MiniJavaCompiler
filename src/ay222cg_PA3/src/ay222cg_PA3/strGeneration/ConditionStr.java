package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class ConditionStr implements IInstructionBox
{
	private boolean  notSign;
	private SimpleElementStr firstElement;
	private Comparors comparor;
	private SimpleElementStr secondElement;

	private ConditionStr firstCondition;
	private Conjuctions conjuction;
	private ConditionStr secondCondition;
	
	public void setFirstElement(SimpleElementStr firstElement) 
	{
		this.firstElement = firstElement;
	}

	public void setComparor(Comparors comparor) 
	{
		this.comparor = comparor;
	}

	public void setSecondElement(SimpleElementStr secondElement) 
	{
		this.secondElement = secondElement;
	}

	public void setNotSign(boolean negetiveSign) 
	{
		this.notSign = negetiveSign;
	}
	
	public void setFisrtCondition(ConditionStr fisrtCondition) 
	{
		this.firstCondition = fisrtCondition;
	}
	
	public void setConjuction(Conjuctions conjuction)
	{
		this.conjuction = conjuction;
	}
	
	public void setSecondCondition(ConditionStr secondCondition) 
	{
		this.secondCondition = secondCondition;
	}

	@Override
	public String toString() 
	{
		String str = null;
		if (firstCondition == null)
		{
			str = firstElement.getText();
			if (secondElement != null)
				str+= " " + comparor + " " + secondElement.getText();
		}
		else
			str = firstCondition.toString() + " " +  conjuction.toString() + " " + secondCondition.toString();
		
		if (notSign)
			str = "!(" + str + ")";
		
		return str;
	}

	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		if (this.firstCondition == null)
		{
			instructions.add(this.firstElement.createLoadInstruction());
			if (secondElement != null)
			{
				instructions.add(this.secondElement.createLoadInstruction());
				instructions.addAll(this.comparor.createInstructions());
			}
		}
		else
		{
			instructions.addAll(this.firstCondition.createInstructions());
			instructions.addAll(this.secondCondition.createInstructions());
			instructions.addAll(this.conjuction.createInstructions());
		}
		
		if (this.notSign)
			instructions.add(new Instruction(ICodes.INot));
		
		return instructions;
	}
}
	
	
	

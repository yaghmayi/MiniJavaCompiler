package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class IfStr extends BlockStatementStr
{
	private ConditionStr condition;
	private ElseStr elseStr;
	
	public ConditionStr getCondition() 
	{
		return condition;
	}

	public ElseStr getElseStr() 
	{
		return elseStr;
	}

	public void setCondition(ConditionStr condition) 
	{
		this.condition = condition;
	}

	public void setElseStr(ElseStr elseStr) 
	{
		this.elseStr = elseStr;
	}

	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		instructions.addAll(this.condition.createInstructions());
		int ifFlaseIndex = instructions.size();
		Instruction ifFalseInstruction = new Instruction(ICodes.If_false);
		instructions.add(ifFalseInstruction);
		
		for (StatementStr statement : this.getStatements())
			instructions.addAll(statement.createInstructions());
		
		int ifFalseArg = instructions.size() - ifFlaseIndex;
		ifFalseInstruction.setArgument(ifFalseArg);
		
		if (this.elseStr != null)
		{
			List<Instruction> elseInstructions = this.elseStr.createInstructions();

			Instruction lastIfBodyIns = instructions.get(instructions.size() -1);
			if (!lastIfBodyIns.getCode().equals(ICodes.IReturn))
			{
				ifFalseInstruction.setArgument(ifFalseArg + 1);
				Instruction gotoInstruction = new Instruction(ICodes.Goto);
				instructions.add(gotoInstruction);
				gotoInstruction.setArgument(elseInstructions.size() + 1);
			}
			
			instructions.addAll(elseInstructions);
		}
		
		return instructions;
	}
	
	@Override
	public String toString() 
	{
		String str = "If (" + condition.toString() + ")\n";
		
		for (StatementStr statement : this.getStatements())
			str += getTab() + statement.toString() + "\n";
		
		if (elseStr != null)
		{
			String space = "   ";
			str += space + space + "Else\n";
			for (StatementStr statement : this.elseStr.getStatements())
				str += getTab() + statement.toString() + "\n";
		}
		
		return str;
	}
	
	private String getTab()
	{
		String space = "   ";
		String tab = space + space + space;
		
		BlockStatementStr parent = this.getParentStatement();
		while (parent != null)
		{
			tab += space;
			parent = parent.getParentStatement();
		}
		
		return tab;
	}
}

package ay222cg_PA3.strGeneration;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA3.codeGeneration.ICodes;
import ay222cg_PA3.codeGeneration.Instruction;

public class WhileStr extends BlockStatementStr 
{
	private ConditionStr condition;

	public void setCondition(ConditionStr condition) 
	{
		this.condition = condition;
	}
	
	@Override
	public List<Instruction> createInstructions() 
	{
		List<Instruction> instructions = new ArrayList<>();
		instructions.addAll(this.condition.createInstructions());
		int ifFlaseIndex = instructions.size();
		Instruction ifFalseInsntruction = new Instruction(ICodes.If_false);
		instructions.add(ifFalseInsntruction);
		
		for (StatementStr statement : this.getStatements())
			instructions.addAll(statement.createInstructions());
		
		instructions.add(new Instruction(ICodes.Goto, "-" + instructions.size()));
		ifFalseInsntruction.setArgument(instructions.size() - ifFlaseIndex);
		
		return instructions;
	}

	@Override
	public String toString() 
	{
		String str = "While (" + condition.toString() + ")\n";
		
		for (StatementStr statement : this.getStatements())
			str += getTab() + statement.toString() + "\n";
		
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

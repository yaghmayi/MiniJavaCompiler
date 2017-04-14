package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

public abstract class BlockStatementStr extends StatementStr 
{
	private BlockStatementStr parentStatement;
	private List<StatementStr> statements = new ArrayList<>();
	
	public List<StatementStr> getStatements() 
	{
		return statements;
	}
	
	public BlockStatementStr getParentStatement() 
	{
		return this.parentStatement;
	}


	public void setParentStatement(BlockStatementStr parentStatement) 
	{
		this.parentStatement = parentStatement;
	}

	public void addStatement(StatementStr statement)
	{
		this.statements.add(statement);
	}
}

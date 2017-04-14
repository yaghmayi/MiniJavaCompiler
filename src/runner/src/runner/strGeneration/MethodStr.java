package runner.strGeneration;

import java.util.ArrayList;
import java.util.List;

public class MethodStr 
{
	private String name;
	private List<String> params = new ArrayList<>();
	private List<StatementStr> statements = new ArrayList<>();
	private List<String> variables = new ArrayList<>();
	
	public List<String> getVariables() 
	{
		return this.variables;
	}

	public List<String> getParams() 
	{
		return this.params;
	}

	public MethodStr(String name) 
	{
		this.name = name;
	}

	public List<StatementStr> getStatements() 
	{
		return statements;
	}

	public String getName() 
	{
		return name;
	}
	
	public void addParam(String paramName)
	{
		this.params.add(paramName);
	}
	
	public void addVariable(String variableName)
	{
		this.variables.add(variableName);
	}
	
	public void addStatement(StatementStr statement)
	{
		this.statements.add(statement);
	}
	
	@Override
	public String toString()
	{
		String space = "   ";
		String str = space + this.name + "(";
		String paramsStr = "";
		for (String param : params)
			paramsStr += param + ", ";
		if (paramsStr != "")
			paramsStr = paramsStr.substring(0,  paramsStr.length() - ", ".length());
		str += paramsStr + ")\n";
		
		
		for (StatementStr statement : this.statements)
			str += space + space + statement.toString() + "\n";
		
		return str;
	}
}

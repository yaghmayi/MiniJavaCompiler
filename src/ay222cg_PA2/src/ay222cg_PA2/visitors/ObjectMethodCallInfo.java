package ay222cg_PA2.visitors;

import java.util.ArrayList;
import java.util.List;

import ay222cg_PA2.symbolTbl.NameTypeRecord;
import ay222cg_PA2.symbolTbl.ParameterRecord;

public class ObjectMethodCallInfo 
{
	private String className;
	private String methodName;
	private String objectName;
	private String targetClassName;
	private String targetMethodName;
	private List<NameTypeRecord> callParameters = new ArrayList<>();
	private List<ParameterRecord> targetParameters = new ArrayList<>();
	
	public ObjectMethodCallInfo(String className, String methodName, String targetClassName, String targetMethodName, String objectName)
	{
		this.className = className;
		this.methodName = methodName;
		this.targetClassName = targetClassName;
		this.targetMethodName = targetMethodName;
		this.objectName = objectName;
	}
	
	public String getClassName()
	{
		return this.className;
	}
	
	public String getMethodName()
	{
		return this.methodName;
	}
	
	public String getTargetClassName()
	{
		return this.targetClassName;
	}
	
	public String getTargetMethodName()
	{
		return this.targetMethodName;
	}
	
	public String getObjectName()
	{
		return this.objectName;
	}
	
	public void AddCallParameter(String name, String type)
	{
		callParameters.add(new NameTypeRecord(name, type));
	}
	
	public void setCallParameters(List<NameTypeRecord> callParameters)
	{
		this.callParameters = callParameters;
	}
	
	public List<NameTypeRecord> getCallParameters()
	{
		return callParameters;
	}
	
	public void setTargetParameters(List<ParameterRecord> targetParameters)
	{
		this.targetParameters = targetParameters;
	}
	
	public List<ParameterRecord> getTargetParameters()
	{
		return targetParameters;
	}
	
	@Override
	public String toString()
	{
		String str = String.format("className: %1s \nmethodName: %2s \ntargetclassName: %3s \ntargetMethodName: %4s \nobjectName: %5s", 
									this.className, this.methodName, this.targetClassName, this.targetMethodName, this.objectName);	
		
		return str;
	}
}

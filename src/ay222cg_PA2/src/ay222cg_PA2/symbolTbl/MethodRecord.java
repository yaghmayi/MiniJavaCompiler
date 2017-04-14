package ay222cg_PA2.symbolTbl;

import java.util.ArrayList;
import java.util.List;

public class MethodRecord extends NameTypeRecord
{
	private List<ParameterRecord> parameters = new ArrayList<ParameterRecord>();
	
	public MethodRecord(String name, String type)
	{
		super(name, type);
	}
	
	public void AddParameter(String name, String type)
	{
		ParameterRecord pr = new ParameterRecord(name, type);
		parameters.add(pr);
	}
	
	public List<ParameterRecord> getParameters()
	{
		return parameters;
	}
}

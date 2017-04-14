package ay222cg_PA3.codeGeneration;

public enum ICodes 
{
	IAdd,
	ISub,
	IMul,
	IDiv,
	ILoad,
	IConst,
	If_false,
	ILt,
	IEq,
	INot,
	IAnd,
	IOr,
	InvokeVirtual,
	Goto,
	Print,
	IStore,
	IReturn,
	Stop;
	
	
	public static boolean  isIcode(String icodeString)
	{
		for (ICodes icode : values())
		{
			if (icode.name().toLowerCase().equals(icodeString.toLowerCase()))
				return true;
		}
		
		return false;
	}
	
	public static ICodes  getIcode(String icodeString)
	{
		for (ICodes icode : values())
		{
			if (icode.name().toLowerCase().equals(icodeString.toLowerCase()))
				return icode;
		}
		
		return null;
	}
}

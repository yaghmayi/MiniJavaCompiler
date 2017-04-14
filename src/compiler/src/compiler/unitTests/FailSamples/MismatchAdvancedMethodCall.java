class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MismatchAdvancedMethodCall
{
	int i;
	String str;
	
    boolean Test()
    {
       int j;
       
       Helper helper = new Helper();
       char c = helper.getChar(this.foo(helper.self(str), i), str); //Error-0, 1, 2
       c = helper.getChar(this.foo(helper.self(i, j), str, i), j, str); //Error-3,4,5
       
       return false;
    		   
    }
    
    String foo(int x, String s)
    {
    	if (x > 1)
    		x = x + 1;
    	
    	return s;
    }
}

class Helper
{
	char getChar(String s1, int index)
	{
		char c = s1.charAt(index);
		return c;
	}
	
	int self(int j)
	{
		return j;
	}
}
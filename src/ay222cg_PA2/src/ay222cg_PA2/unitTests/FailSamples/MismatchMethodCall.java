class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MismatchMethodCall
{
    char Test()
    {
       int i = 0;
       String s = "hello"; 
       String str = this.foo(i); //Error-0
       str = this.foo(i, i); //Error-1
       
       Helper hp = new Helper();
       boolean flag = hp.help(i); //Error-2
       i = hp.self(); //Error-3
       i = hp.self(str); //Error-4
    }
    
    String foo(int x, String s)
    {
    	if (x < 1)
    		x = x + 1;
    		
    	return s;
    }
}

class Helper
{
	boolean help()
	{
		return true;
	}
	
	int self(int j)
	{
		return j;
	}
}
class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class DefinedMetod
{
    char Test()
    {
       int i;
       i = this.foo();
       
       Helper hp = new Helper();
       boolean flag = hp.help();
    }
    
    int foo()
    {
    	return 10;
    }
}

class Helper
{
	boolean help()
	{
		return true;
	}
}
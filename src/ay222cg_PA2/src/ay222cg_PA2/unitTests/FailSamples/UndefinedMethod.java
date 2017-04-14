class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class UndefinedMethod
{
    char Test()
    {
       int i;
       i = this.foo();
       
       Helper hp = new Helper();
       boolean flag = hp.help();
    }
}

class Helper
{
	boolean save()
	{
		return true;
	}
}
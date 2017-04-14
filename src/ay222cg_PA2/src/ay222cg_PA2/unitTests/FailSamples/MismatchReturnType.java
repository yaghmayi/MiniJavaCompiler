class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class MismatchReturnType
{
    String Test()
    {
    	int i = 1;
    	return i;
    }
}
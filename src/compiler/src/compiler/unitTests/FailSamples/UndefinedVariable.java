class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}

class UndefinedVariable
{
    int Test()
    {
       int i;
       i = j1; //Error-0
       j2 = j3 * i + j4; //Error-1,2,3
       
       while (flag1) //Error-4
       {
    	   System.out.println("wiat ...");
       }
       
       if (flag2) //Error-5
    	   return r1; //Error-6
       else
    	   return r2; //Error-7
    }
}
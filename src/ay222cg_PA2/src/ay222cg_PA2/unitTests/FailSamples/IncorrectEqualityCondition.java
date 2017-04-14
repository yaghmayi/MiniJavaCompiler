class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}


class IncorrectEqualityCondition
{
    int Test(int index)
    {
       int i = 0;
       char c1 = ' ';
       boolean flag;
       String s;
       
       while (i == flag || s == c1) //Error-0,1
       {
    	   System.out.println("wait ...");
       }
       
       if (flag == 2) //Error-2
    	   return 0;
       else
    	   return 1;
       
       return index;
    }
}


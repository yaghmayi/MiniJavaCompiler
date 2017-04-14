class Main_Dummy
{
    public static void main(String[] a)
    {
        System.out.println("Test");
    }
}


class CorrectIfWhile
{
    int Test(int index)
    {
       boolean flag = false;
       
       while (flag)
       {
    	   System.out.println("wait ...");
       }
       
       if (flag)
    	   return 0;
       else
    	   return 1;
       
       return index;
    }
}


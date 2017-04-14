class FacFib 
{
  public static void main(String[] a)
  {
	 System.out.println(new FacFibImpl().compute(5,10));
  }
}

class Foo 
{
  int compute(int first, int second) 
  {
    if (!(first < 1)  && second < 1) 
    	return 20;
    else
    	return 30;
  }
  
  int advancedCompute(int x, int y)
  {
	  if (!(!(1 < y)  && !(x < 1))) 
	     return x;
	  else
	     return y;
  }
}

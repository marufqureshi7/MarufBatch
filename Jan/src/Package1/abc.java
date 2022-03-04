package Package1;

public class abc 
{
      public int sum(int a,int b)
      {
    	  int c;
    	  c=a+b;
    	  return c;
      }
      
      public int sub(int d,int e)
      {
    	  int f;
    	  f=d-e;
    	  return f;
      }
      
      public int mul(int g,int h)
      {
    	  int i;
    	  i=g*h;
    	  return i;
      }

      public void div(int j,int k)
      {
    	  int l=j/k;
    	  System.out.println("final result"+l);
      }
      
      public static void main(String[] args) 
      {
    	  System.out.println("Hello");
		abc ob=new abc();
		int sumr1=ob.sum(10, 2);
		int sumr2=ob.sum(sumr1, 2);
		int subr1=ob.sub(sumr2, 2);
		int mulr1=ob.mul(subr1, 2);
		ob.div(mulr1, 2);
	  }
}

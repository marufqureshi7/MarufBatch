package Package1;

public class assi2 
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
		assi2 ob=new assi2();
		int mulr1=ob.mul(10, 2);
		int subr1=ob.sub(mulr1, 2);
		int mulr2=ob.mul(subr1, 2);
		int sumr2=ob.sum(mulr2, 2);
		ob.div(sumr2, 2);
	  }
}

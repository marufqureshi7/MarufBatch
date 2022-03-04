package Package1;

import java.util.Scanner;

public class scan 
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

    public int div(int j,int k)
    {
  	  int l=j/k;
  	  System.out.println("final result"+l);
  	  return l;
    }
    
	public static void main(String[] args) 
	{
		scan obj=new scan();
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter value of x1");
		int x1=s.nextInt();
		System.out.println("Please enter value of x1");
		int x2=s.nextInt();
		int sumresult=obj.sum(x1, x2);
		System.out.println("sum of x1 and x2:"+sumresult);
		System.out.println("please enter value of x3");
		int x3=s.nextInt();
		int subresult=obj.sub(sumresult, x3);
		System.out.println("sub of sum result and x3:"+subresult);
		System.out.println("Please enter value of x4");
		int x4=s.nextInt();
		int mulresult=obj.mul(subresult, x4);
		System.out.println("multiply of subresult and x4 is:"+mulresult);
		System.out.println("Please enter value of x5");
		int x5=s.nextInt();
		int divresult=obj.div(mulresult, x5);
		System.out.println("division of mulresult and x5:"+divresult);
	} 
}

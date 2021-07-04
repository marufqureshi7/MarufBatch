package Day2_Assign2;

public class Assign2 
{
	public int div(int a, int b)
	{
		int c=a/b;
		System.out.println("Result of Division is " +c);
		return c;
	}
	
	public int sub(int d, int e)
	{
		int f=d-e;
		System.out.println("result of Subtract is " +f);
		return f;
	}
	
	public int add(int g, int h)
	{
		int i=g+h;
		System.out.println("Result of Addition is " +i);
		return i;
	}
	public void mul(int x, int y)
	{
		int z=x*y;
		System.out.println("Result of Multiplication " +z);
	}
	
	public static void main(String[] args) 
	{
		Assign2 ob=new Assign2();
		int resultdiv=ob.div(10, 2);
		int resultdiv1=ob.sub(resultdiv, 2);
		int resultsub=ob.sub(resultdiv1, 2);
		int resultadd=ob.add(resultsub, 2);
		ob.mul(resultadd, 2);
				
	}
}

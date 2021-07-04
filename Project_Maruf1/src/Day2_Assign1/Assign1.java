package Day2_Assign1;

public class Assign1 
{
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println("Result of Addition " +c);
		return c;
	}
	
	public int minus(int d, int e)
	{
		int f=d-e;
		System.out.println("Result of Minus " +f);
		return f;
	}
	
	public int multi(int g, int h)
	{
		int i=g-h;
		System.out.println("Result of Multi " +i);
		return i;
	}
	
	public void div(int x, int y)
	{
		int z=x/y;
		System.out.println("Result of Division " +z);
	}
	
	public static void main(String[] args) 
	{
		Assign1 ob=new Assign1();
		int resultsum1=ob.add(10, 2);
		int resultsum2=ob.add(resultsum1, 2);
		int resultminus=ob.minus(resultsum2, 2);
		int resultmulti=ob.multi(resultminus, 2);
		ob.div(resultmulti, 2);
	}
	
}

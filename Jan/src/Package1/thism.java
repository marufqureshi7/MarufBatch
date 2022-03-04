package Package1;

public class thism 
{

	public void m1()
	{
		this.m4(1, 3, 4);
		System.out.println("defaul Method");
	}
	
	public void m2(int a)
	{
		this.m1();
		System.out.println("one parameterized");
	}
	
	public void m3(int a,int b)
	{
		this.m2(1);
		System.out.println("two parameterized");
	}
	
	public void m4(int a,int b,int c)
	{
		
		System.out.println("three parameterized");
	}
	
	public void m5(int a,int b,int c,int d)
	{
		this.m3(1, 2);
		System.out.println("four parameterized");
	}
	
	public void m6(int a,int b,int c,int d,int e)
	{
		this.m5(1, 5, 6, 5);
		System.out.println("five parameterized");
	}
	
	public static void main(String[] args) 
	{
		thism ob=new thism();
		ob.m6(1, 2, 3, 5, 4);
	}
}

package Day3_Assign2;

public class thismeth 
{
	public void m()
	{
		System.out.println("Default Method");
		this.m4(2, 2, 2, 2);
	}
	public void m1(int a)
	{
		System.out.println("one parameterized method");
		this.m3(1,2,3);
	}
	
	public void m2(int a, int b)
	{
		System.out.println("Two Parameterized Method");
	}
	
	public void m3(int a, int b, int c)
	{
		System.out.println("Three Parameterized Method");
		this.m2(1, 2);
		
	}
	
	public void m4(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Method");
		this.m1(2);
	}
	
	public static void main(String[] args) 
	{
		thismeth ob=new thismeth();
		ob.m();
	}
}

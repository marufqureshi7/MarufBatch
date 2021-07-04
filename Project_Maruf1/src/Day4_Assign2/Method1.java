package Day4_Assign2;

public class Method1 
{
	public void m()
	{
		System.out.println("Parent Default Method");
	}
	
	public void m1(int a)
	{
		this.m();
		System.out.println("Parent One Parameterized Method");
	}
	
	public void m2(int a, int b)
	{
		this.m3(1, 2, 3);
		System.out.println("Parent Two Parameterized Method");
	}
	
	public void m3(int a, int b, int c)
	{
		this.m1(1);
		System.out.println("Parent Three Parameterized Method");
	}
	
	public void m4(int a, int b, int c, int d)
	{
		this.m2(1, 2);
		System.out.println("Parent Four Parameterized Method");
	}
}

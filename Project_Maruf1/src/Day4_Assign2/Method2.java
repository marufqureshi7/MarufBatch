package Day4_Assign2;

public class Method2 extends Method1
{
	public void c()
	{
		super.m4(1, 2, 3, 4);
		this.c3(1, 2, 3);
		System.out.println("Child Default Method");
	}
	
	public void c1(int a)
	{
		this.c2(1,2);
		System.out.println("Child One Parameterized Method");
	}
	
	public void c2(int a, int b)
	{
		this.c();
		System.out.println("Child Two Parameterized Method");
	}
	
	public void c3(int a, int b,int c)
	{
		System.out.println("Child Three Parameterized Method");
	}
	
	public void c4(int a, int b, int c, int d)
	{
		this.c1(1);
		System.out.println("Child Four Parameterized Method");
	}
	
	public static void main(String[] args) 
	{
		Method2 oc=new Method2();
		oc.c4(1,2,3,4);
	}
}

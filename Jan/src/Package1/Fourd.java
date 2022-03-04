package Package1;

public class Fourd extends Fourc
{
	public void n1()
	{
		super.m4(1, 2, 3);
		super.m1();
		super.m3(1, 2);
		super.m2(1);
		System.out.println("Child Default Method");
	}
	
	public void n2(int a)
	{
		this.n4(1, 2, 3);
		System.out.println("Child 1 Parameterized Method");
	}
	
	public void n3(int a,int b)
	{
		this.n2(1);
		System.out.println("Child 2 Parameterized Method");
	}
	
	public void n4(int a,int b,int c)
	{
		this.n1();
		System.out.println("Child 3 Parameterized Method");
	}
	
	public static void main(String[] args) 
	{
		Fourd ab=new Fourd();
		ab.n3(1, 2);
	}
}

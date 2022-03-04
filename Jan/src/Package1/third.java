package Package1;

public class third 
{
	public third() 
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	
	public third(int a) 
	{
		this(23,25,26,30);
		System.out.println("One Parameterized Constructor");
	}
	
	public third(int a, int b) 
	{
		this ();
		System.out.println("Two Parameterized Constructor");
	}
	
	public third(int a, int b, int c) 
	{
		
		System.out.println("Three Parameterized Constructor");
	}
	
	public third(int a, int b, int c, int d) 
	{
		this(1,2);
		System.out.println("Four Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		third ob=new third(1);
	}
}

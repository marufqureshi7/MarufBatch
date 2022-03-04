package Package1;

public class Foura 
{
	public Foura() 
	{
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	
	public Foura(int a) 
	{
		this(1,2);
		System.out.println("Parent One Parameterized Constructor");
	}
	
	public Foura(int a,int b) 
	{
		this();
		System.out.println("Parent Two Parameterized Constructor");
	}
	
	public Foura(int a,int b,int c) 
	{
		System.out.println("Parent Three Parameterized Constructor");
	}
}

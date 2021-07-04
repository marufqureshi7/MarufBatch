package Day4_Assign1;

public class Class1 
{

	public Class1() 
	{
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	
	public Class1(int a) 
	{
		this();
		System.out.println("Parent One Parameterized Constructor");
	}
	
	public Class1(int a, int b) 
	{
		this(1,2,3,4);
		System.out.println("Parent Two Parameterized Constructor");
	}
	
	public Class1(int a, int b, int c) 
	{
		
		System.out.println("Parent Three Parameterized Constructor");
	}
	
	public Class1(int a, int b, int c, int d) 
	{
		this(1);
		System.out.println("Parent Four Parameterized Constructor");
	}
}

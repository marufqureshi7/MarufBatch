package Day3_Assign1;

public class thiscons 
{
	public thiscons()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	
	public thiscons(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	
	public thiscons(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("Two Parameterized Constructor");
	}
	
	public thiscons(int a, int b, int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public thiscons(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("Four Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		thiscons ob=new thiscons(1,2);
	}
}

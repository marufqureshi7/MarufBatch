package Day4_Assign1;

public class Class2 extends Class1
{
	public Class2() 
	{
		super(1,2);
		System.out.println("Child Default Constructor");
	}
	
	public Class2(int a) 
	{
		this(1,2,3);
		System.out.println("Child One Parameterized Constructor");
	}
	
	public Class2(int a, int b) 
	{
		this(1,2,3,4);
		System.out.println("Child Two Parameterized Constructor");
	}
	
	public Class2(int a, int b, int c) 
	{
		this();
		System.out.println("Child Three Parameterized Constructor");
	}
	
	public Class2(int a, int b, int c, int d) 
	{
		this(1);
		System.out.println("Child Four Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Class2 ob=new Class2(1,2);
		
	}
}

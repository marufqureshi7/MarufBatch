package pkg_maruf1;

public class MClass1 
{
	int a;
	
	public void maruf()
	{
		System.out.println("welcome here");
	}
	public static void main(String[] args) 
	{
		MClass1 ob=new MClass1();
		ob.maruf();
		System.out.println(ob.a);
		ob.a=1234;
		System.out.println(ob.a);
		ob.a=22;
		System.out.println(ob.a);
	}
}

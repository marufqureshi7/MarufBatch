package Day7_Assign;

public class swapping 
{
	int a=81,b=201;
	public void swap()
	{
		System.out.println("Swapping of Number without Using Third Variable \n\n");
		System.out.println("Before Swapping");
		System.out.println("Value of A = \t" +a);
		System.out.println("Value of B = \t" +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("Value of A = \t" +a);
		System.out.println("Value of B = \t" +b);
	}
	public static void main(String[] args) 
	{
		swapping s=new swapping();
		s.swap();
	}
}

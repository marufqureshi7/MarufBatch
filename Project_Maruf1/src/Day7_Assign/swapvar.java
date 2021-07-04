package Day7_Assign;

import java.util.Scanner;

public class swapvar 
{
	static int a,b,c;
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Swapping of Number Using Third Variable \n");
		System.out.print("Enter first number = ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number = ");  
		int b= sc.nextInt();
		System.out.println("\n");
		System.out.println("Before Swapping");
		System.out.println("Value of A " +a);
		System.out.println("value of b " +b);
		c = a;
		a = b;
		b = c;
		System.out.println("\n");
		System.out.println("After Swapping");
		System.out.println("Value of A " +a);
		System.out.println("value of b " +b);
		
	}
}

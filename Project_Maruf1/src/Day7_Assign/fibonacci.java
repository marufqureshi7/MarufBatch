package Day7_Assign;

import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number a");
		int a= s.nextInt();
		System.out.println("Enter Number b");
		int b= s.nextInt();
		int sum;
		for(int i=1;i<=10;i++)
		{
			sum = a + b;
			System.out.println("Fibonacci " +sum);
			a = b;
			b = sum;
			
		}
	}
}

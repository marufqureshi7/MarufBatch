package Day7_Assign;

import java.util.Scanner;

public class palindrome 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Number is Palindrome or Not \n");
		System.out.print("Enter Number = ");  
		int a= sc.nextInt();	
		int o=a;
		int r=0;
		while(a > 0)
		{
			int temp = a % 10;
			r = r * 10 + temp;
			a= a/10;
		}
		if (o == r)
		{
			System.out.println("Number is Palindrome \n");
		}
		else
		{
			System.out.println("Number is not Palidrome");
		}
	}
}

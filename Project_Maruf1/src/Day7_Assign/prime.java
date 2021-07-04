package Day7_Assign;

import java.util.Scanner;

public class prime 
{
	int a;
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Number is Prime or Not \n");
		System.out.print("Enter Number = ");  
		int a= sc.nextInt();
		int p=0;
		for (int i=2;i<a/2;i++)
		{
			if (a % i==0)
			{
				p = 1;
			}
		}
		if (p == 1)
		{
			System.out.print("Number is Not Prime \n");
		}
		else
		{
			System.out.print("Number is Prime \n");
		}
	}
}

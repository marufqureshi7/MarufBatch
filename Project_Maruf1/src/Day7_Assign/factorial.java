package Day7_Assign;

import java.util.Scanner;

public class factorial 
{
	public void fact(int n) 
	{
	int a=1;
	for (int i=n; i>0; i--)
	{
		a = a * i;
	}
		System.out.println("Factorial of Number is \n"+a);
	}
	public static void main(String[] args) 
	{
		factorial ob=new factorial();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Factorial Number \n");
		int n=s.nextInt();
		ob.fact(n);
		
		
	}
	
}

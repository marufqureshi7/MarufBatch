package Day7_Assign;

import java.util.Scanner;

public class table 
{
	public void tabb(int n) 
	{
	for (int i=1; i<=10; i++)
	{
		int t = n * i;
		System.out.println(+t);
	}
	}
	public static void main(String[] args) 
	{
		table tb=new table();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number \n");
		int n=s.nextInt();
		System.out.println("Print Table \n");
		tb.tabb(n);
		
		
	}
}

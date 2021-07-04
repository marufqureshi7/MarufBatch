package Day7_Assign;

import java.util.Scanner;

public class armstrong 
{
		static int a, r, sum=0, temp;
		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Number is armstrong or Not \n");
			System.out.print("Enter Number = ");  
			int a= sc.nextInt();
			temp = a;
			while(a > 0)
			{
				r = a % 10;
				sum = sum + (r*r*r);
				a= a/10;
			}
			if (temp == sum)
			{
				System.out.println("Number is Armstrong \n");
			}
			else
			{
				System.out.println("Number is not Armstrong");
			}
		}
}

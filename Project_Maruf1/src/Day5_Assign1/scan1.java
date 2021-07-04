package Day5_Assign1;

import java.util.Scanner;

public class scan1 extends Scan2
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("value of x1 ");
		int x1 = s.nextInt();
		System.out.println("value of x2 ");

		int x2 = s.nextInt();
		System.out.println("value of x3 ");

		int x3 = s.nextInt();
		System.out.println("value of x4 ");

		int x4 = s.nextInt();
		System.out.println("value of x5 ");

		int x5 = s.nextInt();
		System.out.println("value of x6 ");

		int x6 = s.nextInt();
		scan1 ar = new scan1();
		
		int a = ar.multi(x1, x2);
		int z = ar.sum(a,x3);
		int y = ar.sum(z, x4);
		int x = ar.sub(y,x5);
		int k = ar.div(x, x6);
		
		System.out.println("Result is " +k);
	}
}

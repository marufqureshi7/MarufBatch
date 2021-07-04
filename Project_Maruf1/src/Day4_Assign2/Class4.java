package Day4_Assign2;

import Day4_Assign1.Class3;

public class Class4 extends Class3
{
	public void method2()
	{
		System.out.println("This is Method2");
	}
	
	
	public static void main(String[] args) 
	{
		Class3 ref = new Class3();
		ref.m1();
		System.out.println(ref.a);
		
	}
}

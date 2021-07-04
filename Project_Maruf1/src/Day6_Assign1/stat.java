package Day6_Assign1;

public class stat 
{
		static int a;
		static int b;
		
		public static void abc()
		{
			a = a+1;
		}
		
		public static void xyz()
		{
			b = b-1;
		}
		
		public static void main(String[] args) 
		{
			stat s = new stat();
			System.out.println("addition");
			s.abc();
			System.out.println(s.a);
			System.out.println("subtraction");
			s.xyz();
			System.out.println(s.b);
			
		}
}

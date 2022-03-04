package Package1;

public class Fourb extends Foura
{
		public Fourb() 
		{
			super(1);
			System.out.println("Child Default Constructor");
		}
		
		public Fourb(int a) 
		{
			this(1,2,3);
			System.out.println("Child One Parameterized Constructor");
		}
		
		public Fourb(int a,int b) 
		{
			this(2);
			System.out.println("Child Two Parameterized Constructor");
		}
		
		public Fourb(int a,int b,int c) 
		{
			this();
			System.out.println("Child Three Parameterized Constructor");
		}
		
		public static void main(String[] args) 
		{
			Fourb ob=new Fourb(22,26);
		}
}

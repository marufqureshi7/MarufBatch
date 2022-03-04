package Package1;

public class Student 
{
	int age,roll_no;
	
	
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
		public static void main(String[] args) 
		{
			Student s=new Student();
			s.age=25;
			s.roll_no=12;
			s.display1();
			s.display2();
			System.out.println(s.age);
			System.out.println(s.roll_no);
				
		}
}

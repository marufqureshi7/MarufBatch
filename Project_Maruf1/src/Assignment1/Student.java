package Assignment1;

public class Student 
{
	int age;
	int rollno;
	
	public void method1()
	{
		System.out.println("Welcome all");
	}

	public void method2()
	{
		System.out.println("Automation is Very Easy");
	}
	
	public static void main(String[] args) 
	{
		Student maruf= new Student();
		maruf.method1();
		maruf.method2();
		maruf.age=26;
		maruf.rollno=29;
		System.out.println("maruf age is");
		System.out.println(maruf.age);
		System.out.println("maruf rollno is");
		System.out.println(maruf.rollno);
		
	}
}

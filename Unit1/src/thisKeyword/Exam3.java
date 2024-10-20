package thisKeyword;

public class Exam3 
{
Exam3()
{
	this(34);
	System.out.println("Non-Parameterized Constructor");
}
Exam3(int a)
{
	System.out.println(a);
	System.out.println("Parameterized Constructor");
}
	public static void main(String[] args) 
	{
		new Exam3();
		

	}

}

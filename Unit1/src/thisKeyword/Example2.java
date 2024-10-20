package thisKeyword;

public class Example2 {
	
	public void method1()
	{
		System.out.println("Hello 1");
	}
	
	public void method2()
	{
		method1();  // or this.method1()
		System.out.println("Hello 2");
	}

	public static void main(String[] args) 
	{
		Example2 m = new Example2();
		m.method2();

	}

}

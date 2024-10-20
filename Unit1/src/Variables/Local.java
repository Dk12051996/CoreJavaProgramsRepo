package Variables;

public class Local {
	
	public static void method1()
	{
		int a = 10;
		int c = 20;
		System.out.println(a+c);
	}
	
	public void method2()
	{
		char b = 'A';
		char d='n';
		System.out.println(b);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local.method1();
		Local abc = new Local();
		abc.method2();

	}

}

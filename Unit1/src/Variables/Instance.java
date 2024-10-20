package Variables;

public class Instance {
	
	int a = 10;
	String b ="Dipesh";
	char c = 'D';
	
	public static void method11()
	{
		int d = 5;
		System.out.println(d);
	}
	public void method22()
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance.method11();
		Instance abc = new Instance();
		abc.method22();

	}

}

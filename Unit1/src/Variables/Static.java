package Variables;

public class Static {
	
	static int a = 2002;
	static short b = 3456;
	static float c = 2737.45f;
	static String d = "DK";
	
	public static void method111()
	{
		System.out.println(a+b);
	}
	public void method222()
	{
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static.method111();
		Static abc = new Static();
		abc.method222();

	}

}

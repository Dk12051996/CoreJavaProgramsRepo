package Constructor;

public class Sample {
	
	int a;
	int b;
	int c;
	int d;
	String g;
	Sample()
		{
			a=10;
			b=20;
			System.out.println(a+b);
		}
	{
		c=30;
		d=40;
		System.out.println(c+d);
	}
	{
		System.out.println(g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample();

	}

}

package Constructor;

public class Parameterized {

	int a;
	int b;
	Parameterized()
	{
		a=10;
		b=20;
		System.out.println(a+"<------------->"+b);
	}
	Parameterized(int a,int b)
	{
	a=10;
	b=20;
	{
       System.out.println(a+b);
	}
	}
	Parameterized(int a , int b , int c)
	{
		a=10;
		b=20;
		c=30;
		{
			System.out.println(a+b-c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Parameterized();
     new Parameterized(200,300);
     new Parameterized(1,2,3);
	}

}

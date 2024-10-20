package thisKeyword;

public class Example1 
{
	int a =40;
		public void exam1(int a)
		{
			
			System.out.println("Instance Variable =  " + a);
			this.a=a;
			System.out.println(a);
		}
		
		public void exam2()
		{
			System.out.println(a);
		}
			

	public static void main(String[] args)
	{
		Example1 m = new Example1();
		m.exam1(98);
		m.exam2();

	}

}

package ConditionalStatement;

public class Type1 {

	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;
		int c = 40;
		if(a>b)
		{
			System.out.println("False");
		}
        if(a+b>c)
        {
        	System.out.println("True");
        }
        if(a+20>=c)
        {
        	System.out.println("True");
        }
        if(a>b)
        {
        	System.out.println("False");
        }
        System.out.println("OK");
	}

}

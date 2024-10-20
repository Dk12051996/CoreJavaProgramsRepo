package ConversionAndCasting;

public class Son extends Father
{
	String Name = "Dipesh";
	int Age = 27;
	public void Paisa()
	{
		System.out.println("Jada Nahi Hai");
	}
	public void Money()
	{
		System.out.println("No Money");
	}

	public static void main(String[] args) {

Father a =  new Son();
a.Income();
a.Property();
System.out.println(a.Name);
System.out.println(a.Age);

	}

}

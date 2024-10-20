package Topic1;

public class NonStaticMethod {
	
	public void name()
	{
		System.out.println("Name = Dipesh Khotele");
	}
	public void address()
	{
		System.out.println("Address = Rajani Nagar khat Road, Bhandara");
	}
	public void state()
	{
		System.out.println("State = Maharashtra");
	}
	public void pincode()
	{
		System.out.println("Pincode = 441906");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod xyz = new NonStaticMethod();
		xyz.name();
		xyz.address();
		xyz.state();
		xyz.pincode();

	}

}

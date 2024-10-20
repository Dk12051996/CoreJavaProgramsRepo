package ConversionAndCasting;

public class Rabbit extends Animal 
{
	String name = "Herbivorous nature";	
	public void nature()
	{
		System.out.println("Herbivorous Nature");
	}
	public static void main(String[] args)
	{
	Animal a = new Rabbit();
	a.nature();
	System.out.println(a.name);
	
	Animal ab = new Shark();
	ab.nature();
	System.out.println(ab.name);
	
	
	

	}

}

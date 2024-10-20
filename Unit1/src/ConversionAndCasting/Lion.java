package ConversionAndCasting;

public class Lion extends Shark
{
String name = "CARNIVOROUS NATURE";
public void nature()
{
	System.out.println("CARNIVOROUS NATURE");
}
public static void main(String args[])
{
Animal a = new Shark();
a.nature();
System.out.println(a.name);

Shark ab = new Lion();
ab.nature();
System.out.println(ab.name);
}
}
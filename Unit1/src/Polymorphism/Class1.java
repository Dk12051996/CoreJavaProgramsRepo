package Polymorphism;

public class Class1 
{
public void method1(int a)
{
	System.out.println("This is METHOD 1");
}
public void method1(int a, int b)
{
	System.out.println("This is METHOD 2");
}
public static void main(String args [])
{
	Class1 a = new Class1();
	a.method1(56);
	a.method1(23,23);
}
}

package Inheritance;

public class son extends Father
{
public void salary()
{
	System.out.println("SALARY");
}
public void mutualFund()
{
	System.out.println("SIP");
}
	public static void main(String[] args) 
	{
		son a = new son();
		a.retiredMoney();
		a.policyMoney();
		a.salary();
		a.mutualFund();
	}

}

package SwitchStatment;

public class Type5 {

	public static void main(String[] args) 
	{
		String Day = "Sunday";
		int S = 0;
		switch(Day)
		{	
		case "Monday": S=1;
		break;
		
		case "Tuesday": S=2;
		break;
		
		case "Wednesday": S=3;
		break;
		
		case "Thursday": S=4;
		break;
		
		case "Friday": S=5;
		break;
		
		case "Saturday": S=6;
		break;
		
		case "Sunday": S=3;
		break;
		
		default: S=7;
		
		System.out.println("The Favourite day is "+ S);
		
	}
	}
}
		
		

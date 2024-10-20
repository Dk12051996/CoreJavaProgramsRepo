package SwitchStatment;

public class Type3String 
{
public static void main(String[] args) 
{
String LevelString = "Expert";
int b = 0;
switch(LevelString)
{
case "Beginner": b=1;
break;

case "Intermeditae": b=2;
break;

case "Expert" : b = 3;
break;

default: b=4;
break;
}
System.out.println("You Level is "+ b);
	
}
}


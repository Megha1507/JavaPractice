package javaPracticeExample;

public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		
	// switch with break statement execute only single statement and exit the switch-case loop.
		
		int number = 10 ;
		
		switch(number)
		{
		case 10 : System.out.println(10);break;
		case 20 : System.out.println(20);break;
		case 30 : System.out.println(30);break;
		}
		
		
	// switch without Break Statement , execute all the statement.
		
		int n = 20;
				switch(n)
				{
				case 20 : System.out.println(20);
				case 30 : System.out.println(30);
				case 40 : System.out.println(40);
				}	
	}

}

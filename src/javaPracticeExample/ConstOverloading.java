package javaPracticeExample;

public class ConstOverloading 
{
	int id ;
	String name ;
	int Age;
	ConstOverloading(int i , String n)
	{
		id = i;
		name = n;
				
	}
	
	ConstOverloading(int i , String n , int j)
	{
		id = i ;
		name = n;
		Age = j;
	}
	
	void display()
	{
		
		System.out.println(id + "  " + name + "  " + Age);
	}
	
	public static void main(String[] args) 
	{
		ConstOverloading c = new ConstOverloading(22 , "Megha" );
		ConstOverloading c1 = new ConstOverloading(22 , "Megha" , 27);
		c.display();
		c1.display();
		
	}

}

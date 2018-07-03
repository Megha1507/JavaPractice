package javaPracticeExample;

public class ParametrizedConstructer 
{	
	int id ;
	String name;
	
	ParametrizedConstructer(int x , String y)
	{
		id= x ;
		name = y;
	}
	
	void display()
	{
		System.out.println(id+"  "+ name);
	}
	public static void main (String[] args)
	
	{
		
		ParametrizedConstructer p = new ParametrizedConstructer(2 , "Megha");
		p.display();
	}
	
}

package javaPracticeExample;

public class ConstCopy 
{
	int id ;
	String name;
	
	ConstCopy(int i , String n)
	{
		id = i;
		name = n;
	}
	
	ConstCopy(ConstCopy C)
	{
		id = C.id;
		name = C.name;
	}
	void display()
	{
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) 
	{
		ConstCopy C = new ConstCopy(11, "Megha");
		ConstCopy C1 =  new ConstCopy(C);
		
		C.display();
		C1.display();
	}

}

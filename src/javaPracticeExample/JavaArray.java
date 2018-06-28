package javaPracticeExample;

public class JavaArray {

	public static void main(String[] args) 
	{
		
		
	// Creating and initializing an Array
		int array[] = new int[10];
		
		for (int count = 0 ; count <10 ; count ++ )
		{
			array[count] = count+1;
		}
		
		for (int count= 0; count <10 ; count ++)
		{
			System.out.println("array["+ count +"] = " + array[count]);
		}
		
		System.out.println("Length of an Array is :- "+ array.length);
		
	// Reinitializing an array
		array[9] =12;
		System.out.println(array[9]);
		
	
	}

}

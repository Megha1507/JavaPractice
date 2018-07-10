package javaPracticeExample;

public class PrintOddEvenInArray 
{
	public static void main(String[] args) 
	{
		int[] ar = {1,2,5,6,3,2};
		
		int[] odd = new int[5];
		int[] even = new int[5];
		int i, k= 0 , m= 0;
		
		for(i = 0 ; i <= 5; i++)
		{
	
	// Save in Odd array if remainder of a number is 2	else in an Array even
			
			if( ar[i] % 2 != 0) 
			{
				
				odd[k] = ar[i];
				k++;
			}
			else
			{
				even[m] = ar[i];
				m++;
			}
		}
		System.out.println( "Odd number in the array are: " );
	
	// Printing the ODD numbers
	
		for(int j = 0 ; j < 3 ; j++) 
		{
			System.out.println( odd[j] );
			
		}
		
		System.out.println( "Even number in the array are: " );
	
	// Printing the Even numbers
		
		for(int s = 0 ; s < 3 ; s++) 
		{
			System.out.println(even[s]);
			
		}
	
	}

}

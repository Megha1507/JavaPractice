/* Write a program to print Prime numbers and check any number if if is a prime number*/

package javaPracticeExample;

public class PrimeNumberJava
{

	public static void main(String[] args) 
	{

// Print all the Prime numbers between 1 to 20
		
		for(int i = 1 ; i < 20 ; i++)
		{	
			if( (i % 2) > 0)
			{
				System.out.println(i+ " ");
			}
		}

// Check the number is Prime or not		
		
		int n = 78; // Number to be checked
		
		if( (n % 2) > 0)
		{
			System.out.println(n + " is a Prime number ");
		}
		else
		{
			System.out.println(n + " is not a Prime Number");
		}
	
	}

}

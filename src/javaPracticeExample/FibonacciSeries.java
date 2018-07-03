/**Write a java program to print fibonacci series without using recursion.

Input: 10

Output: 0 1 1 2 3 5 8 13 21 34*/

package javaPracticeExample;

public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.print( a + " " );
		
		for (int i = 0 ; i < 10; i++)
		{
			a = b ;
			b = c ;
			c = a + b;
			System.out.print( " "+ c + " " );
		}
		
	}

}

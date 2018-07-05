/*
Write a java program to sort an array elements using bubble sort algorithm.
18 9 33 4 84 32
4 9 18 32 33 84
*/

package javaPracticeExample;

public class BubbleSort
{

	public static void main(String[] args) 
	{
		int[] a = {18, 9, 33, 4, 84, 32};
		int c = 0 ;
		
		for(int i = 0 ; i< a.length ; i++)
		{
			for (int j = 1 ; j < a.length-1 ; j++)
				
			{
				if(a[j-1] > a[j]);
				{
					c = a[j-1];
					a[j-1] = a[j];
					a[j] = c;			
					
				}
				
			}System.out.println(a[i]);	
		}
	}

}

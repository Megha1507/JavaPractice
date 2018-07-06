/*
Write a java program to sort an array elements using bubble sort algorithm.
18 9 33 4 84 32
4 9 18 32 33 84
*/

package javaPracticeExample;

public class BubbleSort
{
	static int i;
	public static void main(String[] args) 
	{
		int[] a = {18, 9, 33, 4, 84, 32};
		int temp ;
		int n = a.length;
		
		for (int i = 0 ; i < n ; i ++)
		{
			for(int j = 1 ; j < n-i ; j ++ )
			{
				
				if(a[j-1] > a[j])
				{
					
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					
				}
				
			}
		}
		for(int i = 0 ; i < n ; i ++)
		{
			System.out.println(a[i]);
		}
	
	}
}

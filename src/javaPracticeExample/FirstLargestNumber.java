package javaPracticeExample;

import java.util.Arrays;

public class FirstLargestNumber 
{
	public static void main(String[] args) 
	{
		int a[] = {21,22,5,36,33,2};
		
		Arrays.sort(a);
	// To Print sorted array
		for(int i = 0 ; i < a.length ; i++)
		{
		System.out.println(a[i]);
		}
		
		System.out.println("largest nmber is: " + a[a.length-1]);
		
		
	}

}

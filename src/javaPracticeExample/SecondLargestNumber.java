package javaPracticeExample;

import java.util.Arrays;

public class SecondLargestNumber
{

	public static void main(String[] args) 
	{
		int a[] = {21,22,5,36,33,2};
		
		Arrays.sort(a);
		for(int i = 0 ; i < a.length ; i++)
		{
		System.out.println(a[i]);
		}
		
		System.out.println("largest nmber is: " + a[a.length-2]);
		

	}

}

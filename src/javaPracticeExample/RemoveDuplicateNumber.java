package javaPracticeExample;

//import java.util.Arrays;

public class RemoveDuplicateNumber {

	public static void main(String[] args)
	{
		int a[] = {10,20,20,30,30,40,50,50};
		
/* For Unsorted array
* 	int a[] = {10,70,30,90,20,20,30,40,70,50};
	Arrays.sort(a);
*/
		int[] b = new int[10];
		for(int i = 0 ; i< a.length-1 ; i++)
		{
			
			if(a[i] != a[i+1])
			{
				b[i] = a[i];
							
			}
			else
			{
				b[i+1] = a[i+1];
			}
		}
		for(int i = 0 ; i< a.length ; i++)
		{
			if(b[i] != 0)
			{
				System.out.println(b[i]);
			}
		}

	}

}

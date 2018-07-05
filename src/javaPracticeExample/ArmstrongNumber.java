/* Armstrong Number is a number which is equal to the sum of the cube of its own number.
 
 * Example : 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3  = 153 */

package javaPracticeExample;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int n = 155 ;
		int temp = n;
		int a = 0;
		int c = 0;
		
		while(n > 0)
		{
			a = n % 10;
			n = n/10;
			
			c = c + a*a*a;
		}
		if (c == temp)
		{
			System.out.println(temp + " is an Armstrong Number");
		}
		else
		{
			System.out.println(temp + " is not an Armstrong Number");
		}
	
	}

}

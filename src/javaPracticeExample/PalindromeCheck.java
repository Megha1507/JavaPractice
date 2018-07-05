/*Write a java program to check Palindrome number.*/

package javaPracticeExample;

public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
		String n = "12320";
		String r= "";
		
		int length = n.length();   
	      
		for ( int i = length - 1; i >= 0; i-- ) 
		{
	         r = r + n.charAt(i);  
	      
	         if (n.equals(r))   	 
	         {   
	        	 System.out.println("Entered string/number is a palindrome.");  
	         }
	         else  
	         System.out.println("Entered string/number isn't a palindrome.");    
			
		}
	}		
}

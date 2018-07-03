/* Convert String to Character Array

Syntax :
	
	public char[] tocharArray()
*/

package javaPracticeExample;

public class String_toCharArray {

	public static void main(String[] args) 
	{
		
		String s= "hello";
		
		char[] c= s.toCharArray();
		
		for (char h : c)
		{
			
			System.out.print(h);
			
		}
	}

}

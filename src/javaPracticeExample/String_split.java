/*

There are two signature for split() method in java string.

public String split(String regex)  
and,  
public String split(String regex, int limit)  

*/

package javaPracticeExample;

public class String_split {

	public static void main(String[] args) 
	{
		String s= "Learning Java from javaTpoint";
		
		String[] w = s.split("\\s");
		
		for (int i = 0 ; i< w.length ; i++)
		{
		System.out.println(w[i]);
		}
		
	}

}

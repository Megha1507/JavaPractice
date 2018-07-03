/*

There are two signature for split() method in java string.

public String split(String regex)  
and,  
public String split(String regex, int limit)  

	// limit : limit for the number of strings in array. If it is zero, it will returns all the strings matching regex.

*/

package javaPracticeExample;

public class String_split {

	public static void main(String[] args) 
	{
		String s= "Learning Java from javaTpoint";
		
		System.out.println("Befor using SPLIT String is  :" + s);
		
		String[] w = s.split("\\s");
		
		for (int i = 0 ; i< w.length ; i++)
		{
		System.out.println(w[i]);
		}
		System.out.println("\n");
		
	// How to use String split(String regex, int limit)

		String[] w1 = s.split("\\s", 2);
		
		for (int i = 0 ; i< w1.length ; i++)
		{
		System.out.println(w1[i]);
		}
		
		String[] w2 = s.split("\\s", 3);
		
		for (int i = 0 ; i< w2.length ; i++)
		{
		System.out.println(w2[i]);
		}
		
	}

}

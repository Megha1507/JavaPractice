/*
 
public static String join(CharSequence delimiter, CharSequence... elements)  
and  
public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)  

*/

package javaPracticeExample;

public class String_join {

	public static void main(String[] args) 
	{
		String s = "Hello";
		String s1 = "g";
		String s3= "s";
		
		System.out.println(String.join("-" , s , s1));
		
		String s2= String.join("-" , s , s1 , s3);
		System.out.println(s2);
	}

}

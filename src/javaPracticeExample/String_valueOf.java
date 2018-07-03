/*
 * ValueOf converts all different types of value int string.
 *  int to string,
 *  long to string, 
 *  boolean to string,
 *  character to string,
 *  float to string
 *  double to string
 *  object to string
 *  char array to string.
 * 
 */

package javaPracticeExample;

public class String_valueOf {

	public static void main(String[] args) 
	{
		int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10);
		
		String s =  "hello";
		String x = "hexyz";
		System.out.println("equals " + s.compareTo(x));
	
		String s2 = " Java T point";

		//SYntax is > String.join(char seq , element .....)

		String var = String.join("/", s , s2);
		
		System.out.println(var);
	}

}

/*
 * trim() method eleminated leading and trailing spaces. The unicode of space is '\U0020'. 
 * The trim() method in java will check for the spaces before and after the string and remove it if exists.
 **/
package javaPracticeExample;

public class String_trim {

	public static void main(String[] args) 
	{
		String s1="  hello string   ";  
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim()  

	}

}

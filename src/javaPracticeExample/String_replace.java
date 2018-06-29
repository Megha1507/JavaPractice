//Replace will replace the first occurence.. Replace All will replace all the occurences in the doc

package javaPracticeExample;

public class String_replace {

	public static void main(String[] args) 
	{
		String s = "Rockstar";

		// replace Method
		
				System.out.println("Replace a character = " + s.replace("r", "s"));
				
			// Method replace() and replaceAll character and replaceFirst()
				
				System.out.println("ReplaceAll character=" + s.replaceAll("s", "r") );
			
				System.out.println("1234567890abcdef".replace("12345", "ABCDE"));
				System.out.println("1234567890abcdef".replaceAll("12345", "ABCDE"));
				
				System.out.println("!@#$%^&*()-=Abcd".replace("#$%^&", "OK")); // replaced
				System.out.println("!@#$%^&*()-=Abcd".replaceAll("#$%^&", "OK")); // will not replace 
				
				System.out.println("!@#$%^&*()-=Abcd".replaceFirst("#$%^&", "Ok"));
				System.out.println("1234567890abcdef".replaceFirst("12345", "ABCDE"));
			
				
	}

}

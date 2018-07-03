package javaPracticeExample;

/*
 Length
 indexOf
 charAt
 CompareTo
 Contain
 endsWith
 replaceAll
 replaceFirst
 tolowercase
 touppercase 
 */
public class StringMethods 
{
	
	public static void main(String[] args)
	{
		String s = "Rockstar";
		
	// Print Length of a String.
		
		System.out.println(s.length());
		
	// print indexOf an element
		
		System.out.println("Letter at index = " + s.indexOf('S'));
		
	// charAt method 
		
		System.out.println("character at 0 is = " + s.charAt(0));
		
	// CompareTo method 
		
		System.out.println("compareTo = " + s.compareTo("rock")); 
	
	// compareToIgnoreCase() :- The result will have the value 0 if the argument string is equal to this string; 
		System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + s.compareToIgnoreCase("ROCKSTAR"));
		
	// If strings are not equal result will be less then 0 else if equals it will give 0
		
		System.out.println("compareTo = " + s.compareTo("rockstar"));
		// again -32 as this method is case senestive
		
		System.out.println("compareTo = " + s.compareTo("Rockstar"));
		
		System.out.println("contains method = " + s.contains("k"));
	
	// endsWith method
		System.out.println("endsWith method = " + s.endsWith("r"));
		
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
		
	// Convert a characters to Upper case and Lower Case characters
		System.out.println("AVBEJJE".toLowerCase());
		
		System.out.println("absnndjd".toUpperCase());
	
	// Printing a String with ""
		String S1 ="The number is: "+ "123"+"456";

		System.out.println(S1);
	
	// Printing a String without ""
		String S2 = "The number is: "+ (123 + 456);
		
		System.out.println(S2);
		
		
	// check the String Starts with a character
		 
		String s3="java string split method by javatpoint";  
		System.out.println(s3.startsWith("ja"));  // true if string is presents
		System.out.println(s3.startsWith("java string"));   
	}

}

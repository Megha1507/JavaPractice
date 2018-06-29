package javaPracticeExample;

public class String_compareTo
{
	public static void main(String[] args)
	{
				String s = "Rockstar";
				
		// compareToIgnoreCase() :- The result will have the value 0 if the argument string is equal to this string; 
				
				System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + s.compareToIgnoreCase("ROCKSTAR"));
				
		// If strings are not equal result will be less then 0 else if equals it will give 0
				
				System.out.println("compareTo = " + s.compareTo("rockstar"));
		
		// again -32 as this method is case senestive
				
				System.out.println("compareTo = " + s.compareTo("Rockstar"));
				String s1="hello";  
				String s2="hello";  
				String s3="meklo";  
				String s4="hemlo";  
				String s5="flag";  
				System.out.println(s1.compareTo(s2));//0 because both are equal  
				System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
				System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
				System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
				
				  
				String s6="";  
				String s7="me";  
				System.out.println(s1.compareTo(s6)); // returns length of the string s1
				
			// If second string is empty, result would be positive. If first string is empty, result would be negative.
				
				System.out.println(s6.compareTo(s7));
		
	}
}

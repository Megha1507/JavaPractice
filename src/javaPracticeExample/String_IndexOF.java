package javaPracticeExample;

/* if character is not available in the string, the returned index would be -1.*/
/*
1.  int indexOf(int ch)	returns index position for the given char value
2.	int indexOf(int ch, int fromIndex)	returns index position for the given char value and from index
3.	int indexOf(String substring)	returns index position for the given substring
4.	int indexOf(String substring, int fromIndex)	returns index position for the given substring and from index*/

public class String_IndexOF {

	public static void main(String[] args)
	{	
		String s = "This is a sample String";
		
	// IndexOf character is Printing
		System.out.println("Index of Character i is = "+ s.indexOf('i'));
		
	// Index of the whole string can be printed
		System.out.println("Index of String 'sample' is =" +s.indexOf("sample"));
	
	// Index of "is" at 3rd and 5th position
		System.out.println("print = "+ s.indexOf("is", 3)); // Position of String "is" in the above String s 
		
		char ch = s.charAt(2);
		System.out.println(s.indexOf(ch, 1));// Position of character "i" After 1st index 
		System.out.println(s.indexOf(ch, 3));// Position of character "i" After 3rd index 
		System.out.println(s.indexOf(ch, 6));// Position of character "i" After 6th index 
		
		
	// lastIndexof method Returns the last index of 's'
		
		System.out.println("lastIndexof ="+ s.lastIndexOf('s'));

		System.out.println("lastIndexof ="+ s.lastIndexOf("String"));
	}

}

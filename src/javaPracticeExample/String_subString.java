/* 
There are 2 types of SubString Methods:- 

public String substring(int startindex);

public String substring(int startindex , int endindex)

*/

package javaPracticeExample;

public class String_subString {

	public static void main(String[] args) 
	{
		String s = "javatpoint";
		
		System.out.println("print String of index 2 to 5 =" + s.substring(2, 5));// specified index from 2 to 5
		
		System.out.println("print String of index 2 to 5 =" + s.substring(3)); // starting index to end
		
	}

}

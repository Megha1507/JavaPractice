// HOW TO PRINT CHARACTER OF ODD INDEX

package javaPracticeExample;


public class String_charAt_OddIndex {

	public static void main(String[] args)
	{
		 String str = "Welcome to Javatpoint portal";
		 
		 for(int i =0; i<str.length(); i++)
		 {
			 if (i % 2 != 0 )
			 {
				 System.out.println("char at "+ i + " = "+ str.charAt(i) );
			 }
		 }

	}

}

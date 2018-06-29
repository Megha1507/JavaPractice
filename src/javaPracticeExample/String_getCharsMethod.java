package javaPracticeExample;

public class String_getCharsMethod {

	public static void main(String[] args) 
	{
		
		String s = "hello javatpoint how r u";
		
		char[] ch = new char[10];
		//s.getChars(srcBegin, srcEnd, dst, dstBegin);
		s.getChars(6, 16, ch, 0);
		System.out.println(ch);
		
		s.getChars(0 , 5, ch, 0);
		System.out.println(ch);
	}

}

package javaPracticeExample;

public class arrayCopyMethod {

	public static void main(String[] args)
	{
		char[] arr = {'M' ,'E', 'G', 'H', 'A'};
		char[] arrNew = new char[4];
		
	// Printing elements of an array within specific range
		System.arraycopy(arr, 1, arrNew, 0, 4);
		System.out.println(new String(arrNew));
	}

}

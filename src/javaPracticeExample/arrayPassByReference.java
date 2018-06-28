package javaPracticeExample;

public class arrayPassByReference 
{
	public static void passByReference(String[] a)
	{
		for (int i = 0 ; i< 2 ; i++ )
		{
		System.out.println("Value in Array A is :  A["+i+"]=" + a[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		String[] b = {"Apple","Grapes"};
		
		for (int i = 0 ; i< 2 ; i++ )
		{
		System.out.println("Value in Array B is : B["+i+"]=" + b[i]);
		}
		arrayPassByReference.passByReference(b);		

	}

}

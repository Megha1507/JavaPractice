package javaPracticeExample;

public class AddingMatrices {

	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3},{3,4,5}};
		
		int[][] b = {{1,2,3},{3,4,4}};
		//System.out.println("Sum of the 2 array a and b is " + "a["+i+"]["+j+"]" + "b["+i+"]["+j+"]");
		
		System.out.println("Size of an Array=" + a.length);
		
		for(int i= 0; i<a.length ; i++)
		{
			for( int j= 0; j<=a.length ; j++)
			{
				
			int c = a[i][j] + b[i][j];
			System.out.print(c + " ");		
			
			}
			System.out.println();

		}
	}
}

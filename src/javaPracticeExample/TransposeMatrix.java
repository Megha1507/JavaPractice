package javaPracticeExample;

public class TransposeMatrix {

	public static void main(String[] args) 
	{
		int[][] a = {{1,3,4},{2,4,3},{3,4,5}}; 
		
		int[][] c = new int[3][3];
		
		for(int i  = 0 ; i< 3 ; i++ )
		{
			for(int j = 0 ; j < 3 ; j++ )
			{
				c[j][i] = a[i][j];
			}
			
		}
		System.out.println("Transpose of a matrix is : ");
		
		for(int k = 0 ; k < 3 ; k++) 
		{
			for(int l = 0 ; l < 3 ; l++ )
			{
			System.out.print( c[k][l] + " " );
			}
			System.out.println( " " );
		}
	}

}

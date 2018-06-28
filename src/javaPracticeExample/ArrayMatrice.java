package javaPracticeExample;

public class ArrayMatrice {

	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i= 0 ; i<3 ; i ++)
		{
			for(int j= 0 ; j<3 ; j ++)
			{
	// "print" Array like a metrix 
				System.out.print(arr[i][j]+" ");
			}
			 System.out.println();
			 
		}
		
		for(int i= 0 ; i<3 ; i ++)
		{
			for(int j= 0 ; j<3 ; j ++)
			{
	// Prints Array in a line 
				System.out.println(arr[i][j]+" ");
			}
			 System.out.println();
		} 
			
	}

}

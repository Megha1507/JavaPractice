package javaPracticeExample;

public class MultidimensionArray {

	public static void main(String[] args) 
		{
		int twoD[][] = new int[4][5];
	
	// Assign elements in it
	
		twoD[0][0] = 1;
		twoD[0][1] = 2;
		twoD[0][2] = 4;
	
	//Printing single variable
		
		System.out.println(twoD[0][0]);
		
	// Printing all variables 
		
			for (int i = 0 ; i< 1 ; i++ )
				{
				for (int j = 0 ; j<3 ; j++)
					{
						twoD[i][j] += 0;
						System.out.println("twoD["+i+"]["+j+"]" + twoD[i][j]);
					}
				}
			}

}

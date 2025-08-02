package arrays;

public class Multi_dimensional_array 
{
	public static void main(String [] args)
	{
		int[][] multi= {{1,2},{3,4}}; // It is 2X2 array.
		
		for(int i=0;i<multi.length;i++)
		{
		
			for(int j=0;j<multi.length;j++)
			{
				System.out.println(multi[i][j]);
			}
		}
		
		
	}

}

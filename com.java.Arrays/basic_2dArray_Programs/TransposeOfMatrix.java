package basic_2dArray_Programs;

public class TransposeOfMatrix 
{
	
	public static int[][] transpostmatrix(int [][] gg)
	{
		
		int rows = gg.length;
		int columns = gg[0].length;
		int [][]  transposed = new int [rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
					System.out.print(gg[j][i]);
					transposed[i][j] = gg[j][i];
			}
			System.out.println("");

		}
			return transposed;
	}
	
	public static void main(String [] args)
	{
		int [] [] aa = {{1,3},{4,8}};
		
		int rows = aa.length;
		int columns = aa[0].length;
		
		int [][]  transposed1 = new int [rows][columns];
		transposed1 =transpostmatrix(aa);
		System.out.println(transposed1);
	}

}

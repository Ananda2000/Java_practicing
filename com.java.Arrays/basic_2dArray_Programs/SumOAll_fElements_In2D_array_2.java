package basic_2dArray_Programs;

public class SumOAll_fElements_In2D_array_2 
{
	public static int[][] sum_2d(int[][] aa, int [][] bb)
	{
		int [][] cc = new int[2] [2];
		
		for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<bb.length;j++)
			{
				cc[i][j] = aa[i][j] + bb[i][j];
			}
		}
		
		return cc;
	}
	
	public static void main(String [] args)
	{
		int [][] Sum_2dArray = {{1,2},{3,4}};
		int [][] Sum_2dArray_1 ={{6,7},{8,9}};
		
		int dd[][] =sum_2d(Sum_2dArray,Sum_2dArray_1 );
		
		for(int i=0;i<dd.length;i++)
		{
			for(int j=0;j<dd.length;j++)
			{
				System.out.print(dd[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
	}

}

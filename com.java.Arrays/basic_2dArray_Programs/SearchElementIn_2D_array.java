//4-- Search an Element in a 2D Array.

package basic_2dArray_Programs;

public class SearchElementIn_2D_array 
{
	
	public static void main(String [] args)
	{
		int ele =3;
		int count =0;
		int [][] aa = {{1,2},{3,4}};
		int row = aa.length;
		int columns = aa[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(aa[i][j] == ele)
				{
					count++;
				}
				
			}
		}
		if(count >0)
		{
			System.out.println(ele +"-- Is present in matrix...");
		}
		else
		{
			System.out.println(ele +"-- Not present in matrix ");
		}
	}

}

//1--Print a 2D Array. 

package basic_2dArray_Programs;

public class Print_2d_Array_1 
{
	
	
	public static void main(String [] args)
	{
		int [][] aa = {{1,2},{3,4}};
		
		 for(int i=0;i<aa.length;i++)
		 {
			 for(int j=0;j<aa[0].length;j++)
			 { 
				 System.out.print(aa[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}

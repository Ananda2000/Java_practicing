package pojoClass_for_JDBC;

import java.util.Collection;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class SecondLargest 
{
	
	public static void main(String [] args)
	{
		int[] aa = {5,2,9,6};
		int bb ;
		int [] cc=null;
		
		for(int i=0;i<aa.length;i++)
		{
			for(int j=i+1;j<aa.length;j++)
			{
				if(aa[j]< aa[i])
				{
					bb=aa[i];
					aa[i]=aa[j];
					aa[j]=bb;
				}
			}
			
		}
		int leng = aa.length-2;
		
		for(int i=0;i<aa.length;i++)
		{
			if(aa[i]==leng)
			{
				System.out.println("The 2nd largest number --");
		System.out.println(aa[leng]);
			}
			
	
		}
	}

}

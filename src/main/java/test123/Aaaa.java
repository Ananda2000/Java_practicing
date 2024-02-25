// The output should be in format "a2b2c2" if it is sequence..

package test123;

public class Aaaa 
{
	public static void main(String [] args)
	{
		String s= "aabbcc";
		System.out.println(s);
		char [] aa = s.toCharArray();
		int count=1;
		
		int size = s.length();
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<size;j++)
			{
				
				
				if(aa[i] == aa[j])
				{
					count++;
					//System.out.println(aa[i]);
					
				}
				else
				{
					//count++;
					i=j-1;
					break;
				}
			}
			
			System.out.println(aa[i]+""+count);
			count=1;
			
		}
	}

}

// Display the duplicate characters in the string using maps...

package entryset_using;

import java.util.HashMap;
import java.util.Map;

public class Interview1_Entryset 
{
	public static void main(String [] args)
	{
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		String str ="anand";
		
		char [] aa = str.toCharArray();
		
		int sizeaa=aa.length;
		System.out.println("The character array ---"+sizeaa);
		for(int i=0;i<sizeaa;i++)
		{
			System.out.println(aa[i]);
			if(maps.containsKey(aa[i]))
			{
				maps.put(aa[i], maps.get(aa[i])+1);
			}
			else
			{
				maps.put(aa[i], 1);
			}
		}
		System.out.println(maps);
		
		System.out.println("Displaying only duplicate keys and values ----");
		
		for (Map.Entry<Character, Integer> c : maps.entrySet()) 
		{
			if(c.getValue()>1)
			{
				System.out.print(c.getKey()+"---");
				System.out.println(c.getValue());
			}
			
		}
	}

}

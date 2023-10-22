// HERE WE ARE USING MAP.ENTRYSET() METHOD TO ITERATE...

package simpleMApPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySet_Method_using 
{
	public static void main(String [] args)
	{
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		map2.put("key5", 5);
		map2.put("key10", 10);
		
	//Set<Map.Entry<String, Integer>> set1=	map2.entrySet();
	
	//System.out.println(set1);
	for (Map.Entry<String, Integer> entry : map2.entrySet()) 
	{
		System.out.print(entry.getKey()+"---");
		System.out.println(entry.getValue());
		
		
	}
	}

}

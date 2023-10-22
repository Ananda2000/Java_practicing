// THIS PROGRAM WE ARE USING VALUE() METHOD OF MAPS CLASS TO DISPLAY VALUES IN MAPS....

package simpleMApPrograms;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Simple_4 
{
	public static void main(String [] args)
	{
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("anan", 5);
		map1.put("hari", 6);
		
		Collection<Integer> st = map1.values();
		
		System.out.println(st);
		
		for (Integer integer : st) 
		{
				System.out.println(integer);
				boolean bb =map1.containsValue(6);
				if(bb==true)
				{
					System.out.println("The value is present....");
					break;
				}
		}
		
		
	}

}

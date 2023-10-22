// THIS PROGRAM WE ARE USING ENTRYSET() AND MAP.ENTRY INTERFACE... FOR WORKING ON PROGRAM....

package simpleMApPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import basic_Java_Programs.hashmap;

public class Simple2 
{
	public static void main(String [] args)
	{
		Map<String, Integer> mapp1 = new HashMap<String, Integer>();
		
		String [] sttt = {"hari","soma","ananda","ananda"};
		
		System.out.println(mapp1);
		
		
		
		for (String object : sttt)
		{
			System.out.println("object kekys ----"+object);
			if(mapp1.containsKey(object))
			{
				System.out.println("=======================");
				mapp1.put(object, mapp1.get(object)+1);
			}
			else
			{
				mapp1.put(object,1);
			}
			
		}
		System.out.println("this is displaying after finding the duplicate -----");
		System.out.println(mapp1);
		
		
		for (Map.Entry<String, Integer> string : mapp1.entrySet())
		{
			if(string.getValue() >1)
			{
				System.out.println("The duplicates are -----------------------");
				System.out.println(string.getKey()+"----"+string.getValue());
			}
			
		}
	}

}

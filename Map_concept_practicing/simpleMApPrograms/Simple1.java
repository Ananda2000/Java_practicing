//THIS PREOGRAM WE ARE USING KEYSET()  METHOD TO DISPLAY THE KEY AND VALUE PAIRS....

package simpleMApPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import basic_Java_Programs.hashmap;

public class Simple1 
{
	public static void main(String [] args)
	{
		Map map1 = new HashMap();
		
		map1.put("anand",1 );
		map1.put("babu", 2);
		map1.put("hari", 3);
		
		System.out.println(map1.values());
		
		System.out.println("HERE WE ARE DISPLAYING MAP VALUES DIRECTLY ....");
		System.out.println(map1);
		
		System.out.println("======== HERE WE USING KEYSET() METHOD TO RETURN SET VIEW OF MAP KEYS");
		Set set1 = map1.keySet();
		System.out.println(set1);
		
		
		System.out.println("======== HERE WE USING iterating the keys using iterator method ");
		
		Iterator itr = set1.iterator();
		while(itr.hasNext())
		{
			String str1 =(String) itr.next();
			System.out.print(str1 +"---");
			int aa =(Integer) map1.get(str1);
			
			System.out.println(aa);
			
		}
		
		System.out.println("below we are using FOREACH LOOP TO ITERATE SET KEYS");
		for (Object object : set1) 
		{
		
			String str =String.valueOf(object);
			System.out.println(str+"----");
			System.out.println(map1.get(str));
			
		}
		
		
	}

}

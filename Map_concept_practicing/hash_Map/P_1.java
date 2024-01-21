//Write a Java program to associate the specified value with the specified key in a HashMap.

package hash_Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class P_1 
{
	public static void main(String [] args)
	{
		HashMap<Integer, String> hsmp = new HashMap<Integer, String>();
		hsmp.put(1, "value_1");
		hsmp.put(2, "value-2");
		hsmp.put(3, "value-3");
		
		
		System.out.println("The size of hashmpa ---"+ hsmp.size() );
		
		for (Entry<Integer, String> string : hsmp.entrySet()) 
		{
			System.out.println(string.getKey()+" - "+string.getValue());
			
		}
		 
		System.out.println(hsmp.containsValue("value_1"));
		
		
			System.out.println("Iterate using keyset -------");
	}

}

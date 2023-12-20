// Here we are using entryset() method to iterate over map....

package entryset_using;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import basic_Java_Programs.hashmap;

public class EntrySet1 
{
	public static void main(String[] args)
	{
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		maps.put("anand", 1);
		maps.put("anand2", 2);
		maps.put("anand3", 3);
		
		for (Map.Entry<String, Integer> vales : maps.entrySet()) 
		{
			System.out.print(vales.getKey()+"--");
			System.out.println(vales.getValue());
			
		}
		 
		// use of key set to display the data...
		System.out.println("This is keyset method used to display the key values -------");
		Set<String> stt = maps.keySet();
		System.out.println(stt);
		
		
		System.out.println("The below one is using the iterator methodssss----");
		Iterator<String> itr = stt.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		

	}

}

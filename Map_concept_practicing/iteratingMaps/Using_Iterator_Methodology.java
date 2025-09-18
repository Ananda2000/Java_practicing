package iteratingMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Using_Iterator_Methodology 
{
	public static void main(String [] args)
	{
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "value1");
		mp.put(2, "value2");
		mp.put(3, "value3");
		
		
		Iterator<Map.Entry<Integer, String>> itr = mp.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> gg = itr.next();
			System.out.println(gg.getValue() +"--"+gg.getKey());
			
		}
	}

}

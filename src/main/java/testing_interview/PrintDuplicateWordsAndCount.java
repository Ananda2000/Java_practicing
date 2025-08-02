//"Java is awesome and Python is awesome too". Find the duplicate words and print them along with count

package testing_interview;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateWordsAndCount {
	
	

	
	public static void main(String [] args)
	{
		String string ="Java is awesome and Python is awesome too";
		
		String [] strarr = string.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String string2 : strarr) 
		{
			
			if(map.containsKey(string2))
			{
				map.put(string2, map.get(string2)+1);
				
			}
			else
			{
				map.put(string2, 1);
			}
			
		}
		
		System.out.println(map);
		
		System.out.println("THE DUPLICATE WORDS AND IITS REPETATION");
		for (Map.Entry<String, Integer> mapiteration : map.entrySet()) 
		{
			if(mapiteration.getValue() >1)
			{
				System.out.println(mapiteration.getKey()+"---"+mapiteration.getValue());
			}
			
		}
		
	}

}

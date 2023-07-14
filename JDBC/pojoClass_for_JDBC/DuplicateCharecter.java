package pojoClass_for_JDBC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import basic_Java_Programs.hashmap;

public class DuplicateCharecter 
{
	public static void main(String[] args)
	{
		String name="Ananda";
		
		Map<Character, Integer> charss = new HashMap<Character, Integer>();
	
		char[] gg =name.toCharArray();
		
		/*for(int i=0;i<gg.length;i++)
		{
			if(charss.containsKey(gg[i]))
				
			{
				charss.put(gg[i], charss.get(gg[i])+1);
			}
			else
			{
				charss.put(gg[i], 1);
			}
		}
		
		System.out.println(charss);
		*/
		
		for(Character ch:gg)
		{
			if(charss.containsKey(ch))
			{
				charss.put(ch, charss.get(ch)+1);
			}
			else
			{
				charss.put(ch, 1);
			}
			
		}
		Set<Character> keys = charss.keySet();
		for(Character ch:keys)
		{
			if(charss.get(ch)>1)
			{
				System.out.println(ch+" --is-- " +charss.get(ch)+"--times");
			}
		}
	
	}

}

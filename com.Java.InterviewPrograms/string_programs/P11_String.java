//1)Write a Java program to find the duplicate words and their number of occurrences in a string?

package string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P11_String {
	
	public static void display_Duplicate(String str)
	{
		String gg = str;
		
		String [] kk = gg.split(" ");
		HashMap<String, Integer> duplicate_finding = new HashMap<String, Integer>();
		
		for (String string1 : kk) {
			if(duplicate_finding.containsKey(string1))
			{
				duplicate_finding.put(string1, duplicate_finding.get(string1)+1);
			}
			else
			{
				duplicate_finding.put(string1, 1);
			}
			
			
		}
		System.out.println(duplicate_finding);
		
		Set<String> ss = duplicate_finding.keySet();
		System.out.println(ss);
		
		for (Map.Entry<String, Integer> string23 : duplicate_finding.entrySet()) {
			
			if(string23.getValue()>1)
			{
				System.out.println(string23.getKey() +"--"+ string23.getValue());
			}
		}
		
	}
	
	public static void main(String [] args)
	{
		String str1 ="This is java , java programming";
		display_Duplicate(str1);
	}

}

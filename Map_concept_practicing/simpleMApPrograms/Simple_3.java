// different ways to iterate the set......

package simpleMApPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Simple_3 
{
	public static void main(String[] args)
	{
		
		Set set1 = new HashSet();
		set1.add("1");
		set1.add("2");
		set1.add("3");
		
		System.out.println("HERE WE USED FOREACH LOOP TO ITERATE ------------");
		for (Object object : set1) 
		{
			System.out.println(object);
			
		}
		
		//System.out.println("HERE WE USED FOR LOOP WITH COUNT..");
		// WE CANT ITERATE WITH list or set elements using for loops
		
		System.out.println("USING OF ITERATOR TO DISPLAY DATA IN SET OBJECT..");
		
		Iterator itr = set1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());		
			
		}
		
		
		
	}

}

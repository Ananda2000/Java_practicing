// Here we are trying to use iterator for set collection...

package iterators_interface_java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class Iterating_set 
{
	public static void main(String [] args)
	{
		Set<String> set1 = new LinkedHashSet<String>();
		
		set1.add("1 set");
		/*set1.add("5-set");
		set1.add("3-set");*/
		
		System.out.println("==----- HERE WE DISPLAY WITHOUT LOOPING ------------===========");
		System.out.println(set1);
		
		
		System.out.println("===-- we sorted below using foreach loop =============----");
		for (String string : set1) {
			System.out.println(string);
		}
		
		System.out.println("=== we using the ITERATOR INTERFACE -------------=========");
		Iterator itert = set1.iterator();
		while(itert.hasNext())
		{
			System.out.println(itert.next());
		}
		
	}

}

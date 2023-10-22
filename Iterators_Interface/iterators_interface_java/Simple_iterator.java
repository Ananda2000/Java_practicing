package iterators_interface_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Simple_iterator 
{
	public static void main(String [] args)
	{
		
		
		List<String> arlis = new ArrayList<String>();
		arlis.add("Ananda");
		arlis.add("Kumar");
		arlis.add("god");
		System.out.println("Directly displaying from arraylist....");
		System.out.println(arlis);
		
		System.out.println("==--- HERE WE USING FOREACH LOOP FOR ITERATION ---==========");
		for (String string : arlis) 
		{
			System.out.println(string);
			
		}
		
		System.out.println("=========-----Here we are using the iterator interface to iterate.....-=-==");
		
		Iterator<String> itr = arlis.listIterator();
		while (itr.hasNext())
		{
		System.out.println(	itr.next());
		}
		
		
	}

}

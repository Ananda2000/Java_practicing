package list_Iteration;

import java.util.LinkedList;
import java.util.List;

public class Using_Enhanced_forloop 
{
	public static void main(String [] args)
	{
		List<String> lis = new LinkedList<>();
		lis.add("anand1");
		lis.add("ananda2");
		lis.add("ananda3");
		
//Display before adding data inbetween.
			System.out.println(lis);
// Here updating the data inbetween...
		lis.add(1, "ananda1.5");
// Displaying after adding data inbetween the list.
		System.out.println(lis);
		
// Iterating data using Enhanced Forloop,// foreach loop....
		for (String datailis : lis) {
			System.out.println(datailis);
		}
	}

}

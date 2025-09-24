// Using terminal operator..

package streams;

import java.util.ArrayList;
import java.util.List;

public class Terminal_operator_forEach 
{
	public static void main(String [] args)
	{
		System.out.println("For testing purpose...");
		
	// Collection list declaration...
		List<Integer> streamss = new ArrayList<Integer>();
		streamss.add(1);
		streamss.add(5);
		streamss.add(2);
		streamss.add(9);
		
		streamss.stream().forEach(e -> System.out.println(e));
	}

}

package list_Iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Using_IterationClass 
{
	public static void main(String [] args)
	{
		List<Integer> A_list = new ArrayList<>();
		A_list.add(1);
		A_list.add(2);
		A_list.add(3);
		
		
// displaying all elements in arraylist.
			System.out.println(A_list);
		A_list.add(1, 11);
// Iterate using iterator class.
			
			Iterator<Integer> itr = A_list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}

}

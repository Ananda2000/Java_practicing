// HERE WE ARE USING THE COLLECT TERMINAL OPERATOR TO CONVERT THE DATA..

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Terminal_Operator_collect 
{
	public static void main(String [] args)
	{
		int [] gg = {4,6,2,9,4};
		
		List<Integer> kk =Arrays.stream(gg).boxed().collect(Collectors.toList());
		System.out.println("The list elements -- "+kk);
		System.out.println("The 1st element in the list --- "+kk.get(0));
		
		
	}

}

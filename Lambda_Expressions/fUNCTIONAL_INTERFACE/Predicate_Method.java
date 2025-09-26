// THIS METHOD WILL RETURN BOOLEAN VALUE AND IT TAKE ANY KIND OF  'T' PARAMETER.

package fUNCTIONAL_INTERFACE;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Predicate_Method 
{
	public static void main(String [] args)
	{
		int [] aa = {1,2,3,4,5,6};
		IntStream kk = Arrays.stream(aa);
		
		//Predicate<Integer> predicate = n -> (n % 2) == 0;
		
		
		Predicate<Integer> pridic = (g) ->	(g % 2) == 0;
		for (int i : aa) 
		{
			if(pridic.test(i))
			{
				System.out.println(i);
			}
			
		}
		
		
	}

}

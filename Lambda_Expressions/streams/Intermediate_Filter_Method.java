// filter elements which are divisible by 5...

package streams;

import java.util.Arrays;
import java.util.List;

public class Intermediate_Filter_Method 
{
	public static void main(String [] args)
	{
		
		List<Integer> lis = Arrays.asList(1,5,10,4,12,54);
		lis.stream()
		.filter(e -> e%5 ==0)
		.forEach(e -> System.out.println(e));
	}

}

// IMPLEMENTED ALL MATCH METHOD... IN TERMINAL OPERATOR..


package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Terminal_AnyMatch_Method 
{
	public static void main (String [] args)
	{
		List<Integer>  aa = Arrays.asList(1,4,5,6,6);
		boolean b1 = aa.stream().allMatch(a -> a>0);
		boolean b2 = aa.stream().allMatch(a ->a < 1);
		System.out.println(b1);
		System.out.println(b2);
	}

}

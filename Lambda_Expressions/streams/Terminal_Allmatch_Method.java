// 6. allMatch(): method in streams terminal operation.

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Terminal_Allmatch_Method 
{
	public static void main(String [] args)
	{
		List<String> bb = Arrays.asList("zee38","kee","udi","Aee");
		List<String> aa = Arrays.asList("zee38");
		boolean gg = aa.stream().allMatch(str -> str.length() >=5);
		boolean zz = bb.stream().allMatch(str -> str.length() >=5);
		System.out.println(gg);
		System.out.println(zz);
	}

}

//EXAMPLE FOR MAP FUNCTION...
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermediate_Map_Method 
{
	public static void main(String [] args)
	{
		List<String> stringType = Arrays.asList("5","7","10");
		//List<Integer> convertToInt= stringType.stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> convertToInt = stringType.stream().map(Integer::valueOf).collect(Collectors.toList());
	}

}

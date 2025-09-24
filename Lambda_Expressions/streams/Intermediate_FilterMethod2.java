// This class implement filtering data where word ends with character s.
package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Intermediate_FilterMethod2 
{
	public static void main(String [] args)
	{
		Stream<String> mm =Stream.of("anands","kumar","raghu","sahms");
		mm.filter(e -> e.endsWith("s")).forEach(System.out::println);
 	}

}

// HERE WE ARE SORTING BASED ON BASIC ORDER..

package streams;

import java.util.stream.Stream;

public class Intermediate_sort_Method1 
{
	public static void main(String [] args)
	{
		Stream<Integer> aa = Stream.of(10,5,3,55,2,5);
		aa.sorted().forEach(e -> System.out.println(e));;
	}

}

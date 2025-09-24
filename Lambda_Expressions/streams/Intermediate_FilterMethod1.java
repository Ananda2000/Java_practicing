
// pick up the words where 1st index is upper case letter.
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate_FilterMethod1 
{
	public static void main(String [] args)
	{
/*	List<String> aa = Arrays.asList("aNand","HARISH","Soma", "BAbu","ravi");
		Stream<String> gg = aa.stream();
		Stream.fil*/
		
		 Stream<String> streams = Stream.of(
		            "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
		 streams.filter(e -> Character.isUpperCase(e.charAt(1)))
		 .forEach(e -> System.out.println(e));
	}


}

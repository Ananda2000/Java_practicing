// HERE USING COMPARATOR TO SORT THE ELEMENTS BASED ON THERE LENGTH...

package streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class Intermediate_SortMethod2 
{
	public static void main(String [] args)
	{
		Stream<String> stt = Stream.of("this","is","g","gaokao");
		
		Stream<String> sss =stt.sorted(Comparator.comparingInt(String::length));
		sss.forEach(e -> System.out.println(e));
		
	}

}

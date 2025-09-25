// HERE WE ARE IMPLEMENTING flatmap() WORKING.. IT IS USED TO WORK WITH COLLECTIONS OF COLLECTIONS {nested collections}.

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate_flatmap_Method 
{
	public static void main(String [] args)
	{
		List<Integer> kk =Arrays.asList(1,4,5,6,7,11);
		List<Integer> gg = Arrays.asList(44,2,3,99);
		List<Integer> hh = Arrays.asList(222,200,225,201);
		
		Stream<List<Integer>> str = Stream.of(kk,gg,hh);
		Stream<Integer> zz = str.flatMap(List::stream);
		zz.sorted().forEach(e -> System.out.println(e));
	}

}

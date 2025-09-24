// HERE WE USE DISTINCT METHOD OF TO REMOVE DUPLICATES IN THE DATA..

package streams;

import java.util.stream.Stream;

public class Intermediate_DistinctMethod 
{
	public static void main(String [] args)
	{
		Stream<String> sst = Stream.of("ss","Abc","zzz","ss");
		// sst.forEach(System.out::println);  // THIS STATEMENT IS USED TO PRINT STREAM BEFORE USING DISTINCT METHOD..
		sst.distinct().forEach(e -> System.out.println(e));
	}

}

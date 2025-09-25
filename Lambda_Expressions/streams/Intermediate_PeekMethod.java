// IT IS ONE OF THE INTERMEDIATE METHOD WHICH IS USED IN DEBUGGING THE STREAMSS.

package streams;

import java.util.stream.Stream;

public class Intermediate_PeekMethod 
{
	public static void main(String [] args)
	{
		 //Stream<String> stream = Stream.of("apple", "banana", "cherry");
	/*	Stream<Integer> stream = Stream.of(2,5,1,6,7,2,19,99,22,45);
	        // Use peek() to print elements at different stages of the pipeline
	        stream.peek(e -> System.out.println("Original: " + e))
	              //.map(String::toUpperCase)
	              .peek(e -> System.out.println("Uppercased: " + e))
	              .filter(s -> s >=10)
	              .peek(e -> System.out.println("Filtered: " + e));
	              .forEach(s -> {}); //
	        */
	        
	Stream<Integer> stt = Stream.of(2,5,1,6,7,2,19,99,22,45);
		System.out.println("This is before sorting---");
		stt.map(Integer::intValue).peek(e -> System.out.println("---------"+e))
		
		//System.out.println("This is after sorting the data.....");
		.sorted()
		.peek(v -> System.out.println("After sorting -- "+v)).forEach(z ->{}); // HERE DISPLAYING ELEMENTS AFTER SORTING...
		
	}

}

// Ter

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Terminal_Operator_count 
{
	public static void main(String [] args)
	{
		int [] aa = {1,2,9,4,6};
		long countss = Arrays.stream(aa).count();
		System.out.println("The total count is --"+countss);
		System.out.println("this is end");
		
	}

}

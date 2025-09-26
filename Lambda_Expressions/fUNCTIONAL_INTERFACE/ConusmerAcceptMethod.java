
// HERE WE DISPLAYING ONLY THE BASIC USE OF ACCEPT METHOD...
package fUNCTIONAL_INTERFACE;

import java.util.function.Consumer;

public class ConusmerAcceptMethod 
{
	public static void main(String [] args)
	{
		Consumer<Integer> aa = (a) -> 
		{
			System.out.println(a);
		};
		aa.accept(10);
		}
	
}



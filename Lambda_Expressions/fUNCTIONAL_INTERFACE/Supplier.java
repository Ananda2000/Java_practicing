// This method consists of only single method get()...

package fUNCTIONAL_INTERFACE;
//import java.util.function.*;

public class Supplier {

	public static void main(String args[])
    {
		// THIS FUNCTION RETURNS A RANDOM VALUE...
    java.util.function.Supplier<Double> aa = () -> Math.random();
    // DISPLAYING THE OUTPUT....
     System.out.println(aa.get());
    }
}

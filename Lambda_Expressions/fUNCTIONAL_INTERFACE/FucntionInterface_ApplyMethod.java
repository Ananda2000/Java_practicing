package fUNCTIONAL_INTERFACE;

import java.util.function.Function;

public class FucntionInterface_ApplyMethod 
{
	public static void main(String [] args)
	{
		Function<Integer, Integer> func = (a) -> a/2;
		System.out.println(func.apply(10));
		
	}

}

package arrays_Interview;

import java.util.Arrays;

public class Comparer_2ArraysAreEqual 
{
	public static void main(String [] args)
	{
		int [] arrr1 = {1,2,3,4};
		int [] arrr2 = {4,5,6,7};
		int [] arrr3 = {1,2,3,4};
		
		System.out.println(arrr1.equals(arrr2));
		System.out.println(Arrays.equals(arrr1, arrr2));
		System.out.println(arrr1.hashCode());
		System.out.println(arrr3.hashCode());
		System.out.println(arrr1.equals(arrr3));
		// This is correct way of comparision..
		System.out.println(Arrays.equals(arrr1, arrr3)); 
	}

}

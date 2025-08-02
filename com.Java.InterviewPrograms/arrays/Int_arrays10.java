//10) Write a Java program to convert an array to ArrayList and an ArrayList to array?

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Int_arrays10 {

	public static void main(String[] args) {
		Integer[] aa = { 1, 2, 3, 4 };

		List<Integer> gg = new ArrayList<Integer>(Arrays.asList(aa));

		System.out.println(gg.size());

		System.out.println(gg);
		int[] bb = new int[gg.size()];

		for (int i = 0; i < gg.size(); i++) {
			bb[i] = gg.get(i);
		}

		System.out.println(bb[0]);
		System.out.println(bb[1]);
		System.out.println(bb[2]);
		System.out.println(bb[3]);

	}
}

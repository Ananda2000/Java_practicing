// Find the 2nd largest number in the array list...
//HERE WE ARE USING ARRAYS CLASS TO SORT THE ELEMENTS.

package arrays;

import java.util.Arrays;

public class Int_array2_1 {

	public static void main(String[] args) {

		int[] gg = { 2, 8, 9, 10, 5 };
		Arrays.sort(gg);
		int lenn = gg.length;
		for (int i = 0; i < lenn; i++) {
			// System.out.println(gg[i]);
		}
		System.out.println("The 2nd largest nUmber is ---");

		int ll = lenn - 2;
		System.out.println(gg[ll]);
	}

}

//5)	Write a Java program to find continuous sub array whose sum is equal to a given number?

package arrays;

import java.util.Arrays;

public class Int_array5 {

	public static void main(String[] args) {
		int[] gg = { 1, 2, 3, 4, 5, 6 };
		int num = 6;
		int arraylength = gg.length;

		for (int i = 0; i < arraylength; i++) {
			int sum = 0;
			for (int j = i; j < arraylength; j++) {
				sum = sum + gg[j];
				if (sum == num) {
					System.out.println(
							"The sum of sequence are equla --" + Arrays.toString(Arrays.copyOfRange(gg, i, j + 1)));
				}
			}
		}
	}
}

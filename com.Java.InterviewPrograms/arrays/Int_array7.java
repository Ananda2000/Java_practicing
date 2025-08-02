//7)	Write a Java program to separate zeros from non-zeros in an integer array?

package arrays;

import java.util.Arrays;

public class Int_array7 {
	public static void main(String[] args) {
		int[] aa = { 2, 5, 0, 1, 0, 6, 7 };
		separate_zerosAndNonZeros(aa);
	}

	public static void separate_zerosAndNonZeros(int[] gg) {

		Arrays.sort(gg);
		int kk = gg.length;
		for (int i = 0; i < kk; i++) {
			System.out.print(gg[i] + ",");
		}
	}

}

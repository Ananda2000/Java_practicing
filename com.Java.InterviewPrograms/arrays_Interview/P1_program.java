//Java Program to Reverse an Array Without Using Another Array

package arrays_Interview;

public class P1_program {

	public static void main(String[] args) {

		int[] gg = { 1, 2, 3, 4 };
		arrayRevers(gg);
	}

	public static void arrayRevers(int[] aa) {
		int sizz = aa.length;
		for (int i = sizz - 1; i >= 0; i--) {
			System.out.print(aa[i] + ",");
		}

	}
}

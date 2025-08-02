//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

package arrays;

public class Int_arrays4 {
	public static void main(String[] args) {
		System.out.println("This is testing --");
		int[] hh = { 2, 7, 4, -5, 11, 5, 20 };
		int nums = 15;
		display(hh, nums);
	}

	static void display(int[] gg, int num) {
		int aa = gg.length;

		for (int i = 0; i < aa; i++) {
			for (int j = i + 1; j < aa; j++) {

				if (gg[i] + gg[j] == num) {
					System.out.println(gg[i] + "+" + gg[j] + " = " + num);
				}

			}
		}

	}

}

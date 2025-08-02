//3)	Write a Java program to check the equality of two arrays

package arrays;

import java.util.Arrays;

public class Int_array3 {

	public static void main(String[] args) {
		int[] aa = { 1, 2, 3 };
		int[] bb = { 10, 5, 3, 12, 8, 56 };
		int[] cc = { 1, 2, 3 };

		Arrays.sort(bb, 3, 5);

		System.out.println(Arrays.toString(bb));
		boolean ab = Arrays.equals(aa, bb);
		boolean gg = Arrays.equals(aa, cc);

		if (ab == true) {
			System.out.println("This aa and bb are Equal");
		} else {
			System.out.println("This aa and bb are Not Equal");
		}

		if (gg == true) {
			System.out.println("This aa and cc are Equal");
		}

		else {
			System.out.println("This aa and cc are Not Equal");
		}

	}

}

//REVERSING ONLY THE ODD/EVEN WORDS IN A STRING...

package string_programs;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the string....");
		String aa = sc1.nextLine();
		String[] afterSplitting = aa.split(" ");
		int arraysize = afterSplitting.length;

		System.out.println("PRINTING REVERSE OF ");
		for (int i = 0; i < arraysize; i++) {

			if (i % 2 != 0) {
				//System.out.println("I values --" + i);
				int zz = afterSplitting[i].length();
				for (int j = zz - 1; j >= 0; j--) {
					System.out.print(afterSplitting[i].charAt(j));

				}

			} else {

				System.out.print(afterSplitting[i]);

			}
			System.out.print(" ");

		}

	}

}

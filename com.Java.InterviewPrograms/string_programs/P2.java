//REVERSE THE WORDS IN GIVEN STRING.

package string_programs;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the sentance..");
		String str = sc1.nextLine();
		System.out.println("---------------------");
		System.out.println(str);
		String[] aa = str.split(" ");
		int NumberOfWords = aa.length;
		System.out.println("number of words --" + NumberOfWords);
		StringBuilder sbuild = new StringBuilder();

		for (int i = 0; i < NumberOfWords; i++) {
			sbuild = sbuild.append(aa[i]);
			sbuild = sbuild.append(" ");

		}
		System.out.println(sbuild);
		// sbuild.reverse();
		System.out.println("After reversing ------------");
		System.out.println(sbuild);

		System.out.println("// BELOW WE ARE ONLY REVERSING THE WORDS....");
		for (int j = NumberOfWords - 1; j >= 0; j--) {
			System.out.print(aa[j]);
			System.out.print(" ");
		}

	}

}

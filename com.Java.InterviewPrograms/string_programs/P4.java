//Palindrome check for given input.

package string_programs;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		System.out.println("Try programiz.pro");
		Scanner scnr = new Scanner(System.in);
		String pal=scnr.nextLine();
		//String pal = "maddam";
		int leng = pal.length();
		int j = 0;
		int count = 0;
		for (int i = leng - 1; i >= 0; i--) {
			if (pal.charAt(j) == pal.charAt(i)) {
				//System.out.println("out -1");
				j++;
				count++;
			}

		}
		if (count == leng) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome..");
		}
	}
}

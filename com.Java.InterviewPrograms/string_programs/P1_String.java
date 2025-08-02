// REVERSE THE STRING WITHOUT USING INTERNAL METHOD..

package string_programs;

import java.util.Scanner;

public class P1_String {
	public static void main(String[] args) {
		System.out.println("Enter the string..");
		Scanner scr = new Scanner(System.in);
		String str = scr.next();
		System.out.println("----The string is---" + str);
		// Find the string size..
		int leng = str.length();
		System.out.println("Reversed String is --");
		for (int i = leng - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}

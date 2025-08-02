//Java Program to Check Palindrome String

package interview_Programs;

import java.util.Scanner;

public class P1_program {
	public static void main(String[] args) {

		// WITHOUT USING THE BUILTIN FUNCTION...
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER THE STRING");
		String str = sc.nextLine();
		boolean mm = checkpalindrome(str);
		if (mm == true) {
			System.out.println("IT IS NOT PALINDROME");

		} else {
			System.out.println("IT IS PALINDROME..");
		}
	}

	public static boolean checkpalindrome(String ss) {
		int legg = ss.length();
		boolean kk = false;
		for (int i = 0; i < legg / 2; i++) {
			if (ss.charAt(i) != ss.charAt(legg - i - 1)) {
				kk = true;
				break;
			}
		}
		return kk;

	}

}

/*
 * String str = "madam"; boolean kk = false; int legg = str.length();
 * 
 * for (int i = 0; i < legg / 2; i++) { if (str.charAt(i) != str.charAt(legg - i
 * - 1)) {
 * 
 * kk = true; break;
 * 
 * } } if (kk == true) { System.out.println("THE STRING IS NOT PALINDROME"); }
 * else { System.out.println("THE STRING IS PALINDROME..."); }
 */
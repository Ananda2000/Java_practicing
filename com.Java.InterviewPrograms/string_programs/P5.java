// SUM OF 2 LARGE NUMBERS..

package string_programs;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {

		P5 aa = new P5();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("PLEASE ENTER THE NUMBER --");
		long num1 = sc1.nextLong();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter 2nd number---");
		long num2 = sc2.nextLong();

		long result = sum(num1, num2);
		System.out.println("The sum of 2 munbers is --" + result);

	}

	public static long sum(long a, long b) {
		return a + b;
	}
}

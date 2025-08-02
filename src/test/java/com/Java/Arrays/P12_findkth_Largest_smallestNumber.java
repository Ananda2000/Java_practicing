//12: Find the Kth Largest and Smallest Element in an Array
package com.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P12_findkth_Largest_smallestNumber {
	public static void main(String[] args) {
		int[] arr_list12 = { 7, 5, 9, 3, 2, 8, 1, 6 };
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the nth element----");
		int k = scn.nextInt();
		System.out.println("this is number ---" + k);

		Arrays.sort(arr_list12);
		System.out.println(Arrays.toString(arr_list12));

		System.out.println("the " + k + "th largest element --" + arr_list12[arr_list12.length - k]);
		System.out.println("The " + k + "th Smallest Element --" + arr_list12[k - 1]);
	}

}

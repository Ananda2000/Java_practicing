//  16: Rotate Array by N Elements...
package com.Java.Arrays;

public class P16_RotateTheArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 2;
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, n, arr.length - 1);
		reverseArray(arr, 0, arr.length - 1);
		//
		System.out.println("Rotated array: " + java.util.Arrays.toString(arr));
	}

	static void reverseArray(int[] agg, int start, int end) {
		while (start < end) {
			int temp = agg[start];
			agg[start] = agg[end];
			agg[end] = temp;
			start++;
			end--;
		}

	}
}

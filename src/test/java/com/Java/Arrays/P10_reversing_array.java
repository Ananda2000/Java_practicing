// This program we are reversing the given array...
package com.Java.Arrays;

import java.util.Arrays;

public class P10_reversing_array {
	public static void main(String[] args) {
		int[] arr_revers = { 3, 22, 1, 9, 0 };
		Arrays.sort(arr_revers);
		int leng = arr_revers.length;
		int temp;

		for (int i = 0; i < leng / 2; i++) {
			temp = arr_revers[i];
			arr_revers[i] = arr_revers[leng - i - 1];
			arr_revers[leng - i - 1] = temp;
		}
		System.out.println(Arrays.toString(arr_revers));

	}

}

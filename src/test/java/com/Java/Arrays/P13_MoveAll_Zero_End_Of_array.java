package com.Java.Arrays;

import java.util.Arrays;

public class P13_MoveAll_Zero_End_Of_array {
	public static void main(String[] args) {
		int[] arr1 = { 0, 3, 5, 0, 6, 0, 7, 0 };
		int[] arr2 = new int[arr1.length + 1];

		int leng = arr1.length;
		int j = 0;
		Arrays.sort(arr1);
		for (int i = leng - 1; i >= 0; i--) {
			arr2[i] = arr1[j];
			j++;
		}

		for (int k = 0; k < leng; k++) {
			System.out.print(arr1[k] + ",");

		}
		System.out.println();
		for (int k = 0; k < leng; k++) {
			System.out.print(arr2[k] + ",");

		}
	}

}

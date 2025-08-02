//9: Find the Second Largest Number in an Array.

package com.Java.Arrays;

public class P9_Find2ndLargest_number {
	public static void main(String[] args) {

		// ---------------------------------------- USING INBUILT BMETHODS
		// ---------------------------------------------------------------------
		/*
		 * int[] arr = { 1, 8, 4, 5, 99, 0 }; Arrays.sort(arr);
		 * System.out.println(Arrays.toString(arr)); int leng = arr.length;
		 * System.out.println("The array size is --" + leng);
		 * System.out.println("The 2nd largest numbr is --" + arr[leng - 2]);
		 */

		// ----------------------------------------WITHOUT USING BUILT IN METHOS
		/*
		 * int[] arr1 = { 99, 3, 1, 4 }; int largest = Integer.MIN_VALUE; int
		 * Sencond_Largest = Integer.MIN_VALUE; for (int num : arr1) {
		 * System.out.println("The num ---- " + num); if (num > largest) {
		 * Sencond_Largest = largest; System.out.println("largest --- " + largest);
		 * System.out.println("Num in 1st " + num); largest = num; } else if (num >
		 * Sencond_Largest && num != largest) { System.out.println("Num in 2nd " + num);
		 * System.out.println("largest --- " + largest); Sencond_Largest = num;
		 * 
		 * }
		 * 
		 * } System.out.println("The 2nd largest number = " + Sencond_Largest);
		 */

		// ----------------------------------------another way of doing iT IN METHOS----

		int[] arr1 = { 99, 3, 1, 4 };
		int leng = arr1.length;
		int temp;
		for (int i = 0; i < leng; i++) {
			for (int j = i + 1; j < leng; j++) {

				if (arr1[i] > arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;

				}
			}
		}
		System.out.println(arr1[leng - 2]);
	}

}

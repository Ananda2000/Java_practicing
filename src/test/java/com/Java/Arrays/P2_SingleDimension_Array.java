//Question 2: Accessing Elements of an Array..

package com.Java.Arrays;

public class P2_SingleDimension_Array {

	public static void main(String[] args) {
		int[] arrayElements = { 3, 6, 1, 3, 5 };

		// find the length of the array..
		int leng = arrayElements.length;
		System.out.println("The array length is ---" + leng);
		// ONE WAY USING FOR LOOP.
		for (int i = 0; i < leng; i++) {
			System.out.println(arrayElements[i]);
		}

		// 2ND WAY USING THE COUNT INDEX IN ARRAY..
		System.out.println("1st value --" + arrayElements[0]);
		System.out.println("2nd value --" + arrayElements[1]);
		System.out.println("3rd value --" + arrayElements[2]);
		System.out.println("4th value --" + arrayElements[3]);
		System.out.println("5th value --" + arrayElements[4]);

	}
}

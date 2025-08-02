//6: Multi-dimensional Arrays.. , it is 2 dimentional array.
package com.Java.Arrays;

public class P6_MultiDimensional_array {
	public static void main(String[] args) {

		int[][] multi = { { 1, 2, 3 }, { 5, 6, 7 } };

		// find the array length..
		int arr_leng = multi.length;
		System.out.println("The 2 dimensional array length --" + arr_leng);

		// Here iterating the 2 dimensional array..
		for (int i = 0; i < arr_leng; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j] + " ");
			}
			System.out.println();

		}
	}

}

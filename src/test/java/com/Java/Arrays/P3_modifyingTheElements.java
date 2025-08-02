// 3: Modifying Elements of an Array.
package com.Java.Arrays;

public class P3_modifyingTheElements {

	public static void main(String[] args) {

		char[] ccc = { 'e', 'r', 't' };
		// above change the character e to a..
		int leng = ccc.length;
		// HERE AM CHANGING THE VALUE FROM E TO A...
		ccc[0] = 'a';

		for (int i = 0; i < leng; i++) {
			System.out.println(ccc[i]);
		}

	}
}

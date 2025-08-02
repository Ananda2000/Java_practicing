// programs -- 7: Copying Arrays..
package com.Java.Arrays;

import java.util.Arrays;

public class P7_copyingArrays {

	public static void main(String[] args) {
		char[] orgin_arr = { '2', '6', '9', '1' };

		char[] copy_arr = Arrays.copyOf(orgin_arr, orgin_arr.length);

		System.out.println("The coppied arrays are" + Arrays.toString(copy_arr));

	}
}

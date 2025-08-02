// Find the duplicate elements in an array...

package com.Java.Arrays;

import java.util.ArrayList;
import java.util.List;

public class P11_Find_DuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 6, 3 };
		int leng = arr.length;
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < leng; i++) {
			for (int j = i + 1; j < leng; j++) {
				if (arr[i] == arr[j]) {
					if (!res.contains(arr[i])) {
						res.add(arr[i]);
					}
					break;
				}
			}
		}

		System.out.println("The duplicate elements are ----");
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}

}

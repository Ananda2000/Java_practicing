//15) Write a Java program to find the most frequent element in an array?

package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Int_array15 {

	public static void main(String[] args) {

		Scanner scc = new Scanner(System.in);
		System.out.println("Enter the array size....");
		int arraySize = scc.nextInt();
		int[] array1 = new int[arraySize];

		Scanner scc1 = new Scanner(System.in);
		System.out.println("Enter the arrays --");
		for (int k = 0; k < arraySize; k++) {
			array1[k] = scc1.nextInt();

		}
		Map<Integer, Integer> mpp = new HashMap<Integer, Integer>();

		for (int i = 0; i < arraySize; i++) {
			if (mpp.containsKey(array1[i])) {
				mpp.put(array1[i], mpp.get(array1[i]) + 1);
			} else {
				mpp.put(array1[i], 1);
			}
		}

		System.out.println(mpp);
		int gg = 1;
		for (Map.Entry<Integer, Integer> aa : mpp.entrySet()) {
			System.out.println(aa);

			if (aa.getValue() > gg) {
				gg = aa.getValue();
			}

		}
		for (Map.Entry<Integer, Integer> qq : mpp.entrySet()) {

			if (qq.getValue() == gg) {
				System.out.println("The maximum frequency word is --" + qq.getKey());
			}
		}

	}
}

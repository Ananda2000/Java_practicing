//11) Write a Java program to count occurrences of each element in an array?

package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Int_arrays11 {

	public static void main(String[] args) {
		System.out.println("Testing");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size...");
		int aa = sc.nextInt();

		int[] bb = new int[aa];
		Scanner ele = new Scanner(System.in);
		System.out.println("Enter the elements ---");
		for (int i = 0; i < aa; i++) {
			bb[i] = ele.nextInt();
		}

		System.out.println(bb[1]);
		Map<Integer, Integer> mm = new HashMap<Integer, Integer>();
		for (int j = 0; j < bb.length; j++) {
			if (mm.containsKey(bb[j])) {
				mm.put(bb[j], mm.get(bb[j]) + 1);
			} else {
				mm.put(bb[j], 1);
			}
		}

		for (Map.Entry<Integer, Integer> zz : mm.entrySet()) {
			System.out.print(zz.getKey() + "-");
			System.out.println(zz.getValue());
		}

	}

}

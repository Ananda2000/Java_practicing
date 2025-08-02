//1.Write a Java program to find duplicate elements in an array?
// Using Maps..

package arrays;

import java.util.HashMap;
import java.util.Map;

public class Int_arrays2 {

	public static void main(String[] args) {

		int[] aa = { 10, 7, 10, 3, 5, 7, 8, 9, 7 };
		HashMap<Integer, Integer> ab = new HashMap<Integer, Integer>();
		for (int i = 0; i < aa.length; i++) {
			int gg = 1;
			if (ab.containsKey(aa[i])) {
				ab.put(aa[i], gg + 1);

			} else {
				ab.put(aa[i], gg);

			}
		}
		System.out.println("Below are the duplicate elements --------------");
		for (Map.Entry<Integer, Integer> m : ab.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}

		}
	}
}

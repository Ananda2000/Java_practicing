//Java Program to Find Duplicate Elements in an Array
// without usind maps..
package arrays_Interview;

public class P2_Program {
	public static void main(String[] args) {

		int[] aa = { 2, 1, 5, 8, 2 };
		duplicateElements(aa);
	}

	public static void duplicateElements(int[] gg) {
		int sizz = gg.length;
		System.out.println("The duplicate elements are ---");
		for (int i = 0; i < sizz; i++) {
			for (int j = i + 1; j < sizz; j++) {
				if (gg[i] == gg[j]) {
					System.out.println(gg[j]);
					break;
				}
			}
		}

	}

}

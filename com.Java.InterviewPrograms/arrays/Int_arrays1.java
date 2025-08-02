//1.Write a Java program to find duplicate elements in an array?

package arrays;

public class Int_arrays1 {
	public static void main(String[] args) {

		System.out.println("This is testing ---");

		int[] aa = { 10, 23, 10, 3, 4, 4, 3 };

		int arrayLenght = aa.length;
		for (int i = 0; i < arrayLenght; i++) {
			for (int j = i + 1; j < arrayLenght; j++) {

				if (aa[i] == aa[j]) {
					System.out.println(aa[j]);
				}
			}
		}

	}

}

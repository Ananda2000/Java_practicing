// FIND THE 2ND LARGEST NUMBER IN THE GIVEN ARRAY WITHOUT USING ANY BUILTING METHODS..

package arrays;

public class Int_array2_2 {
	public static void main(String[] args) {
		int[] secondLargest = { 4, 2, 0, 1, 10 };
		int arraylength = secondLargest.length;
		int temp;
		for (int i = 0; i < arraylength; i++) {
			for (int j = i + 1; j < arraylength; j++) {
				if (secondLargest[i] > secondLargest[j]) {
					temp = secondLargest[i];
					secondLargest[i] = secondLargest[j];
					secondLargest[j] = temp;

				}
			}
		}

		System.out.println("----The 2nd largest number is ----");

		System.out.println(secondLargest[arraylength - 2]);

	}

}

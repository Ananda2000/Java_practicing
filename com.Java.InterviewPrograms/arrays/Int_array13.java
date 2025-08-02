//Write a Java program to remove duplicate elements from an array?

package arrays;

import java.util.Scanner;

public class Int_array13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array length ---");
		int aa = sc.nextInt();
		int[] arr1 = new int[aa];
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the array elements ----");
		for (int i = 0; i < aa; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[aa];

		// Below code is to remove duplicate elements..
		for (int i = 0; i < aa; i++) {
			for (int j = i + 1; j < aa; j++) {
				if (arr1[i] != arr1[j]) {
					arr2[i] = arr1[i];
					break;
				}
			}
		}

		for (int k = 0; k < arr2.length; k++) {
			System.out.println(arr2[k]);
		}

	}

}

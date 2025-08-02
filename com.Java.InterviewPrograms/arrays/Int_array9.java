//Write a Java program to find a missing number in an integer array?   

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Int_array9 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the size of the array....");
		int aa = scr.nextInt();
		System.out.print("The number is ---" + aa);

		int[] bb = new int[aa];
		for (int i = 0; i < aa; i++) {
			Scanner sc1 = new Scanner(System.in);
			bb[i] = sc1.nextInt();

		}

		System.out.println("bb =" + bb[0]);
		Arrays.sort(bb);
		/*
		 * THIS IS MY LOGIC BUT IT IS THROWING ERROR.... int kk = bb[0]; for (int i = 0;
		 * i < bb.length; i++) {
		 * 
		 * System.out.println(bb[i + 1]); System.out.println(kk + 1); if (bb[i + 1] !=
		 * kk + 1) {
		 * 
		 * System.out.println("The numbers are not in sequence..."); break;
		 * 
		 * } // kk++;
		 * 
		 * }
		 */
		int sum = (aa + 1) * (aa + 2) / 2;
		for (int i = 0; i < aa; i++) {
			sum = sum - bb[i]; // Subtract each element from the sum
		}
		System.out.println("Missing Element is " + sum);

	}

}

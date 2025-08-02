//13)	Write a Java program to remove duplicate elements from an array? 
// Here we are using the hashset collections..

package arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Int_array13_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size---");
		int gg = sc.nextInt();
		int[] aa = new int[gg];
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for (int i = 0; i < gg; i++) {
			aa[i] = sc1.nextInt();
		}

		Set<Integer> sst = new HashSet<Integer>();
		for (int i = 0; i < gg; i++) {
			sst.add(aa[i]);
		}

		System.out.println(sst);
	}

}

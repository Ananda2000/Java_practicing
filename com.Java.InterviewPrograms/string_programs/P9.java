//How do you convert a string to an integer in Java?

// HERE WE CAN USE 2 BUILD IN METHOS "Integer.parseInt(string) or Integer.valueof(String)"....

package string_programs;

public class P9 {
	public static void main(String[] args) {
		String str = "2";
		String str1 = "4";

		System.out.println("We are multiplaying after converting to integer----");
		System.out.println(Integer.parseInt(str) * Integer.valueOf(str1));
	}

}

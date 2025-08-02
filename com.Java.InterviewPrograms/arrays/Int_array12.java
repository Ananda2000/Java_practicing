//12) Write a Java program to reverse an array without using an additional array?

package arrays;

public class Int_array12 {

	public static void main(String[] args) {
		String stt = "this is string";
		// THERE ARE 2 WAYS TO MAKE THE STRING REVERS
		// BY USING INBUILD REVERSE FUNCTION.
		// BY USING NORMAL LOOPS

		// THIS BY USING REVERSE FUNCTION..
		/*
		 * StringBuilder stb = new StringBuilder(stt);
		 * System.out.println(stb.reverse());
		 */
		// BELOW IS WITHOUT USING BUILTIN FUNCTION...JUST REVERSING THE STRING AND
		// PRINTING.

		int leng = stt.length();
		for (int i = leng - 1; i >= 0; i--) {
			System.out.print(stt.charAt(i));

		}

	}

}

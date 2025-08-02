//Extracting Characters From a Specific Index to the End.
// NOTE -- Here, the 1st index is acceptable and last index is not acceptable..
package string_substring_programs;

public class P1 {
	public static void main(String[] args) {
		String s1 = "This is java string testing";
		// Pring the above string here..
		System.out.println(s1);
		// Now find the substring in the java with starts from 9.

		StringBuffer sb = new StringBuffer(s1.substring(9));
		System.out.println(sb);
		System.out.println("the characters at index --" + sb.charAt(1));
	}

}

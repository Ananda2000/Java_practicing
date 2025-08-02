//How do you check if two strings are equal in Java?

package string_programs;

public class P8 {

	public static void main(String[] args) {
		String str1 = "this is java";
		String str2 = "This is java";
		String str3 = new String();
		str3 = "this is java";

		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
	}

}

//Find and replace in String..
package string_programs;

public class P6 {

	public static void main(String[] args) {

		/*
		 * Scanner scr = new Scanner(System.in);
		 * System.out.println("PLEASE ENTER THE STRING...."); String str =
		 * scr.nextLine();
		 */
		String str = "java this is java";
		System.out.println("------------THE ENTERED STRING IS ------------");
		System.out.println(str);

		// String str1 = str.replaceFirst("java", "goa"); // works , it replace only the
		// 1st word of java into Goa..
		// String str1 = str.replace("java", "goa");
		String str1 = str.replaceAll("java", "goa");
		System.out.println(str1);
	}
}

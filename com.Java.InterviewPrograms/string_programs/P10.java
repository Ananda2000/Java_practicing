//Count Vowels and Consonants in a String..

package string_programs;

public class P10 {

	public static void countdisplay(String stt) {
		String ss = stt;
		int sizee = ss.length();

		char[] gg = ss.toCharArray();
		System.out.println(gg);
		String kk = gg.toString();

		int vowels = 0, consonants = 0;
		for (int i = 0; i < sizee; i++) {
			if ((ss.charAt(i) >= 'A' && ss.charAt(i) <= 'Z') || (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z')) 
			{
				char aa = ss.charAt(i);
				if (aa == 'a' || aa == 'e' || aa == 'i' || aa == 'o' || aa == 'u') 
				{
					vowels++;
				} else 
				{
					consonants++;
				}
			}
		}
		System.out.println("The Vowels count --" + vowels);
		System.out.println("consonants count --" + consonants);
	}

	public static void main(String[] args) {
		String ss = "GeeksforGeeks123";
		countdisplay(ss);

	}

}

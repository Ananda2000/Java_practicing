package interview_Programs;

public class P1_1_Program {
	public static void main(String[] args) {
		String gg = "madam";

		StringBuffer st_bf = new StringBuffer();
		st_bf = st_bf.append(gg);
		System.out.println(st_bf);
		st_bf = st_bf.reverse();
		System.out.println(st_bf);
		String kk = st_bf.toString();
		System.out.println(kk.hashCode());
		System.out.println(gg.hashCode());
		if (kk.equals(gg)) {
			System.out.println("THE STRING IS PALINDROME --");
		} else {
			System.out.println("THE STRING IS NOT PALINDROME...");
		}
	}

}

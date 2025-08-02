package basic_Gc;

public class Nulling_Reference {

	/*
	 * public void finalize() { System.out.println("Called GC ----"); }
	 * 
	 * public static void main(String[] args) { Student s1 = new Student(); Student
	 * s2 = new Student();
	 * 
	 * s1 = null;
	 * 
	 * System.gc(); }
	 */

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1 = null;
		s2 = null;
		System.gc();
	}
}

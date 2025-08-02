package basic_Gc;

public class AssignReference_ToAnother {
	public void finalize() {
		System.out.println("calling GC when assign_reference to another .....");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1 = s3;
		System.gc();

	}

}

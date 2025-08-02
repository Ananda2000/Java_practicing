package comparable;

public class Student implements Comparable<Student>

{
	int rollnum;
	String name;
	int age;

	public Student(int age, String name, int rollnum) {
		this.rollnum = rollnum;
		this.name = name;
		this.age = age;
	}

	/*
	 * public int getAge() { return this.age; }
	 * 
	 * public String getName() { return this.name; }
	 * 
	 * public int getRollnum() { return this.rollnum; }
	 */

	@Override
	public String toString() {
		return this.age + "--" + this.name + "--" + this.rollnum;
	}

	public int compareTo(Student std) {
		// TODO Auto-generated method stub

		if (this.age > std.age)
		{
			System.out.println(this.age+" ------------ ");
		System.out.println(std.age+" ----------------- ");
		System.out.println(" Returning  -------------1");

			return 1;
		}
		else if (this.age < std.age)
		{
			System.out.println(this.age+" ------------ ");
		System.out.println(std.age+" ----------------- ");
		System.out.println(" Returning  -------------..-1");
			return -1;
		}
		else
			return 0;
		//int gg =this.name.compareTo(std.name);
		/*System.out.println("this.age---"+this.age);
		System.out.println("std.age----"+std.age);
		int gg = this.age - std.age;
		System.out.println("-----------------------------------"+gg);
		return gg;
*/
	}

}

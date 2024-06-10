package arrays;

public class Array_of_Objects 
{
	public static void main(String [] args)
	{
		Student s1 = new Student(1, "name1");
		Student s2 = new Student(3, "string3");
		
		Student [] aa = new Student[2];
		aa[0] =s1;
		aa[1] = s2;
		
		for (Student object : aa) {
			System.out.println(object.getName());
		}
	}

}

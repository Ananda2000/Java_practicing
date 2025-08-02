package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student_MainClass 
{
	public static void main(String [] args)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(2, "Ananda", 99));
		al.add(new Student(15, "kumar", 22));
		al.add(new Student(5, "ganesh", 66));
	
		System.out.println("This is size "+al.size());
		
		System.out.println("This is before sorting...");
		
		System.out.println(al.toString());
		Collections.sort(al);
		System.out.println("This is after sorting by age ---");

		int sizze = al.size();
		System.out.println(sizze);
		
		System.out.println(al.toString());
		
		
		
		/*System.out.println("This is after collection...");
		for (Student student : al) 
		{
			System.out.println(student.getAge());
		}*/
	}

}

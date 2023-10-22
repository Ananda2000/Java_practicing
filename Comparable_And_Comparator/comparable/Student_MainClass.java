package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student_MainClass 
{
	public static void main(String [] args)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(15, "Ananda", 99));
		al.add(new Student(23, "kumar", 22));
		al.add(new Student(5, "ganesh", 66));
	
		System.out.println(al.size());
		
		System.out.println("This is before sorting...");
		for (Student student : al) 
		{
			System.out.println(student.getAge());
		}
		
		Collections.sort(al);
		
		System.out.println("This is after collection...");
		for (Student student : al) 
		{
			System.out.println(student.getAge());
		}
	}

}

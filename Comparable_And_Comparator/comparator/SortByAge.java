package comparator;

import java.util.Comparator;

import basic_Java_Programs.CompareToObjects;

public class SortByAge implements Comparator<Student_pojo>
{

	public int compare(Student_pojo a, Student_pojo b) {
		// TODO Auto-generated method stub
		System.out.println("a >> "+a.age);
		System.out.println("b >> "+b.age);
		int numb = b.age -a.age;
		System.out.println("numb >>"+numb);
		return numb;
	}
	

}

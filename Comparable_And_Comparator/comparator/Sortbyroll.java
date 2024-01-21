package comparator;

import java.util.Comparator;

import comparable.Student;

public class Sortbyroll implements Comparator<Student_pojo> {

	public int compare(Student_pojo a, Student_pojo b) {
		// TODO Auto-generated method stub
		//return (a.rollno.compareTo(b.rollno));
		return (a.rollno.compareTo(b.rollno));
		
	}

}

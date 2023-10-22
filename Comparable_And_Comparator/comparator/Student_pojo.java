package comparator;

public class Student_pojo
{

	int age;
	String name;
	String rollno;
	
	public Student_pojo (int age, String name, String string)
	{
		this.age =age;
		this.name= name;
		this.rollno = string;
		
	}
	
	
	// This method prints the student 
	public String toString()
	{
		return this.age +"-"+this.name +"-" + this.rollno;
	}
}

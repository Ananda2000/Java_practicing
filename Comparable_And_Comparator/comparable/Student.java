package comparable;

public class Student implements Comparable<Student>

{
	int rollnum;
	String name;
	int age;
	
	public Student(int age, String name, int rollnum)
	{
		this.rollnum = rollnum;
		this.name = name;
		this.age =age;
	}

	
	/*public int getAge()
	{
		return this.age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getRollnum()
	{
		return this.rollnum;
	}*/
	
	@Override
	public String toString()
	{
		return this.age +"--"+ this.name +"--"+ this.rollnum;
	}
	
	public int compareTo(Student std) {
		// TODO Auto-generated method stub
		
		if(age > std.age)
		return 1;
		else if (age <std.age) 
			return -1;
		else 
			return 0;
		
		
	}
	
	
	
	
	
	

}

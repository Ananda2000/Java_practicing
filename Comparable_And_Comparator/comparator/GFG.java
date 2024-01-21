package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class GFG 
{
	public static void main(String [] args)
	{
		ArrayList<Student_pojo> arr = new ArrayList<Student_pojo>();
		
		arr.add(new Student_pojo(5, "name5", "rollno3"));
		arr.add(new Student_pojo(33, "name3", "rollno2"));
		arr.add(new Student_pojo(1, "name2", "rollno1"));
		
		// Display message on console for better readability...
		System.out.println("Unsorted ----");
		
		// Iterating over entries to print them...
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
		//Collections.sort(arr, new Sortbyroll());
		Collections.sort(arr, new SortByAge());
		System.out.println(arr);
		
		
	}

}

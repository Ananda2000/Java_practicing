package testing_interview;

import java.util.Arrays;

public class Testing_aaa 
{
	public static void main(String [] args)
	{
		//String [] aaa = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  ;
		int [] aaa = {0,1,2,0,1,2};
		System.out.println("-----------BEFORE SORTING -------------");
		for (Integer string : aaa) {
			System.out.println(string);
		}
		
		Arrays.sort(aaa);
		System.out.println("-----------AFTER SORTING -------------");
		for (Integer string1 : aaa) 
		{
			System.out.println(string1);
			
		}
		
		
	}

}

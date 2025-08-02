package number_programs;

import java.util.Scanner;

public class Reverse_GivenNumber 
{
	public static int reversed_number(int number)
	{
		int numb = number;
		
		int reversed = 0;
		while (numb!=0)
		{
			int reminder =  numb % 10;
			reversed = reversed *10 +reminder;
			numb /=10; 
		}
		
		System.out.println("The reversed number ---");
		return reversed;
	}
	
	
	
	
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("PLEASE ENTER THE NUMBER---");
		int num =scn.nextInt();
		
		System.out.println(reversed_number(num));
		
		
	}

}

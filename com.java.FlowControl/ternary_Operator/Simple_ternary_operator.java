package ternary_Operator;

import java.util.Scanner;

public class Simple_ternary_operator 
{
	public static void main(String [] args)
	{
		System.out.println("This is testing...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ---");
		int a=scan.nextInt();
		
		
		
		String result = (a>0) ? "positive" : "-ve number"; 
		System.out.println(a +" is "+result +" Number");
	}

}

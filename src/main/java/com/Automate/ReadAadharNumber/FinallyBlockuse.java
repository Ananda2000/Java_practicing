package com.Automate.ReadAadharNumber;

public class FinallyBlockuse 
{
	public static void main(String [] args)
	{
		System.out.println("This is testing...");
		try {
		int a = 6/0;
		System.out.println("inside try block...");
		}
		
		finally {
			System.out.println("this is finally block..");
		}
	}

}

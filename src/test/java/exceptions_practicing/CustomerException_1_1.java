package exceptions_practicing;

import java.util.Scanner;

public class CustomerException_1_1 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the age -");
		int a = sc.nextInt();
	
		if(a>60) 
		{
		
			throw new CustomeException_1("Too young exception, still you can wait u will get better matches..");
		}
		
		
		/*catch (CustomeException_1 ex) {
			System.out.println("Caught");
			//System.out.println(ex.getMessage());
			System.out.println(ex);
		//ex.printStackTrace();
			
		}
		*/
		if(a<18)
		{
			throw new TooOldException("Too old exeption, Still you have time....");
		}
	}
		

	}

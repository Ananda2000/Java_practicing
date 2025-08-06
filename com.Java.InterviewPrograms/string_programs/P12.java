//Write a Java Program to remove all white spaces from a string with using replace().

package string_programs;

public class P12 
{
	public static void main(String [] args)
	{
		String str ="This is java   program testinhg.";
		
	String str2=str.replaceAll("\\s", "");
	System.out.println(str2);
		
	}

}

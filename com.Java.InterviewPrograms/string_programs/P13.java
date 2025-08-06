//Write a Java Program to remove all white spaces from a string without using replace().

package string_programs;

public class P13 
{
	
	public static String removeWhiteSpaces(String words)
	{
		int leng= words.length();
		String str2="";
		char [] aa = words.toCharArray();
		for (int i = 0; i < leng; i++) 
		{
			while((aa[i]!=' ') || (aa[i]!='\t'))
			{
				str2=str2+aa[i];
			}
			System.out.println("This is testing");
		}
		
		return str2;
		
	}
	
	
	
	public static void main(String [] args)
	{
		String str ="remove white spaces without using replace method";
		String removed =removeWhiteSpaces(str);
		System.out.println("The removed string is ");
		System.out.println(removed);
	}

}

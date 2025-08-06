//Write a Java Program to remove all white spaces from a string without using replace().

package string_programs;

public class P13 
{
	
	public static String removeWhiteSpaces(String words)
	{
		System.out.println("testing -1");
		int leng= words.length();
		String str2="";
		char [] aa = words.toCharArray();
		for (int i = 0; i < leng; i++) 
		{
			System.out.println("testing -2");
	
			while(aa[i]!=' ' && aa[i]!='\t' )
			{
				System.out.println("testing -3");
				str2=str2+aa[i];
				System.out.println("testing -4");
				if(i==leng)
				{
					break;
				}
				i++;
			}
			System.out.println("testing -5");
		}
		
		return str2;
		
	}
	
	
	
	public static void main(String [] args)
	{
		String str ="re m o   ve whi		te ";
		System.out.println("testing");
		String removed =removeWhiteSpaces(str);
		System.out.println("The removed string is ");
		System.out.println(removed);
	}

}

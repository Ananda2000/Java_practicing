package arrays;

public class Passing_arrayIntoMethod
{
	public static void main(String[] args)
	{
		String [] str = {"anand","gggg","kkk"};
		
		method1(str);
	}
	
	public static void method1(String [] gg)
	{
		String[] aaa = gg;
		for (String string : aaa) {
			System.out.println(string);
		}
	}

}

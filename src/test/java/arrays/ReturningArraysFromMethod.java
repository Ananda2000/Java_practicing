package arrays;

public class ReturningArraysFromMethod 
{
	public static void main(String [] args)
	{
		String [] zzz;
		zzz = return_array();
		
		System.out.println(zzz);
		for (String string : zzz) 
		{
			System.out.println(string);
			
		}
	}
	
	public static String [] return_array()
	{
		String [] kkk = {"qqqq","gggg","bbbb"};
		return kkk;
	}

}

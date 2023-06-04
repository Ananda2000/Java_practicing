package exceptions_practicing;

public class TryBlock_withoutCatch_Block 
{
	public static void main(String[] args)
	{
		try {
			//System.out.println("this is anand");
			int s = 0/2;
		} 
		
		finally {
			System.out.println("this is finally blcok");
		}
	}

}

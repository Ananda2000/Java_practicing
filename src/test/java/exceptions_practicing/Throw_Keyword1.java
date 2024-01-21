package exceptions_practicing;

public class Throw_Keyword1 
{
	public void throwkeword1( int i)
	{
		if(i<18)
		{
			throw new ArithmeticException("This is my throw exception");
			
		}
		else
		{
			System.out.println("You are eligible to vote ......");
		}
	}

}

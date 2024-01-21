package exceptions_practicing;

import java.io.File;
import java.io.FileNotFoundException;

public class Throws_keyword1 
{
	public void throws_keywordException()throws ArithmeticException
	{
		int i=10;
		int j=0;
		int res = i/j;
		
		System.out.println(res);
	
	}

}

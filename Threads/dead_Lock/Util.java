package dead_Lock;

public class Util
{
	// Util class to sleep a thread
	static void sleep(long millis)
	{
		
		try
		{
			System.out.println("===== IN UTIL PACKAGE -- SLEEP METHOD ---");
			Thread.sleep(millis);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}

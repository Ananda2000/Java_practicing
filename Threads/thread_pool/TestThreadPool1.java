// Here we are using newcachethreadpool....

package thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool1 
{
	public static void main(String [] args)
	{
		ExecutorService exser = Executors.newCachedThreadPool();
		
		for(int i=0;i<10;i++)
		{
			Runnable rrr = new WorkThread1(""+i);
			exser.execute(rrr);
		}
		
		
	}
	

}

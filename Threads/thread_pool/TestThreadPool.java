package thread_pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool 
{
	public static void main(String [] args)
	{
		
		ExecutorService exserci = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<10;i++)
		{
			Runnable rr = new workThread("-"+i);
			exserci.execute(rr);
		}
		exserci.shutdown();
	}

}

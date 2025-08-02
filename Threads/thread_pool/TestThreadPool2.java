package thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool2 
{
	public static void main(String[] args)
	{
		ExecutorService exerr2 = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<5;i++)
		{
			Runnable rr = new workThread2(""+i);
			exerr2.execute(rr);
		}
	}

}

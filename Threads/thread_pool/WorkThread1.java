package thread_pool;

public class WorkThread1 implements Runnable
{
	private String message;
	
	public  WorkThread1(String message)
	{
		this.message = message;
	}
	

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
		
		
	}

	
	public void processmessage()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

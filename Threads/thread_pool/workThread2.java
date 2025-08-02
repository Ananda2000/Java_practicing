package thread_pool;

public class workThread2 implements Runnable
{
	private String message;
	
	public workThread2(String message)
	{
		this.message = message;
	}

	public void run() {
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

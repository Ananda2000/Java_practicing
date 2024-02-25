package thread_pool;

public class workThread implements Runnable
{

	private String message ;
	
	
	
	public workThread(String message) {
		//super();
		this.message = message;
	}



	public void run() 
	{
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

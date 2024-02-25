package m_t_Cooperation;

public class Consumer implements Runnable
{

	Q q;
	public Consumer(Q q) {
		//super();
		System.out.println("======CONSUMER CONSTRUCTOR.... ===========================");
		
		this.q = q;
		Thread th1 = new Thread(this,"consumer");
		th1.start();
	}
	public void run() 
	{
		while(true)
	{
			System.out.println("======IN CONSUMER RUN METHOD ===========================");
		q.get();
		try {
			System.out.println(" #################### BEFORE SLEEP IN CONSUMER METHOD ###############################3");
			Thread.sleep(1000);
			System.out.println(" #################### AFTER SLEEP IN CONSUMER METHOD ###############################3");
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}

	

}

package m_t_Cooperation;

public class Producer implements Runnable
{
	Q q;
	
	public Producer(Q q)
	{
		System.out.println("======PRODUCER CONSTRUCTOR.... ===========================");
		//super();
		this.q = q;
		Thread th = new Thread(this,"producer");
		th.start();
	}



	public void run() 
	{
		
		int i=0;
		while (true)
		{
			System.out.println("======IN PRODUCER RUN METHOD ===========================");
		q.put(i++);
		try {
			System.out.println(" #################### BEFORE SLEEP IN PRODUCER METHOD ###############################3");
			Thread.sleep(2000);
			System.out.println(" #################### AFTER SLEEP IN PRODUCER METHOD ###############################3");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
}

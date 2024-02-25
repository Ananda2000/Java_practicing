package m_t_Cooperation;

public class Q
{
	int num;
	boolean valueset = false;
	public synchronized void put(int num)
	{
		while(valueset)
		{
			try {
				System.out.println("------------------------------------------ BF wait in put----------------------");
				wait();
				System.out.println("------------------------------------------- AF wait in put----------------------");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("put :-"+ num);
		System.out.println(" OFSET -values -----------PUT- "+valueset);
				valueset = true;
		System.out.println(" OFSET -values -----------PUT- "+valueset);
					
		System.out.println("---- BF NOTIFY in put");
		notify();
		System.out.println("---- AF NOTIFY in put");

	}
	
	
	public synchronized void get()
	{
		while(!valueset)
		{
			try 
			{
				System.out.println("-----------------------------------------------------BF wait in get -----------------------------");
				wait();
				System.out.println("------------------------------------------------------AF wait in get -----------------------------");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get ;-"+num);
		System.out.println(" OFSET -values -----------GET- "+valueset);
		
		valueset =false;
		System.out.println(" OFSET -values -----------GET- "+valueset);
		
		System.out.println("BF NOTIFY in get -----------------------------");
		
		notify();
		System.out.println("AF NOTIFY in get -----------------------------");
		
	}

}

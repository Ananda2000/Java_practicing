

package synchronization_Static;

public class Sync_static implements Runnable
{
	

	public void run() 
	{
		//System.out.println("Start of run method ---");
		Calculations.multiply();
		//System.out.println("end of run method ---");
	}
	
	public static void main(String [] args)
	{
		
		Sync_static st1 = new Sync_static();
		Sync_static st2 = new Sync_static();

		Thread th1 = new Thread(st1);
		Thread th2 = new Thread(st2);
		
		th1.start();
		th2.start();
	}

}

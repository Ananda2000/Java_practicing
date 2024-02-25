package daemon_Thread;

public class Daemon_Thread  extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
				{
			System.out.println("This is Daemon Thread");
				}
		else
		{
			System.out.println("This is user thread....");
		}
	}
	
	
	public static void main(String [] args)
	{
		Daemon_Thread th1 = new Daemon_Thread();
		Daemon_Thread th2 = new Daemon_Thread();
		
		Daemon_Thread th3 = new Daemon_Thread();
		
		th3.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
	}

}

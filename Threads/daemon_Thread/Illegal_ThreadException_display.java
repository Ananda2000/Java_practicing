// If we try generated ILLEGALTHREADSTATE-EXCEPTION message...

package daemon_Thread;

public class Illegal_ThreadException_display implements Runnable
{

	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("This is daemon Thread...");
		}  
		else
		{
			System.out.println("User thread is running...");
		}
	}
	
	public static void main(String [] args)
	{
		Illegal_ThreadException_display th1 = new Illegal_ThreadException_display();
		Illegal_ThreadException_display th2 = new Illegal_ThreadException_display();
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t1.setDaemon(true);
		t2.start();
	
	}
	

}

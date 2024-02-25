package interrupting;

public class Interrupt_1 implements Runnable
{

	
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("["+Thread.currentThread().getName()+"] message"+i);
			
			boolean aa = Thread.interrupted();
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaa"+aa);
			if(aa)
			{
				System.out.println("bbbbbbbbbbbbbbbbbbbbbbbb"+aa);
				
				System.out.println("This thread was interrupted by someone calling this thread. interrupted");
				System.out.println("CANCELLING THE TASK RUNNING IN THREAD --"+ Thread.currentThread().getName());
				System.out.println("After thread.Interrupted() call, Jvm reset the interrupt value to -"+Thread.interrupted());
				break;
			}
		}
		
	}

}

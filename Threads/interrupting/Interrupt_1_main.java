package interrupting;

public class Interrupt_1_main 
{
	public static void main(String [] args) throws InterruptedException
	{
		Interrupt_1 th1 = new Interrupt_1();
		Thread t1 = new Thread(th1);
		t1.start();
		
		System.out.println("Is thread interrupted ---"+t1.isInterrupted());

		t1.interrupt();
		System.out.println("Is thread interrupted aa ---"+t1.isInterrupted());
	}

}

package priority_of_Threads;

public class Priority1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
		
		for(int i=0;i<100;i++) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("count ---"+i);
		}
		
		
	}
	
	
	public static void main(String [] args) throws InterruptedException
	{
		Priority1 p1 = new Priority1();
		Priority1 p2 = new Priority1();
		
		
		p1.start();
		//p2.sleep(100);

		p2.setPriority(10);
		
		p2.start();

		
			}

}

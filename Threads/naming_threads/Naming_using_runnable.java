package naming_threads;

public class Naming_using_runnable implements Runnable
{

	


	public void run() {
		System.out.println("running ,,,,");
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
	public static void main(String [] args)
	{
		
		
		Naming_using_runnable t1 = new Naming_using_runnable();
		Naming_using_runnable t2 = new Naming_using_runnable();
		
		
		Thread th = new  Thread(t1);
		Thread th1 = new Thread(t2);
		
		
		System.out.println(th.getName());
		System.out.println(th1.getName());
		
		th.setName("This is ananda");
		
		System.out.println("After setting the name ---"+th.getName());
		
		th.start();
		th1.start();
	}

}

package naming_threads;

public class NamingSetterMethod  extends Thread
{
	public void run()
	{
		System.out.println("this is running ....");
	}
	public static void main(String [] args)
	{
		NamingSetterMethod t1 = new NamingSetterMethod();
		NamingSetterMethod t2 = new NamingSetterMethod();
		
		System.out.println("Name of thread ---"+t1.getName());
		System.out.println("Name of thread ---"+t2.getName());
		
		t1.setName("Anand Thread");
		
		System.out.println("Thread name after changing ---"+t1.getName());
		
		
		t1.start();
		t2.start();
	}

}

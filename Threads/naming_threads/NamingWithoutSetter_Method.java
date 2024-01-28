package naming_threads;

public class NamingWithoutSetter_Method extends Thread
{
	NamingWithoutSetter_Method(String threadname)
	{
		super(threadname);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String [] args)
	{
		NamingWithoutSetter_Method th1 = new NamingWithoutSetter_Method("thread0001");
		NamingWithoutSetter_Method th2 = new NamingWithoutSetter_Method("22222");
		
		th1.start();
		th2.start();
	}

}

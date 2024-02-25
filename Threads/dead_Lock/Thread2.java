package dead_Lock;

public class Thread2 extends Thread
{

	private Shared s1;
	private Shared s2;

	// constructor to initialize fields
	public Thread2(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}

	// run method to start a thread
	@Override
	public void run()
	{
		// taking object lock of s2
		// enters into test2 method
		System.out.println("==== THIS IS THREAD 2 CLASSS");
		s2.test1(s1);
	}
}

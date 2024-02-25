package dead_Lock;

public class Deadlock 
{
	public static void main(String[] args)
	{
		// creating one object
		Shared s1 = new Shared();

		// creating second object
		Shared s2 = new Shared();

		// creating first thread and starting it
		Thread1 t1 = new Thread1(s1, s2);
		t1.start();
		//Util.sleep(100);
		// creating second thread and starting it
		Thread2 t2 = new Thread2(s1, s2);
		t2.start();

		// sleeping main thread
		System.out.println("++++++++++++ --sleeping main thread");
		Util.sleep(2000);
	}

}

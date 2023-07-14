package starting_ThreadTwice;

public class STart_oneThreadTwice extends Thread
{
	public void run()
	{
		System.out.println("runnig");
	}

	public static void main(String [] args)
	{
		
		STart_oneThreadTwice t1 = new STart_oneThreadTwice();
		t1.start();
		t1.start();
	}

}

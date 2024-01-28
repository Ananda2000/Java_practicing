// THIS PROGRAM WE REPRODUCING THE ILLEGALARGUMENT-EXCEPTION...

package priority_of_Threads;

public class Illegal_argumentException_reproduce implements Runnable
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	
	public static void main(String [] args)
	{
		Illegal_argumentException_reproduce th1 = new Illegal_argumentException_reproduce();
		Thread t1 = new Thread(th1);
		
		System.out.println(t1.getName());
		t1.setName("anand--00");
		
		// HWERE PRIORITY EXPECTING THE ARGUMENT BETWEEN 1-10 ,, WE ARE PASSING 67..
		// hENCE IT WILL THROW "ILLEGAL ARGUMENT EXCEPTION....
		
		t1.setPriority(67);
		t1.start();
		
		
		
	}

}

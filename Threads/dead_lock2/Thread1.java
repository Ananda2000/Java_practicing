package dead_lock2;

public class Thread1 extends Thread
{
	X obj1, obj2;
	 Thread1(X obj1, X obj2)
	 {
	   this.obj1 = obj1;
	   this.obj2 = obj2;
	 }
	public void run()
	{
		
		synchronized(obj1)
	 {
	  try {
		  System.out.println("T0 - sleeping----"+Thread.currentThread().getName());
		Thread.sleep(1000);  
		System.out.println("T0 --- is wakeup");
	  }
	catch(InterruptedException ie) {
	 System.out.println(ie);	
	}
	  
	  System.out.println("Thread0 -- before display2 of obj2 ----------------------");
	  
	obj2.display2(obj2);  
	 }
	}

}

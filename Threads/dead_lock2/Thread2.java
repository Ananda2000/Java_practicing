package dead_lock2;

public class Thread2 extends Thread
{

	X obj1, obj2;
	  Thread2(X obj1, X obj2)
	  {
	    this.obj1 = obj1;
	    this.obj2 = obj2;
	  }
	  public void run()
	  {
	    synchronized(obj2)
	    {
	    try {
	    	System.out.println("T1 - sleeping---"+Thread.currentThread().getName());
	       Thread.sleep(1000);  
	       System.out.println("T1 wakeup ------------");
	       
	    }
	   catch(InterruptedException ie) {
	        System.out.println(ie);	
	   }
	    System.out.println("Thread1 -- before display1 of obj1 ----------------------");
		
	    
	   obj1.display1(obj1);
	  }
	  }
}


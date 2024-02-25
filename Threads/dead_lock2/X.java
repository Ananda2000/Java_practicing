package dead_lock2;

public class X 
{
	void display1(X obj2)
	{
		System.out.println("DISPLAY-1 ------"+Thread.currentThread().getName());
	 System.out.println("Thread1 waiting for thread2 to release lock");
	 synchronized(obj2) 
	 {
	  System.out.println("Deadlock occurred"); 
	 }
	 System.out.println("++++++++++++ end of display 1");
	 }
	void display2(X obj1)
	{
		System.out.println("DISPAY--2------- --"+Thread.currentThread().getName());
	 System.out.println("Thread2 waiting for thread1 to release lock");
	 
	 synchronized(obj1){
	   System.out.println("Deadlock occurred"); 
	  }
	 
	 System.out.println("++++++++++++ end of display 2");

	 } 

}

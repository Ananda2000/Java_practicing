// 1st try here by removing the "synchronized" keyword for multiply method..
// --- OBSERVE THE OUTPUT... THE THREADS ARE SHUFFLING..

// 2ND Add the "SYNCHRONIZED" keyword for multiply method...
// --- OBSERVE THE OUTPUT --- THREAD NAME WILL COME SEQUEANCIAL AFTER COMPLETING 1 THREAD , OTHER THREAD WILL 
// START EXECUTING...

package synchronization_Static;

public class Calculations 
{
	public static int number=4;
	
	public  synchronized static void multiply()
	{
		//System.out.println("start of multiply method");
		for(int i=1;i<15;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+"--"+i);
			//System.out.println("inside for loops...");
		}
	}

}

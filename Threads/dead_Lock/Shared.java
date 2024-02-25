package dead_Lock;

public class Shared 
{
	// first synchronized method
		synchronized void test1(Shared S2)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("test1-begin");
			Util.sleep(1000);

			// taking object lock of s2 enters
			// into test2 method
			System.out.println("CALLING TEST2 METHOD ---");
			S2.test2();
			System.out.println("test1-end");
		}

		// second synchronized method
		synchronized void test2()
		{
			System.out.println("test2-begin");
			System.out.println("this --"+Thread.currentThread().getName());
			Util.sleep(1000);
			// taking object lock of s1 enters
			// into test1 method
			System.out.println("test2-end");
		}

}

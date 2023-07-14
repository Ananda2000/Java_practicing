package sleeping;

public class Thread1_oneparameter extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println("i ="+i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		Thread1_oneparameter one1 = new Thread1_oneparameter();
		Thread1_oneparameter two2 = new Thread1_oneparameter();
		one1.setName("one");
		two2.setName("two");
		one1.start();
		two2.start();
	}

}

package calling_runMethodDirectly;

public class Running_withMainMethod  extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String [] args)
	{
		Running_withMainMethod t1 = new Running_withMainMethod();
		Running_withMainMethod t2 = new Running_withMainMethod();
		t1.run();
		t2.run();
	}

}

// HERE WE ARE CREATING THE ANNONYMOUS INNER CLASS WITH EXMAPLE OF CLASS..


package anonymous_InnerClass;

public class Anons_Inner_1Class 
{
	public void display1()
	{
		System.out.println("This is display1 method...");
	}
	
	public static void main(String [] args)
	{
		Anons_Inner_1Class aa = new Anons_Inner_1Class()
				{
					public void display1()
					{
						System.out.println(" --- 111111 this is inside inner class");
					}
				};
				aa.display1();
		
	}

}

package anonymous_InnerClass;

public abstract class Abstract_method_Anonymous 
{
	public abstract void display();
	
	
	public static void main(String [] args)
	{
		Abstract_method_Anonymous aaa = new Abstract_method_Anonymous()
			{
				public void display()
				{
					System.out.println("--- declaration of abstract method ----");
				}
			};
		aaa.display();
	}

}

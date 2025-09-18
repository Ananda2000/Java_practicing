// we are passing parameters and returning the values in lambda expressions..

package returnValue_with_parameters;

public class Return_value_Implementaion 
{
	public static void main(String [] args)
	{
		Defining_functionDeclaration defin_declarion;
		defin_declarion =(kk) -> {
			String gg =" this is anand ";
			kk = kk+gg;
			return kk;
			
		};
		String aftredisplay = defin_declarion.display("Hello ");
		System.out.println(aftredisplay);
	}

}

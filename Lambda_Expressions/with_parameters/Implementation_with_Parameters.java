package with_parameters;

public class Implementation_with_Parameters 
{
	public static void main(String [] args)
	{
		InterFace_declaration int_Fc_decl = (int g)-> {
			System.out.println("This is values --- "+g);
			
		};
		
		int_Fc_decl.display(5);
	}

	
}

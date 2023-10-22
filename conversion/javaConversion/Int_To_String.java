package javaConversion;

public class Int_To_String
{
	public static void main(String [] args)
	{
		String str1 ="200";
	// HERE WE ARE CONVERTING THE STRING TO INTEGER
		int conver= Integer.parseInt(str1);
		int aa =200;
		int bb =200;
	// HERE WE ARE CONVERTING THE INTEGER TO STRING.
		String valueofmethod = String.valueOf(bb);
		System.out.println(aa+conver);
		System.out.println(aa+valueofmethod);
	// CNA WE CONVERT DOUBLE TO STRING...
		double dd= 888.99;
		System.out.println("The double vlaue is --"+dd);
	// converting double to string
		String strdouble = String.valueOf(dd);
		System.out.println("Double value after converting string -- Displaying -"+strdouble);
		
		
		
	}
	

}

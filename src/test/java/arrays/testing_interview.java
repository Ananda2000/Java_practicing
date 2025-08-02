package arrays;

public class testing_interview 
{
	public static void main(String [] args)
	{
		String str ="Iama23Cign45itian";
		StringBuffer strb = new StringBuffer();
		StringBuffer strb1 = new StringBuffer();
		char [] aa = str.toCharArray();
		int leng= str.length();
		for(int i=leng-1;i>=0;i--)
		{
		/*	if((Character.isAlphabetic(str.charAt(i))==true))
			{*/
				strb =strb.append(aa[i]);
			//}
				//System.out.println(strb);	
		}
		System.out.println(strb);
		for(int j=0;j<leng;j++)
		{
			if(Character.isDigit(str.charAt(j)))
			{
				strb1 = strb1.append(aa[j]);
				System.out.println(strb1);
			}
			if(Character.isAlphabetic(str.charAt(j)))
			{
				strb1 = strb1.append(strb.charAt(j));
				System.out.println(strb1);
			}
		}
	
		
		System.out.println(strb1);
		
		
	}

}

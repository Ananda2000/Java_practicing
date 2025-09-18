//remove leading and trailing zeros from a numeric string
 
//input = "000001204530909000000"
//output = "1204530909"


package myInterviews;

public class RemoveLeadingTrailingZeros
{
	public static void main(String [] args)
	{
		String str ="000001204530909000000";
		
		StringBuffer strb = new StringBuffer();
		strb.append(str);
		System.out.println(strb);
		
		for(int i=0;i<strb.length();i++)
		{
			System.out.println("Inside 1st for Loop");
			if(strb.length()>0 && strb.charAt(i)=='0')
			{
				strb.deleteCharAt(i);
				//System.out.println(strb);
				
			}
			if(strb.charAt(i)!='0')
			{
				break;
			}
			
		}
		//strb.append(strb);
		//for(int j=strb.length(); j>=0;j--)
		while(strb.charAt(strb.length()-1)=='0')
		{
			int j=strb.length()-1;
			System.out.println("2nd for loop---");
			if(strb.charAt(strb.length()-1)=='0')
			{
				strb.deleteCharAt(j);
				//System.out.println(strb);
				
			}
			if(strb.charAt(strb.length()-1)!='0')
			{
				break;
			}
			
		}
		//strb.append(strb);
		System.out.println("THE FINAL RESULT IS AFTER REMOVING LEADING AND TRAILLING SPACES..---");
		System.out.println(strb);
		
	}

}

//1.	String str="asd123 dgw35df wi13gdf9";
//o/p : 123+35+13+9=180



package interview_Programs;

public class My_SIP_1 {
	
	public static int add(String stt)
	{
		String zzzz="";
		String aa = stt;
		int sum =0;
		boolean booleanValue=false;
		for(int i=0;i<aa.length();i++)
		{
			char lll = aa.charAt(i);
			if(Character.isDigit(lll))
			{
				zzzz += lll;
				System.out.println("+++++++++++ --"+zzzz);
				
			}
			else {
				if(!zzzz.isEmpty())
				{
					sum +=Integer.parseInt(zzzz);
					zzzz="";
				}
			}
		}
		return sum;
		
	}
	
	public static void main(String []args)
	{
		//String gg ="asd123 dgw35df wi13gdf9";
		String gg ="asd1 d35oo9";
		int yyyy=add(gg);
		System.out.println("------SUM is ---"+yyyy);
	}

}

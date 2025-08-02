package practicing_differentScenarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArraylist 
{
	
	Pojo_Register pp ;
	
	List<Pojo_Register> lpp = new ArrayList<Pojo_Register>();
	public void readRegister()
	{
	
		for(int i=0;i<5;i++)
			{
			pp= new Pojo_Register();
				pp.setFirstName("anand_"+i);
				pp.setId("1-"+i);
				pp.setPassword("pw_"+i);
				lpp.add(pp);
				System.out.println("this is prinintg"+i);
			}
		}
	
	public void Add_arralistInto_obj()
	{
		
		int sizess= lpp.size();
		System.out.println("The arraylist size is --"+sizess);
		for(int i=0;i<sizess;i++)
		{
			System.out.println(lpp.get(i).getFirstName());
			System.out.println(lpp.get(i).getId());
			System.out.println(lpp.get(i).getPassword());
		}
	}
	
	public void addArralistToobject()
	{
		int sss= lpp.size();
		for(int i=0;i<sss;i++)
		{
			System.out.println("aaaa");
		Object [] aa = { lpp.get(i).getFirstName(),lpp.get(i).getId(),lpp.get(i).getPassword()};
		
		//System.out.println(aa.toString());
		
		//Arrays.stream(aa).forEach(System.out::println);
		for (Object object : aa)
		{
			
			
		}
		}
		
	}

}

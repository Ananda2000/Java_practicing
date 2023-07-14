// THIS CLASS WE CREATE A SIMPLE JDBC SELECT QUERY...


package simpleJdbc_Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Parser;
import com.mysql.cj.protocol.x.ResultMessageListener;
//mport com.mysql.cj.xdevapi.Statement;

import pojoClass_for_JDBC.JDBC_simple1_pojo;

public class JDBC_Simple1
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","@n@ndA@321");
		Statement sttment = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rst = sttment.executeQuery("select * from city");
		System.out.println("---------------------------------------------============");
		System.out.println("---------------------------------------------============");
		System.out.println("---------------------------------------------============");

		
		JDBC_simple1_pojo pojoclasss= new JDBC_simple1_pojo();
	
		System.out.println("this is size"+rst.getFetchSize());
		/*rst.absolute(3);
		rst.first();
		System.out.println(rst.getInt(1)+"-"+rst.getString(2)+"-"+rst.getString(3)+"-"+rst.getString(4)+"-"+rst.getString(5));
			
		rst.next();
		System.out.println(rst.getInt(1)+"-"+rst.getString(2)+"-"+rst.getString(3)+"-"+rst.getString(4)+"-"+rst.getString(5));
		*/
		List<Object> arrayliss= new ArrayList<Object>();
		while(rst.next())
			{
				String str =rst.getString(1);
				int aa = Integer.parseInt(str);
				//System.out.println("this is str--"+str);
			//	if(str.equalsIgnoreCase("1"))
				//if(aa == 1)
				//{
			
				//System.out.print(rst.getInt(1)+ "-");
				pojoclasss.setId(rst.getInt(1));
				pojoclasss.setName(rst.getString(2));
				pojoclasss.setCountrycode(rst.getString(3));
				pojoclasss.setDistrict(rst.getString(4));
				pojoclasss.setPopulation(rst.getInt(5));;
				/*System.out.print(rst.getString(2)+ "-");
				System.out.print(rst.getString(3)+ "-");
				System.out.print(rst.getString(4)+ "-");
				System.out.print(rst.getString(5));
				System.out.println(" ");*/
				//}
				arrayliss.add(pojoclasss);
			}
			System.out.println("this is end");
			
			
			 System.out.println("------------ pojoclassess --------"+pojoclasss.getCountrycode());
			 System.out.println(arrayliss.size());
			 
			 for (int i = 1; i < arrayliss.size(); i++) 
			 {
				 	System.out.println(arrayliss.get(i));
			}
			 
			
			 /*
			  * System.out.println(pojoclasss.getId());
			System.out.println(pojoclasss.getName());
			*/
			
			//System.out.println(pojoclasss);
		con.close();
	}

}

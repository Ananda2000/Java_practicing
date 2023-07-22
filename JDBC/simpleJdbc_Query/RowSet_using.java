package simpleJdbc_Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pojoClass_for_JDBC.RowSet_using_Pojo;



public class RowSet_using 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");
		
		// CREATE THE STATMENET..
		Statement statement = con.createStatement();
		
		// SQL QUERY ..
			String str_query = "select * from sample";
			
		//
			
		ResultSet rst = statement.executeQuery(str_query);
		System.out.println(rst.toString());
		ArrayList<RowSet_using_Pojo> arlist = new ArrayList<RowSet_using_Pojo>();
		RowSet_using_Pojo arrr;
		while(rst.next())
		{
			/*System.out.print(rst.getString(1)+"--");
			System.out.println(rst.getString(2));
			arlist.add(rst.getString(1)+"--"+rst.getString(2));
			*/
			String fn =rst.getString(1);
			String ln=rst.getString(2);
			arrr =new RowSet_using_Pojo(fn,ln);
			arlist.add(arrr);
		}
		System.out.println(arlist.size());
		
		/*for (String string : arlist) 
		{
			System.out.println(string);
			
		}*/
		System.out.println(arlist.size());
		System.out.println("First name --"+"Last name");
		for (RowSet_using_Pojo rowSet_using_Pojo : arlist) 
		{
			System.out.print(rowSet_using_Pojo.getFirst_name()+" ---");
			System.out.println(rowSet_using_Pojo.getLast_name());
			
		}
		
		
		
		
				 
				
		
	}

}

package simpleJdbc_Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



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
		ArrayList<String> arlist = new ArrayList<String>();
		while(rst.next())
		{
			System.out.print(rst.getString(1)+"--");
			System.out.println(rst.getString(2));
			arlist.add(rst.getString(1)+"--"+rst.getString(2));
		}
		System.out.println(arlist.size());
		
		for (String string : arlist) 
		{
			System.out.println(string);
			
		}
		
		
		
		
				 
				
		
	}

}

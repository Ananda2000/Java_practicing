// here we using prepared statement to execute select query , instead of statement interface..

package simpleJDBC_queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedState_ExecuteQuery 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String query = "select * from sample";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");
		
		PreparedStatement prstmt = con.prepareStatement(query);
		
		ResultSet rs = prstmt.executeQuery();
		
		while(rs.next())
		{
			System.out.print(rs.getString(1)+"----");
			System.out.println(rs.getString(2));
		}
	}

}

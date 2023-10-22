package simpleJDBC_queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement_delete 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		String Del_query  = "delete from sample where firstname=?";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");
		
		PreparedStatement prstd = con.prepareStatement(Del_query);
		prstd.setString(1, "anand2");
		
		int aa = prstd.executeUpdate();
		if(aa==1)
		{
			System.out.println("Record deleted ");
		}
		else
		{
			System.out.println("No record present.. We cant delete the data");
		}
		
	}

	
}

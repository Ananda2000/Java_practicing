package simpleJDBC_queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrepareStatement_Insert 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String query ="insert into sample values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		ArrayList<String> ars = new ArrayList<String>();
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");
		PreparedStatement prs = con.prepareStatement(query);
		String aa ="anand";
		int j =1;
		for(int i=0;i<5;i++)
		{
			
			String jj = aa+j;
		prs.setString(1, jj);
		
		prs.setString(2, "setting"+j);
		
		int rs = prs.executeUpdate();
		
		System.out.println(rs);
		j++;
		}
		
	}
	
	

}

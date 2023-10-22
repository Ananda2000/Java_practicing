package resultSetmetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSet_1 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");
		
		PreparedStatement pres = con.prepareStatement("select * from sample");
		
		ResultSet rs = pres.executeQuery();
		ResultSetMetaData rsm = rs.getMetaData();
		System.out.println("Column count ----"+rsm.getColumnCount());
		
		System.out.println("1st column name ----"+rsm.getColumnName(1));
		System.out.println("2nd Column name ---"+rsm.getColumnName(2));
		System.out.println("column Type 1st  ---"+rsm.getColumnTypeName(1));
		System.out.println("Column Type 2nd ---"+rsm.getColumnTypeName(2));
	
	}

}

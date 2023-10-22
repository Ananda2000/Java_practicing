package dataBase_MetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Db_MetaData 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		String str ="select * from sample";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");
		/*PreparedStatement prst =  con.prepareStatement(str);
		
		ResultSet rs = prst.executeQuery();
		
		ResultSetMetaData dbmd = rs.getMetaData();
		*/
		DatabaseMetaData dbmt = con.getMetaData();
		
		System.out.println(dbmt.getUserName().toString());
		//System.out.println(dbmt.getDriverVersion());
	
	}

}

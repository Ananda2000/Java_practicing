package simpleJdbc_Query;

import java.awt.font.FontRenderContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Normalizer.Form;

public class ResultsetMetaData 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","@n@ndA@321");
		Statement stm = con.createStatement();
		String query ="select * from city";
		ResultSet rst = stm.executeQuery(query);
		ResultSetMetaData rstmt  = rst.getMetaData();
		
		System.out.println("Total number of columns ---"+rstmt.getColumnCount());
		System.out.println("---------- HERE WE DISPLAYING COLUMN NAMES -------------");
		for(int gg=1;gg<=rstmt.getColumnCount();gg++)
		{
			System.out.println("The "+gg+" column name is --"+rstmt.getColumnName(gg));
		}
		
		System.out.println("---------- HERE WE DISPLAYING COLUMN DATA TYPES -------------");
		for(int gg=1;gg<=rstmt.getColumnCount();gg++)
		{
			System.out.println("The "+gg+" column type  is --"+rstmt.getColumnTypeName(gg));
		}
		
		/*while(rst.next())
		{
		System.out.println(rst.getInt(1));
		}*/
	}

}

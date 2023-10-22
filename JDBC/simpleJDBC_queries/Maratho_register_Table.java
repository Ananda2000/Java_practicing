package simpleJDBC_queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import simpleJdbc_Query.Pojo_Maratho_register_Table;

//import com.mysql.cj.xdevapi.Statement;

public class Maratho_register_Table 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		//Pojo_Maratho_register_Table  pojoClass = new Pojo_Maratho_register_Table();
		String  query ="select * from sample";
		Class.forName("com.mysql.cj.jdbc.Driver");
		int counter =0;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");
		Statement stm = con.createStatement();
		
		ResultSet rs = stm.executeQuery(query);
		ArrayList<Pojo_Maratho_register_Table> arl = new ArrayList<Pojo_Maratho_register_Table>();
		System.out.println(rs+"---");
		int i=0;
		while(rs.next())
		{
			Pojo_Maratho_register_Table  pojoClass = new Pojo_Maratho_register_Table();
			System.out.print(rs.getString("FirstName")+"---");
			System.out.println(rs.getString(2));
			String fn = rs.getString("FirstName");
			String ln = rs.getString(2);
			/*arl.add(fn);
			arl.add(ln);*/
			pojoClass.setFirst_name(fn);
			pojoClass.setLast_name(ln);
			
			arl.add(pojoClass);
		
		}
		System.out.println(" ======= ARRAY LIST..=====================---------------============= ");
		System.out.println("arl--"+arl);
		
		System.out.println();
		
		System.out.println("arrayList size ===================-======================");
		
		System.out.println(arl.size());
		
		System.out.println();
		System.out.println("=================-------------------=========================");
		/*for(int j=0;j<arl.size();j++)
		{
			System.out.print(arl.get(j).getFirst_name()+"----");
			System.out.println(arl.get(j).getLast_name());
		}*/
		
		for (Pojo_Maratho_register_Table aa12 : arl) 
		{
			System.out.println(aa12);
			System.out.print(aa12.getFirst_name()+"---");
			System.out.println(aa12.getLast_name());
		}
		
	}

}

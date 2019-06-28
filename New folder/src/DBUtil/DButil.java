package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	
	public static Connection fechConnection() throws Exception
	{
		 String url="jdbc:mysql://localhost:3306/emp?useSSL=false";
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,"root","root");
		
	}	

}

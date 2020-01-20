package User_Management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connection_Manager {

	public Connection getConnection()throws ClassNotFoundException,SQLException
	{
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
				if(con!=null)
				{
					return con;
				}
				else
					return null;	

	}

}

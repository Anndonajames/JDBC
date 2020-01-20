package Product;

public class Connection_Manager {
	import java.sql.Connection;

	import java.sql.DriverManager;
	import java.sql.SQLException;
	
			// TODO Auto-generated method stub
			
			public class Connection_Manager  {
			public Connection getConnection1()
					throws ClassNotFoundException, SQLException 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=null;
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
						if(con!=null)
						{
							//System.out.println("jdfsjfs");
							return con;
						}
						else
							//System.out.println("jdfsjfs");
							return null;
			}
			}
			
	}

}

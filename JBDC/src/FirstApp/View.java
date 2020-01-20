package FirstApp;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import FirstApp.ConnectionManager;
public class View {
	public  void view1()throws ClassNotFoundException, SQLException 
	{
	ConnectionManager con=new ConnectionManager();
	Statement s1=(Statement)con.getConnection().createStatement();
	ResultSet r=s1.executeQuery("Select * from firstapp");
	while(r.next())
	{
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
	}
	FirstApp fp=new FirstApp();
	fp.choice();
	}


}

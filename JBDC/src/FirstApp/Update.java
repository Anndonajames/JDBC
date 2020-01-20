package FirstApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import FirstApp.ConnectionManager;
import FirstApp.View;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Update {
	public void update_data() throws ClassNotFoundException, SQLException 
	{
		Scanner s=new Scanner(System.in);
	
		ConnectionManager con=new ConnectionManager();
		Statement s1=(Statement)con.getConnection().createStatement();
		ResultSet r=s1.executeQuery("Select * from firstapp");
		while(r.next())
		{
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
		}
		
		
		
		System.out.println("Enter Id");
		int id=s.nextInt();
	
		System.out.println("Enter New  Id");
		int id1=s.nextInt();
	
		System.out.println("Enter the Username");
		String username1=s.next();
		System.out.println("Enter the Password");
		String password1=s.next();
		PreparedStatement st=(PreparedStatement) con.getConnection().prepareStatement("update firstapp set Id=?,Username=?,Password=? where Id=?;");
		st.setInt(1,id1);
		st.setString(2, username1);
		st.setString(3, password1);
		st.setInt(4, id);
		st.execute();
		con.getConnection().close();
		System.out.println("Data Updated");
		FirstApp fp=new FirstApp();
		fp.choice();
		
		
		con.getConnection().close();
}
}
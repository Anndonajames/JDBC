package FirstApp;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import FirstApp.ConnectionManager;
public class Delete {
	public void delete_data() throws ClassNotFoundException, SQLException 
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
		PreparedStatement st=(PreparedStatement) con.getConnection().prepareStatement("delete  from firstapp  where Id=?;");
		st.setInt(1,id);
		st.executeUpdate();
		con.getConnection().close();
		System.out.println("Data Deleted");
		FirstApp fp=new FirstApp();
		fp.choice();
		
		
		
	
}
}

package FirstApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Login 
{
	
	public void login_User() throws ClassNotFoundException,SQLException
	{
		Scanner s=new Scanner(System.in);
		ConnectionManager con=new ConnectionManager();
		Statement s1=(Statement)con.getConnection().createStatement();
		System.out.println("Enter username:");
		String username=s.next();
		System.out.println("Enter password");
		String password=s.next();
		

		ResultSet rs=s1.executeQuery("select * from firstapp");
		
		int flag=0;
		while(rs.next())
		{
			String name=rs.getString(2);
			String pass=rs.getString(3);
			if(name.equals(username) && pass.equals(password))
			{
				flag=1;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Sucessfull");
		}
		else
			System.out.println("not kkd");
		
		FirstApp fp=new FirstApp();
		fp.choice();
		
	
		con.getConnection().close();
	}

}

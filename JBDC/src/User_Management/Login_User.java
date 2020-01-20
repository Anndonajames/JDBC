package User_Management;
import java.sql.*;
import java.util.Scanner;

import User_Management.Connection_Manager;
public class Login_User {
	public void login_users()throws ClassNotFoundException,SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter username:");
		String username=s.next();
		System.out.println("Enter password");
		String password=s.next();
		int flag=0;
		
		Connection_Manager  con=new Connection_Manager();
		Statement s1=(Statement)con.getConnection().createStatement();
		
		ResultSet r=s1.executeQuery("select * from stud");
		while(r.next())
		{
			String name=r.getString(2);
			String pass=r.getString(3);
			
			if(name.equals(username) && pass.equals(password) )
			{
				System.out.println("Welcome Student");
			}
		}
		ResultSet r1=s1.executeQuery("Select * from admin");
		while(r1.next())
		{
			String name=r1.getString(2);
			String pass=r1.getString(3);
			if(name.equals(username) && pass.equals(password) )
			{
				System.out.println("Welcome Admin");
			}
		}
				
				
		}

	}


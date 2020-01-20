package FirstApp;
import java.util.regex.*;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.mysql.jdbc.PreparedStatement;
import FirstApp.ConnectionManager;
public class Insert {

	public void insert1()throws ClassNotFoundException, SQLException 
	{
		ConnectionManager con=new ConnectionManager();
		Scanner s=new Scanner(System.in);
		int flag=0,pass_flag=0;
		String n_username="";
		System.out.println("enter id");
		int id=s.nextInt();
		Pattern user_pattern=Pattern.compile("^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$");
		System.out.println("Enter the Username");
		String username=s.next();
		Matcher user_mather=user_pattern.matcher(username);
		if(user_mather.matches())
		{
			System.out.println("Valid Username");
			flag=1;
	
		}
		else 
		{
			System.out.println("Invalid Username");
			
		}
	
			System.out.println("Enter the Password");
			Pattern pwd_pattern=Pattern.compile("^(?![0-9]{6})[0-9a-zA-Z]{6}$");
			String password=s.next();
			Matcher pwd_mathcer=pwd_pattern.matcher(password);
			if(pwd_mathcer.matches())
			{
				System.out.println("Valid Password");
				pass_flag=1;
			}
			else
			
			System.out.println("Invalid Password");
			
		
		
		if(flag==1 && pass_flag==1)
		{
		PreparedStatement st=(PreparedStatement) con.getConnection().prepareStatement("insert into  firstapp (Id,Username,Password)values(?,?,?);");
		st.setInt(1,id);
		st.setString(2, username);
		st.setString(3, password);
		st.executeUpdate();
		}
		
		else 
			System.out.println("Try again");
		
		con.getConnection().close();
		//System.out.println("Data Saved Successfully");
		FirstApp fp=new FirstApp();
		fp.choice();
	
	}
}

package User_Management;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import User_Management.Connection_Manager;
public class InsertUsers 
{
public void insert() throws ClassNotFoundException,SQLException
{
	Connection_Manager con=new Connection_Manager();
	Scanner s=new Scanner(System.in);
	int flag=0,flag_st=0,flag_admin=0;
	
System.out.println("Enter the Role of User(Student/Admin)");
String type=s.next();
	



	
System.out.println("enter id");
int id=s.nextInt();
	
System.out.println("Enter the Username");
String username=s.next();
System.out.println("Enter the Password");
String password=s.next();	
if(type.equals("Student"))
{

	PreparedStatement st=(PreparedStatement) con.getConnection().prepareStatement("insert into  stud (Id,Username,Password)values(?,?,?);");
	st.setInt(1,id);
	st.setString(2, username);
	st.setString(3, password);
	st.executeUpdate();
	//}
//	if(flag==1)
//	{
}
if(type.equals("Admin"))
{
		PreparedStatement st1=(PreparedStatement) con.getConnection().prepareStatement("insert into  admin (Id,Username,Password)values(?,?,?);");
		st1.setInt(1,id);
		st1.setString(2, username);
		st1.setString(3, password);
		st1.executeUpdate();
	//}
}
	
	con.getConnection().close();
	System.out.println("Data Saved Successfully");
	User_Management is=new User_Management();
	is.choice();

}
}
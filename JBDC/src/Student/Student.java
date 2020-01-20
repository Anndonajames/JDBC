package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

					//1.Register the Driver.Driver download link
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=null;//Connection is type,con is object
			//create connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			if(con==null)
			{
				System.out.println("Conncetion Failed");
			}
			else
				System.out.println("Connection Successfull");
			Scanner s=new Scanner(System.in);

			System.out.println("Enter the option:");
			System.out.println("1.Insert\n2.Display ");
			int op=s.nextInt();
			switch(op)
			{
			case 1:
			
						System.out.println("Enter the first name");
			String first=s.next();
			System.out.println("Enter the Register Number");
			int id=s.nextInt();
			System.out.println("Enter the Department");
			String dept=s.next();
			System.out.println("Enter the Address");
			String address=s.next();
			System.out.println("Enter the year");
			int year=s.nextInt();
			
			PreparedStatement st=(PreparedStatement) con.prepareStatement("insert into  student (Name, RegNum, Department, year, Address)values(?,?,?,?,?);");
			st.setString(1, first);
			st.setInt(2, id);
			st.setString(3,dept);
			st.setInt(4, year);
			st.setString(5, address);
			st.executeUpdate();
			System.out.println("Insert Successfull");
			con.close();
			break;
			case 2:
				Statement s1=(Statement)con.createStatement();
				ResultSet r=s1.executeQuery("Select * from student");
				while(r.next())
				{
					System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getString(3)+" "+r.getInt(4));
				}
			
			con.close();
			break;
			}
			}
}

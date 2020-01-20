package User_Management;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

import User_Management.Connection_Manager;
public class User_Management {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub

		User_Management um=new User_Management();
		um.choice();
		
	}
	public void choice() throws ClassNotFoundException,SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Option");
		System.out.println("1.Insert\n2.Login\n3.Exit");
		int op=s.nextInt();
		switch(op)
		{
		case 1:
			InsertUsers in=new InsertUsers();
			in.insert();
			break;
		case 2:
			Login_User lo=new Login_User();
			lo.login_users();
			break;
		case 3:
			System.exit(0);
			break;
		}
		
	}

}

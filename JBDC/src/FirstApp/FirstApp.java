package FirstApp;

import FirstApp.ConnectionManager;

import java.sql.SQLException;
import java.util.Scanner;

public class FirstApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		
				Scanner s=new Scanner(System.in);
				FirstApp first=new FirstApp();
				first.choice();
	}


	
public void choice() throws ClassNotFoundException, SQLException 
				{
					Scanner s=new Scanner(System.in);
				System.out.println("Enter the Choice:");
				System.out.println("1.Insert\n2.View\n3.Update\n4.Delete\n5.Login\n6.Exit ");
				int op=s.nextInt();
				switch(op)
				{
				case 1:
//					System.out.println("Insert New Data");
					Insert insertObj=new Insert();
					insertObj.insert1();
				break;
				case 2:
//					System.out.println("Insert New Data");
					View  viewObj=new View();
					viewObj.view1();
				break;
				case 3:
					Update up=new Update();
					up.update_data();
				case 4:
					Delete del=new Delete();
					del.delete_data();
					break;
				case 5:
					Login log=new Login();
					log.login_User();
					break;
				case 6:
					System.exit(0);
					break;
					
				
				default:
					break;
				}

	}

}
package return_book;
import java.util.*;
import java.sql.*;
class ret{
  String b_name;
}
 public class return_book
{
	 public void ret_book()
	{
		 try{
     Class.forName("com.mysql.jdbc.Driver");
  
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","12345");

    Statement stmt= conn.createStatement();
     Scanner scn = new Scanner(System.in);
	 Scanner scn1 = new Scanner(System.in);
	int roll_no;
	String Book_name;
        
		System.out.print("Enter Your Roll No: ");
        roll_no = scn.nextInt();
		
		System.out.print("Enter Book Name: ");
        Book_name = scn1.nextLine();
		
		String search =("DELETE FROM issue_book where Roll_No="+roll_no+" and Book_Name='"+Book_name+"';");
        stmt.executeUpdate(search);
		System.out.println("***************Successfully Returned & NO FINE before 1-month************* ");
		System.out.println("************Book deleted from your issue_table***************");
		 
		}
	catch(ClassNotFoundException c){
      System.out.print("hand shaking jar is not found");
    }
   catch(SQLException c){
      System.out.print("connection related issue");
    }	
	}
	
}
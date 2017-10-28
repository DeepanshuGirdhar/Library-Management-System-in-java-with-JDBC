package add_book;
import issue_book.issue_book;
import java.sql.*;
import java.util.*;
/*class collection1{
 String Sr_no;
 String book_name;
 String book_author;
 String course;  
 String branch;
 String year; 
 String semester;
}*/

public class add_book extends issue_book

   public void ad_book(){
    try{
     Class.forName("com.mysql.jdbc.Driver");
  
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","12345");

    Statement stmt= conn.createStatement();
     Scanner scn = new Scanner(System.in);
	 Scanner scn1 = new Scanner(System.in);
    String Book_name,Author_name,course,Branch;
	int  year,sem;
        
        System.out.print("Enter Book Name: ");
        Book_name = scn1.nextLine();

        System.out.print("Enter Author Name: ");
        Author_name = scn1.nextLine();

		System.out.print("Enter Course: ");
        course = scn1.nextLine();

		System.out.print("Enter Branch: ");
        Branch = scn1.nextLine();
		
		System.out.print("Enter Year: ");
        year = scn.nextInt();

		System.out.print("Enter Semester: ");
        sem = scn.nextInt();


  
        System.out.println("\nInserting records into table...");
        stmt = conn.createStatement();

  
		int temp=stmt.executeUpdate("insert into add_book values('"+Book_name+"','"+Author_name+"','"+course+"','"+Branch+"',"+year+","+sem+");");

        System.out.println(" SUCCESS!\n"+temp);

   }catch(ClassNotFoundException c){
      System.out.println("hand shaking jar is not found");
    }
   catch(SQLException c){
      System.out.println("connection related issue");
    }
    System.out.println("Successfully Added!!!");
  }
}

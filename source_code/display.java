package display;
import java.sql.*;
import java.util.*;
import return_book.return_book;
class disp{
  String b_name;
  String b_author;
 String course;  
 String branch;
 String year; 
 String semester;

}

public class display extends return_book {
   public void disp_lay(){
    try{
     Class.forName("com.mysql.jdbc.Driver");
   
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","12345");

    Statement stmt= conn.createStatement();
	
    ResultSet rs= stmt.executeQuery("select * from add_book");   
     
    ArrayList<disp> al=new ArrayList<disp>();
    disp d=null;
    while(rs.next()){
     d=new disp();
      d.b_name = rs.getString("book_name");

			d.b_author= rs.getString("book_author");
	  
			d.course= rs.getString("course");
           
			d.branch= rs.getString("branch");
           
			d.year = rs.getString("year");
          
			d.semester = rs.getString("semester");
			al.add(d);
    } 
    for(disp dd:al){
      System.out.println("+---------------------------------------------------------+\n"+dd.b_name+" | "+dd.b_author+" | "+dd.course+" | "+dd.branch+" | "+dd.year+" | "+dd.semester+"\n"+"+---------------------------------------------------------+");
    }

    }catch(ClassNotFoundException c){
      System.out.print("hand shaking jar is not found");
    }
   catch(SQLException c){
      System.out.print("connection related issue");
    }
   }
}
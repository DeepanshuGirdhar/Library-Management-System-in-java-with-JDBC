package issue_book;
import java.util.*;
import java.sql.*;
import display.display;
class collection{
  String b_name;
 String course;  
 String branch;
 String year; 
 String semester;
}
public class issue_book extends display
{
	public void is_book()
	{
		 try{
     Class.forName("com.mysql.jdbc.Driver");
  
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","12345");

    Statement stmt= conn.createStatement();
     Scanner scn = new Scanner(System.in);
	 Scanner scn1 = new Scanner(System.in);
    String Book_name,course,Branch;
	int  year,sem,roll_no;
        
		System.out.print("Enter Your Roll No: ");
        roll_no = scn.nextInt();

        System.out.print("Enter Book Name: ");
        Book_name = scn1.nextLine();

        
		System.out.print("Enter Course: ");
        course = scn1.nextLine();

		System.out.print("Enter Branch: ");
        Branch = scn1.nextLine();
		
		System.out.print("Enter Year: ");
        year = scn.nextInt();

		System.out.print("Enter Semester: ");
        sem = scn.nextInt();
		
		
		String search =("SELECT * FROM add_book where book_name='"+Book_name+"' and course='"+course+"' and branch='"+Branch+"' and year='"+year+"' and semester='"+sem+"';");
         ResultSet rs = stmt.executeQuery(search);
		ResultSet rs1=rs;
		 ArrayList<collection> al=new ArrayList<collection>();
			collection temp=null;
			int i=0;
		  
			         while(rs.next())
			 {
				 i=i+1;
				 temp=new collection();
			 System.out.println("**********************Successfully issued**************************");
			 
             temp.b_name = rs.getString("book_name");
       
			temp.course= rs.getString("course");
           
			temp.branch= rs.getString("branch");
           
			temp.year = rs.getString("year");
          
			temp.semester = rs.getString("semester");
			al.add(temp);
		 }	
		 if(i>0)
		 {
			 java.util.Date b = new java.util.Date();
				String var = b.toString();			 
		  for(collection ee:al){
int temp1=stmt.executeUpdate("insert into issue_book values("+roll_no+",'"+ee.b_name+"','"+ee.course+"','"+ee.branch+"',"+Integer.parseInt(ee.year)+","+Integer.parseInt(ee.semester)+",'"+var+"');");
		System.out.println("***************Inserted Book in Issue Table*********************");
		  System.out.println("Book Details-----"+"     "+ee.b_name+" | "+ee.course+" | "+ee.branch+" | "+ee.year+" | "+ee.semester);}
		  }
		  else
			  System.out.println("Soory,Book Not Available");
 
		 
			
	}
	catch(ClassNotFoundException c){
      System.out.print("hand shaking jar is not found");
    }
   catch(SQLException c){
      System.out.print("connection related issue");
    }	
}
	}
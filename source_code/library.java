package library;
import add_book.add_book;
import java.util.*;
class library extends add_book
{                                                                                                   
public static void main(String ...r)
	{
		Scanner scan=new Scanner(System.in);
		library obj=new library();
	
		System.out.println("            "+"+------------------------------------------------+\n"+"                       "+"Welcome To Library World"+"\n            "+"+------------------------------------------------+");
		while(true)
		{
			
		System.out.println("Enter 1 for Issue a book");
		System.out.println("Enter 2 for Return book");
		System.out.println("Enter 3 for Add a book");
		System.out.println("Enter 4 for Display of Books in Library");
	
		int choice=scan.nextInt();
		if(choice==1)
		{
			obj.is_book();
		}
		else if(choice==2)
		{
			obj.ret_book();
		}
		else if(choice==3)
		{
			obj.ad_book();
		}
		else if(choice==4)
		{
			obj.disp_lay();
		}
		System.out.println("1 for continue");
		System.out.println("2 for exit");
		int choice1=scan.nextInt();
		if(choice1==1)
		{
			continue;
		}
			break;
		}
	}
}

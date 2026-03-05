package week_04;
import java.util.Scanner;

public class library {

	private String book,bookid,author,issue;
	//--------------------------------------------
	void valves(String n1,String n2,String n3,String n4)
	{
		book=n1;
		bookid=n2;
		author=n3;
		issue =n4.equalsIgnoreCase("yes")?"yes":"no";
	}
	
	public String retbook() {
		return book ;
	}
	
public String retid() {
				return bookid ;
	}

public String retaut() {
	
	return author ;
}	
public String iussing ()
{ 
	return issue;	
	}
public static void clearScreen() {
    System.out.println("\n".repeat(5)); 
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//------------------------------------
String book,bookid,author,issue, add;
//---------------------------------
		library obj=new library();
do {
	System.out.print("Enter BOOK NAME : ");
	book =s.nextLine();
	System.out.print("Enter BOOK ID : ");
	bookid=s.nextLine();
	System.out.print("Enter AUTHOR NAME : ");
			author=s.nextLine();
	System.out.print("Enter BOOK issued ?: ");
	issue=s.nextLine();
obj.valves(book,bookid,author,issue);
clearScreen();
System.out.println("\n".repeat(2));

	System.out.println("BOOK NAME  : "+obj.retbook());
	System.out.println("BOOK id  : "+obj.retid());
	System.out.println("BOOK author  : "+obj.retaut());
	System.out.println("BOOK issuing  : "+obj.iussing());
	System.out.println("\n".repeat(2));
	System.out.print("want to add another book?: ");
	add=s.nextLine();
	System.out.println("\n".repeat(2));
}while(add.equalsIgnoreCase("yes")); 
System.out.println(" NO BOOK LEFTED: ");
	
	}
	
}

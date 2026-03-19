package JDBC_SQLL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class preparedstatement_Retrival {
    public static void main(String[] arg) throws Exception {
        Scanner sc = new Scanner(System.in); 
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/students";
        String root = "root";
        String password = "15012005";
       
        
        String qurry = "SELECT * FROM students WHERE marks >= ?";
      
        System.out.print("Enter marks  ");
     
        
        int marks= sc.nextInt();
       
        
        Connection con = DriverManager.getConnection(url, root, password);
       
        PreparedStatement stm = con.prepareStatement(qurry);
      
        stm.setInt(1, marks);
      
      
        ResultSet rs = stm.executeQuery();
      
        while (rs.next()) {
        
        	System.out.println(rs.getInt(1)+"  :"+ rs.getString(2)+"  :"+rs.getInt(3)+"  :"+ rs.getString(4)+"  :"+rs.getString(5)+"\n"); 
            }


        rs.close();
        stm.close();
        con.close();
        sc.close();
    }
}





/*package JDBC_SQLL;
import  java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner ;

public class preparedstatement_Retrival {
public static void main(String []arg)throws Exception {

	Scanner sc =new Scanner (System.in);
	
	
	//Class.forName("com.mysql.jdbc.Driver");
	
	String url= "jdbc:mysql//localhost:3306/students";
	String root="root" ;
	String password="15012005";	
	String qurry ="select ?,? form students ";
System.out.print("enter entity first:");
	String name=sc.next();
	System.out.print("enter entity second entity:");
	String city=sc.next() ;
	

			Connection  con = DriverManager.getConnection(url,root ,password);
			
			
			PreparedStatement stm= con.prepareStatement(qurry);
		stm.setString(1, name);
			stm.setString(2, city);
				
			//stm.setInt(1, name);
			
			 ResultSet rs =  stm.executeQuery();
			
			
		
		
		while (rs.next()) {
			
			String userdata=rs.getString(1) +": "+rs.getString(2);
			
			System.out.print(userdata);
		}
		
	stm.close();	
con.close();
}
 
}
*/
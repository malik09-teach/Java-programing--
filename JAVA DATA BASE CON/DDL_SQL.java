package JDBC_SQLL;
import java.sql.*;
import java.util.Scanner;


public class DDL_SQL {
	
	
	
public static void  main (String []args) throws Exception {
	
    Scanner sc = new Scanner(System.in);
    // Load MySQL JDBC driver (optional for recent versions)
    Class.forName("com.mysql.cj.jdbc.Driver");

    
    String url = "jdbc:mysql://localhost:3306/students";
    
    String root = "root";
    
    String password = "15012005";
    

  //  String query = "CREATE TABLE temp(no INT, rollno INT, name VARCHAR(50))";
    String query="drop table temp";
    String query1 = "CREATE TABLE temp2(no INT, rollno INT, name VARCHAR(50))";
    
    try (
    Connection con=DriverManager.getConnection(url,root,password);
     Statement st= con.createStatement();
       
   ){
    
    	st.executeUpdate(query);
    	//st.executeUpdate(query1);
  //  System.out.println("table created");

    	System.out.println("droped");
    	
    	
    st.close();
    con.close();
    }
       
    catch(Exception e) {
    	
    	System.out.println("not droped"+e);
    	
    	//System.out.println("not created"+e);
//e.getStackTrace();
    }
	
	
	
}
}

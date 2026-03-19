package JDBC_SQLL;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DML_SQL {
public static  void main (String []args) throws Exception{
	
    String url = "jdbc:mysql://localhost:3306/students";
    String root = "root";
    String password = "15012005";
  // String query = "insert into students values (112,'malik','+44','c','malkand')";

   String query = "UPDATE students SET marks = 85, grade = 'A+' WHERE id = 111";


	
	
	//Class.forName("com.mysql.jdbc.Driver");
	
	try (Connection con=DriverManager.getConnection(url,root,password);	
			
			Statement st=con.createStatement())
	
	{
	
st.executeUpdate(query);
	System.out .println(": updated");
	st.close();
    con.close(); 
	
	}
	catch(Exception e) {
		System.out.println(e);
	
	}

	
	
}

}


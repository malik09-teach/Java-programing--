package JDBC_SQLL;
 import java.sql.*;
 
public class DATA_RETRIVAL {

	public static void main(String []args)throws Exception  {
	    String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "15012005";
        String query = "SELECT name,grade FROM students";  // Fixed query
	
	try(Connection con =DriverManager.getConnection(url, username, password);
			
			Statement st= con.createStatement();
			
			ResultSet rs=st.executeQuery(query)	)
	//		ResultSet rs=st.executeQuery("SELECT name, grade FROM students"	)
	
	{
		while (rs.next()) {
			
		
		String status= rs.getString(1)+ " :"+rs.getString(2);
		
		System.out.println(status );
		
		}
	
		st.close();
		con.close();
		
	}
	catch(Exception e) {
		System.out.println(e );
	}
	
	
	
	
	}
}

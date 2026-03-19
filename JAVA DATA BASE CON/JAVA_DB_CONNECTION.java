package JDBC_SQLL;

import java.sql.*;





public class JAVA_DB_CONNECTION {
	

    public static void main(String[] args) throws Exception {
    	
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
      String password = "15012005";
        String query = "SELECT * FROM students";  
        
    //   Class.forName("com.jdbc.mysql.Driver");
        try (Connection con = DriverManager.getConnection(url, username, password);
            
        		Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {  
        	
        	
        	System.err.println("CONNECTED SUCCESSFULLY:");
        	
            st.close();
            con.close();
        }
        catch (SQLException e) {
            System.err.println("Database error:");
            e.printStackTrace();
        }     
    }
}
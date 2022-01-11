import java.sql.*;

public class Jdbc {
   static final String DB_URL = "jdbc:mysql://localhost:3306/sys";
   static final String USER = "root";
   static final String PASS = "Welcome1";
   static final String QUERY = "SELECT * FROM Customer";

   public static void main(String[] args) throws ClassNotFoundException {
    
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {

            Class.forName("com.mysql.cj.jdbc.Driver");
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("name"));
            System.out.println(", Last: " + rs.getString("custID"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}

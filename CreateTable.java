 import java.sql.Connection;  
    import java.sql.DriverManager;  
    import java.sql.SQLException;  
    import java.sql.Statement;  
 
    public class CreateTable {  
       
        public static void createNewTable() {  
                String url = "jdbc:sqlite:C://sqlite/SSSIT.db";  
                         String sql = "CREATE TABLE IF NOT EXISTS movies (\n"  
                    + " id integer PRIMARY KEY,\n"  
                    + " name text NOT NULL,\n"  
                    + " capacity real\n"  
                    + ");";  
              
            try{  
                Connection conn = DriverManager.getConnection(url);  
                Statement stmt = conn.createStatement();  
                stmt.execute(sql);  
            } catch (SQLException e) {  
                System.out.println(e.getMessage());  
            }  
        }  
   
        public static void main(String[] args) {  
            createNewTable();  
        }  
       
    }  

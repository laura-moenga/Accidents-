import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class databaseconnection {
    public static final String URL ="jdbc:mysql://localhost:3306/accidents_db";
    public static final String USER ="root";
    public static final String PASS ="";
    public static Connection getConnection() {
        try {
            Connection conn = null;
            system.out.println("connetcted to the database ");
            return conn;
        } catch (SQLException e) {
            system.out.println("database conectio failed!");
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[]args){
        connect();
    }
}


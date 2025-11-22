import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/accident";
    public static final String USER = "root";
    public static final String PASSWORD = ""; // Your MySQL password (empty if no password)

    public static Connection getConnection() {
        try {
            // Actually create the connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Connected to the database successfully!");
            return conn;
        } catch (SQLException e) {
            System.out.println(" Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }
}
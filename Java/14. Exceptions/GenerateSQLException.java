import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenerateSQLException {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/non_existent_db", "user", "password");
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }
}

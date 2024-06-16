import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class login {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public login () {
        conn = databaseConnection.connection();
    }

    public boolean authenticateUser(String userEmail, String userPass) {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM myadmin WHERE mail = '" + userEmail + "' AND password = '" + userPass + "'";
            rs = stmt.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

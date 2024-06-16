import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class showadminmodel {

    Connection conn;
    Statement stmt;
    ResultSet rs;

    public showadminmodel() {
        conn = databaseConnection.connection();
        
    }

    public ResultSet getAdminRecords() {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM admin";
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}

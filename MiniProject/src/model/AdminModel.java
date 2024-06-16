import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class AdminModel {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public AdminModel() {
        conn = databaseConnection.connection();
    }    

    void updateAdmin(int adminId, String adminName, String adminMail, String adminPass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void updateAdmin(int adminId, String adminName, String adminMail, String adminPass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void updateAdmin(int adminId, String adminName, String adminMail, String adminPass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void deleteAdmin(int adminId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 public void addAdmin(String adminName, String adminMail, String adminPass) {
        try {
            stmt = conn.createStatement();
            String sql = "INSERT INTO ADMIN(mail,password,name)Values ('" + adminMail + "','" + adminPass + "','" + adminName + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data inserted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}


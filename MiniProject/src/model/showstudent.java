import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class showstudent {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public showstudent() {
        conn = databaseConnection.connection();
    }

    public ResultSet getStudentRecords() {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM STUDENT";
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}

   // List<Student> getAllStudents() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

   //List<Student> getAllStudents() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

   // List<Student> getAllStudents() {
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

  //  List<Student> getAllStudents() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }
//}

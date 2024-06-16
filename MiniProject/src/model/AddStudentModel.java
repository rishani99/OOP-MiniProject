
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AddStudentModel {
    private String name;
    private String fatherName;
    private String city;
    private String blood;
    private String phone;
    private int stdClass;

    // Constructors, getters, and setters
    public AddStudentModel(String name, String fatherName, String city, String blood, String phone, int stdClass) {
        this.name = name;
        this.fatherName = fatherName;
        this.city = city;
        this.blood = blood;
        this.phone = phone;
        this.stdClass = stdClass;
    }

    // Getters and setters...
}

// DatabaseConnection.java
import java.sql.Connection;
import java.sql.DriverManager;

public class databaseConnection 
{
    public static Connection connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "username", "password");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

// StudentDAO.java
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import javax.swing.JOptionPane;

public class AddStudentModel {
    publicprivate Connection conn;

    public AddStudentModel() {
        conn = databaseConnection.connection();
    }

    public void addStudent(Student student) {
        try {
            String sql = "INSERT INTO STUDENT (stdName, stdFather, stdBlood, stdCity, stdPhone, stdClass) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getFatherName());
            pstmt.setString(3, student.getBlood());
            pstmt.setString(4, student.getCity());
            pstmt.setString(5, student.getPhone());
            pstmt.setInt(6, student.getStdClass());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data is successfully inserted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

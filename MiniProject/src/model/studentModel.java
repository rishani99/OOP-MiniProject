public class studentModel {
    private String name;
    private String fatherName;
    private String city;
    private String bloodGroup;
    private String phone;
    private int studentClass;

    // Constructor, getters, and setters
    public studentModel(String name, String fatherName, String city, String bloodGroup, String phone, int studentClass) {
        this.name = name;
        this.fatherName = fatherName;
        this.city = city;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
        this.studentClass = studentClass;
    }

    // Getters and Setters
    // ...

    int getStdClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


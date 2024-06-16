import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;


public class AddStudentControl {
    private AddstudentView view;
    private final AddStudentControl model;
    private Object jComboBox2;
    private Object City;

    public AddStudentControl(AddstudentView view, AddStudentControl model) {
        this.view = view;
        this.model = model;

      //  this.view.Submitbutton(new SubmitListener());
      //  this.view.addBackListener(new backbutton());
    }

   // private void studentcontrol(Student student) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

   // class SubmitListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           try {
               String studentName  = Name.getText();
                String Blood = (String)jComboBox2.getSelectedItem();
                String stdfathername = Father.getText();
                String stdcity = City.getText();
                String stdphone = Phone.getText();
                int stdclass = Integer.parseInt(Class.getText());

            //    Student student = new Student(name, fatherName, city, bloodGroup, phone, studentClass);
            //    model.studentcontrol(student);
               // view.showMessage("Student added successfully!");
         } catch (Exception ex) {
               view.showMessage("Error: " + ex.getMessage());
           }
       }
    

    //class BackListener implements ActionListener {
   // public void actionPerformed(ActionEvent e) 
         //  view.setVisible(false);
            // Logic to show the previous screen
       // }
   // }
}

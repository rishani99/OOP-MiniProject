import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.SwingUtilities;



public class showcontrol {
    private Showstudentview view;
    private final showstudent model;
  

    public showcontrol(Showstudentview view, showstudent model) 
    {
        this.view = view;
        this.model = model;

       // this.view.back(new backbutton());
       
   
    
}
    private void Showcontrol() {
        try {
            List<Student> students = model.getAllStudents();
            // You may need to convert the List<Student> to a ResultSet or another format suitable for DbUtils
            // Here is a simple example of how to do it if you have your own method to convert it:
            // ResultSet rs = convertListToResultSet(students);
            // view.setTableModel(rs);

            // Dummy implementation for conversion (you should replace this with actual conversion code)
            // This is for illustration purposes only
           // view.setTableModel(model./*getAllStudents*/())
        } catch (Exception e) {
            view.showMessage("Error: " + e.getMessage());
        }
    }

    private static class backbutton {

        public backbutton() {
        }
    }
}

    //class BackButtonListener implements ActionListener {
        //public void actionPerformed(ActionEvent e) {
            // Handle back button action
            //view.setVisible(false);
            // You can add navigation to the home screen or previous screen here
        
    

    //public static void main(String[] args) {
      //  SwingUtilities.invokeLater(() -> {
        //    studentMod model = new studentModel();
          //  Showstudentview view = new Showstudentview();
            //new showControl(view, model);
            //view.setVisible(true);
       // });
    //}



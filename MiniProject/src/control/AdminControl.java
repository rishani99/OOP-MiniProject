import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AdminView;


public class AdminControl {
    private AdminModel model;
    private AdminView view;

    public AdminControl(AdminModel model, AdminView view) {
        this.model = model;
        this.view = view;

        //this.view.addUpdateListener(new UpdateListener());
        //this.view.a/*ddBackbuton*/(new BackListener());
        //this.view.addDeleteListener(new DeleteListener());
        //this.view.addSearchListener(new SearchListener());
    }

    class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int adminId = view.getAdminId();
                String adminName = view.getAdminName();
                String adminMail = view.getAdminMail();
                String adminPass = view.getAdminPassword();

                model.updateAdmin(adminId, adminName, adminMail, adminPass);
                view.displayMessage("Data Updated Successfully");
            } catch (Exception ex) {
                view.displayMessage("Error: " + ex.getMessage());
            }
        }
    }

    class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Assuming home is another view
            HomeView homeView = new HomeView();
            homeView.setVisible(true);
        }
    }

    class DeleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int adminId = view.getAdminId();
                model.deleteAdmin(adminId);
                view.displayMessage("Admin Deleted Successfully");
            } catch (Exception ex) {
                view.displayMessage("Error: " + ex.getMessage());
            }
        }
    }
}


             

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    private login model;
    private LoginView view;

    public LoginController(login model, LoginView view) {
        this.model = model;
        this.view = view;

        //this.view.AdminModel(new Admin());
       // this.view.cancel(new CancelListener());
    }

    private static class Admin {

        public Admin() {
        }
    }

    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userEmail = view.getEmail();
            String userPass = view.getPassword();

            if (model.authenticateUser(userEmail, userPass)) {
                view.close();
                HomeView homeView = new HomeView(); // assuming HomeView is another view class
                homeView.setVisible(true);
            } else {
                view.showErrorMessage("Password or email invalid");
            }
        }
    }

    class CancelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}


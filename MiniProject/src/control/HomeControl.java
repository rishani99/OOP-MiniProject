package control;

import model.DatabaseConnection;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeControl {

    private static HomeControl HomeControl;
    private HomeControl view;

    public HomeControl(HomeControl view) {
        this.view = view;
        this.view.HomeView(new HomeListener());
        this.view.addLogout(new LogoutListener());
        this.view.addAddStudentListener(new AddStudentListener());
        this.view.addShowStudentListener(new ShowStudentListener());
        this.view.addSettingsListener(new SettingsListener());
        this.view.addShowAdminListener(new ShowAdminListener());
        this.view.addRefreshListener(new RefreshListener());
        this.view.addAddAdminListener(new AddAdminListener());
        this.view.addAboutListener(new AboutListener());
    }

    private HomeControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void HomeView(HomeListener homeListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addLogout(LogoutListener logoutListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addAddStudentListener(AddStudentListener addStudentListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addShowStudentListener(ShowStudentListener showStudentListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addSettingsListener(SettingsListener settingsListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addShowAdminListener(ShowAdminListener showAdminListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addRefreshListener(RefreshListener refreshListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addAddAdminListener(AddAdminListener addAdminListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addAboutListener(AboutListener aboutListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class HomeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            new HomeControl(new HomeControl()).view.setVisible(true);
        }
    }

    class LogoutListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Login code here
        }
    }

    class AddStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Add student view logic here
        }
    }

    class ShowStudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Show student view logic here
        }
    }

    class SettingsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Settings view logic here
        }
    }

    class ShowAdminListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Show admin view logic here
        }
    }

    class RefreshListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Refresh logic here
        }
    }

    class AddAdminListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // Add admin view logic here
        }
    }

    class AboutListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            // About view logic here
        }
    }

    public static void main(String[] args) {
        HomeControl = new HomeControl();
        //new HomeControl(view);
       // view.setVisible(true);
    }
}

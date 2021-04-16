package View.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.StudioManager;
import View.MainView;

public class LoginView extends JFrame  {

    public LoginView() {


        super("Studio Owner");

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);
        JTextField rehearsalName = new JTextField(12);
        JTextField rehearsalEmail = new JTextField(12);
        JTextField ownerName = new JTextField(12);
        JTextField password = new JTextField(12);
        JButton login = new JButton("Login");
        centerPane.add(new Label("Studio Name"));
        centerPane.add(rehearsalName);
        centerPane.add(new Label("Studio Email"));
        centerPane.add(rehearsalEmail);
        centerPane.add(new Label("Password"));
        centerPane.add(password);
        centerPane.add(login);

        setVisible(true);
    }
}

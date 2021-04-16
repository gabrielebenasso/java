package View;

import Controller.StudioManager;
import View.Login.ChoiceLoginView;
import View.Login.LoginView;
import View.SignIn.ChoiceSignInView;
import View.SignIn.SignInView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private StudioManager studioManager;
    private LoginView loginView;
    private SignInView signInView;
    private ChoiceLoginView choiceLoginView;
    private ChoiceSignInView choiceSignInView;

    public MainView(StudioManager studioManager) {

        super("Welcome!");

        this.studioManager = studioManager;

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPane = new JPanel(new BorderLayout());
        setContentPane(mainPane);

        setSize(500, 500);

        JPanel topPane = new JPanel();
        mainPane.add(topPane, BorderLayout.NORTH);

        JButton loginButton = new JButton("Login");
        JButton signInButton = new JButton("Sign In");
        topPane.add(loginButton);
        topPane.add(signInButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChoiceLoginView choiceLoginView = new ChoiceLoginView(studioManager);
                studioManager.setChoiceLoginView(choiceLoginView);
            }
        });
        signInButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               ChoiceSignInView choiceSignInView = new ChoiceSignInView(studioManager);
               studioManager.setChoiceSignInView(choiceSignInView);
           }
       });
       setVisible(true);
    }
}

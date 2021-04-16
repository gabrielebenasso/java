package View.Login;

import Controller.StudioManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceLoginView extends JFrame{

    private StudioManager studioManager;


    public ChoiceLoginView(StudioManager studioManager){


        super("Login");
        this.studioManager = studioManager;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel topPane = new JPanel();
        basePane.add(topPane, BorderLayout.NORTH);
        JButton user = new JButton("User");
        JButton studioOwner = new JButton("Studio Owner");
        topPane.add(user);
        topPane.add(studioOwner);

        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserLoginView userLoginView = new UserLoginView();
                studioManager.setUserLoginView(userLoginView);
            }
        });
        studioOwner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginView loginView = new LoginView();
                studioManager.setLoginView(loginView);
            }
        });

        setVisible(true);
    }
}

package View.SignIn;

import Controller.StudioManager;
import View.SignIn.SignInView;
import View.SignIn.UserSignInView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceSignInView extends JFrame {

    private StudioManager studioManager;

    public ChoiceSignInView(StudioManager studioManager){
        super("SignIn");
        this.studioManager = studioManager;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500,500);
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
                UserSignInView userSignInView = new UserSignInView();
                studioManager.setUserSignInView(userSignInView);
            }
        });
        studioOwner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignInView signInView = new SignInView(studioManager);
                studioManager.setSignInView(signInView);
            }
        });

        setVisible(true);
    }

}

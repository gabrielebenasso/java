package View.SignIn;

import Controller.StudioManager;
import Model.Studio;
import View.Owner.StudioView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SignInView extends JFrame {

    private ArrayList<Studio> studios;
    private DefaultListModel<Studio> studiosListModel;
    private Studio studio;

    public SignInView(StudioManager studioManager) {
        super("Sign In View");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);
        JTextField studioName = new JTextField(12);
        JTextField studioEmail = new JTextField(12);
        JTextField ownerName = new JTextField(12);
        JTextField password = new JTextField(12);
        JTextField studiosNumber = new JTextField(12);
        JButton RegisterRehearsalStudios = new JButton("Register Studios Name");
        JButton signIn = new JButton("Sign In");
        centerPane.add(new Label("Studio Name"));
        centerPane.add(studioName);
        centerPane.add(new Label("Studio Email"));
        centerPane.add(studioEmail);
        centerPane.add(new Label("Your Name"));
        centerPane.add(ownerName);
        centerPane.add(new Label("Studios Number"));
        centerPane.add(studiosNumber);
        centerPane.add(new Label("Password"));
        centerPane.add(password);
        centerPane.add(signIn);

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studioManager.addStudio(new Studio(
                        studioName.getText(),
                        ownerName.getText(),
                        Integer.parseInt(studiosNumber.getText()),
                        studioEmail.getText()
                ));

                StudioView studioView = new StudioView(studioManager);
                studioManager.setStudioView(studioView);
            }
        });

        setVisible(true);
    }

}

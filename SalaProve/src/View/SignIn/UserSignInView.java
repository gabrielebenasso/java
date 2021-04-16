package View.SignIn;

import javax.swing.*;
import java.awt.*;

public class UserSignInView extends JFrame {

    public UserSignInView(){

        super("User");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);
        JTextField bandName = new JTextField(12);
        JTextField components = new JTextField(12);
        JTextField musicGenre = new JTextField(12);
        JTextField password = new JTextField(12);
        JButton signIn = new JButton("Sign In");
        centerPane.add(new Label("Band Name"));
        centerPane.add(bandName);
        centerPane.add(new Label("Components"));
        centerPane.add(components);
        centerPane.add(new Label("Music Genre"));
        centerPane.add(musicGenre);
        centerPane.add(new Label("Password"));
        centerPane.add(password);
        centerPane.add(signIn);

        setVisible(true);
    }

}

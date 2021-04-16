package View.Login;

import javax.swing.*;
import java.awt.*;

public class UserLoginView extends JFrame {

    public UserLoginView(){

        super("User");

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);
        JTextField bandName = new JTextField(12);
        JTextField password = new JTextField(12);
        JButton login = new JButton("Login");
        centerPane.add(new Label("Band Name"));
        centerPane.add(bandName);
        centerPane.add(new Label(" Password"));
        centerPane.add(password);
        centerPane.add(login);

        setVisible(true);
    }
}

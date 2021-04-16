package View.Owner;

import Model.RehearsalStudio;

import javax.swing.*;
import java.awt.*;

public class RehearsalView extends JFrame {
    public RehearsalView(RehearsalStudio rehearsalStudio){
        super("Your Studio");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel topPane = new JPanel();
        basePane.add(topPane, BorderLayout.NORTH);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);


    }
}

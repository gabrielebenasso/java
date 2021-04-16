package View.User;

import Controller.StudioManager;
import Model.Studio;
import View.Owner.StudioView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserView extends JFrame {

    private ArrayList<Studio> studios;
    private DefaultListModel<Studio> studiosListModel;
    private Studio studio;
    private StudioManager studioManager;
    private ArrayList<JButton> studioButtons;
    private DefaultListModel<JButton> jButtonDefaultListModel;



    public UserView(StudioManager studioManager){
        super("User View");
        this.studioManager = studioManager;


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);
        JPanel topPane = new JPanel();
        basePane.add(topPane, BorderLayout.NORTH);
        JButton studioButton = new JButton(studio.getName());


        studioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                StudioView studioView = new StudioView(studioManager);
                studioManager.setStudioView(studioView);
            }
        });

        setVisible(true);
    }

    public void onUpdateStudios(ArrayList<Studio> studios){
        studiosListModel.clear();
        for(Studio studio : studios){
            studiosListModel.addElement(studio);
        }
    }
    public void addStudioButton(ArrayList<JButton> studioButtons, ArrayList<Studio> studios){
        for(Studio studio : studios){
            for(JButton studioButton : studioButtons){
                studiosListModel.addElement(studio);
                jButtonDefaultListModel.addElement(studioButton);
            }
        }
    }


}





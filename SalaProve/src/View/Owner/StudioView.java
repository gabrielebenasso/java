package View.Owner;

import Controller.StudioManager;
import Model.RehearsalStudio;
import Model.Studio;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudioView extends JFrame{


    private ArrayList<RehearsalStudio> rehearsalStudios;
    private DefaultListModel<RehearsalStudio> rehearsalStudioListModel;
    private RehearsalStudio rehearsalStudio;
    private StudioManager studioManager;
    private DefaultListModel<Studio> studiosListModel;
    private Studio studio;
    private ArrayList<Studio> studios;


    public StudioView(StudioManager studioManager){
        super("Studio View");
        this.studioManager = studioManager;
        this.studio = studio;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);
        JButton addRehearsalStudio = new JButton("Add Studio");
        centerPane.add(addRehearsalStudio);

        addRehearsalStudio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RehearsalView rehearsalView = new RehearsalView(rehearsalStudio);
                studioManager.setRehearsalView(rehearsalView);
            }
        });


        setVisible(true);
    }


    }


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
        this.rehearsalStudio = rehearsalStudio;
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
                JPanel dialogPane = new JPanel();
                dialogPane.add(new Label("Rehearsal Studio Name"));
                JTextField rehearsalName = new JTextField(4);
                dialogPane.add(rehearsalName);

                dialogPane.add(new Label("Max Components"));
                JTextField maxComponetsField = new JTextField();
                dialogPane.add(maxComponetsField);

                dialogPane.add(new Label("Disponibilità"));
                JTextField disponibilitàField = new JTextField();
                dialogPane.add(disponibilitàField);

                dialogPane.add(new Label("Descrizione"));
                JTextField descriptionField = new JTextField();
                dialogPane.add(descriptionField);

                studioManager.addRehearsalStudio(new RehearsalStudio(
                        rehearsalName.getText(),
                        Integer.parseInt(maxComponetsField.getText()),
                        disponibilitàField.getText(),
                        descriptionField.getText()
                ));

            }
        });


        setVisible(true);
    }
    public void onUpdateRehearalStudios(ArrayList<RehearsalStudio> rehearsalStudios){
        rehearsalStudioListModel.clear();
        for(RehearsalStudio rehearsalStudio : rehearsalStudios){
            rehearsalStudioListModel.addElement(rehearsalStudio);
        }
    }
}

package View.Owner;

import Controller.StudioManager;
import Model.RehearsalStudio;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RehearsalView extends JFrame {

    private JLabel rehearsalNome;
    private JLabel maxComponents;
    private JLabel description;
    private DefaultListModel<RehearsalStudio> rehearsalListModel;
    private ArrayList<RehearsalStudio> rehearsalStudios;
    private StudioManager studioManager;
    private RehearsalStudio rehearsalStudio;

    public RehearsalView(RehearsalStudio rehearsalStudio){
        super("Your Studio");
        this.rehearsalStudio = rehearsalStudio;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);
        JPanel topPane = new JPanel();
        basePane.add(topPane, BorderLayout.NORTH);
        JPanel centerPane = new JPanel();
        basePane.add(centerPane, BorderLayout.CENTER);

        JPanel dialogPane = new JPanel();
        dialogPane.add(new Label("Rehearsal Studio Name"));
        JTextField rehearsalName = new JTextField(12);
        dialogPane.add(rehearsalName);

        dialogPane.add(new Label("Max Components"));
        JTextField maxComponetsField = new JTextField(4);
        dialogPane.add(maxComponetsField);

        dialogPane.add(new Label("Disponibilità"));
        JTextField disponibilitàField = new JTextField(12);
        dialogPane.add(disponibilitàField);

        dialogPane.add(new Label("Descrizione"));
        JTextField descriptionField = new JTextField(48);
        dialogPane.add(descriptionField);

        JOptionPane.showMessageDialog(
                null,
                dialogPane,
                "Set Rehearsal Studio Data",
                JOptionPane.PLAIN_MESSAGE
        );

        if (rehearsalName.getText().isEmpty()
                || maxComponetsField.getText().isEmpty()
                || disponibilitàField.getText().isEmpty()
                || descriptionField.getText().isEmpty()

        ) {
            JOptionPane.showMessageDialog(
                    null,
                    "Dati inseriti non validiti",
                    "Errore inserimento dati",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        rehearsalStudio.addRehearsalStudio(new RehearsalStudio(
                rehearsalName.getText(),
                Integer.parseInt(maxComponetsField.getText()),
                disponibilitàField.getText(),
                descriptionField.getText()
        ));

        rehearsalStudio.setNome(rehearsalName.getText());
        rehearsalStudio.setMaxComponenti(Integer.parseInt(maxComponetsField.getText()));
        rehearsalStudio.setDisponibilità(disponibilitàField.getText());
        rehearsalStudio.setDescrizione(descriptionField.getText());

        rehearsalNome = new JLabel(rehearsalStudio.getNome());
        maxComponents = new JLabel("Max Components " + rehearsalStudio.getMaxComponenti());
        description = new JLabel(rehearsalStudio.getDescrizione());

        topPane.add(rehearsalNome);
        topPane.add(maxComponents);
        topPane.add(description);

        JButton addRehearsalStudio = new JButton("Add Rehearsal Studio");
        topPane.add(addRehearsalStudio);
    }
    public void onUpdateRehearsalStudios(ArrayList<RehearsalStudio> rehearsalStudios){
        rehearsalListModel.clear();
        for(RehearsalStudio rehearsalStudio : rehearsalStudios){
            rehearsalListModel.addElement(rehearsalStudio);
        }
}
}

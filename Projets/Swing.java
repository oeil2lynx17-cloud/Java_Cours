import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SaisirQuestionnaire {

    // 1. Déclarer les composants
    private JFrame fenetre = new JFrame("Saisie questionnaire");
    private JLabel labelId = new JLabel("Identifiant : ");
    private JLabel labelReponse = new JLabel("Réponse : ");
    private JTextField champId = new JTextField(20);
    private JTextField champReponse = new JTextField(20);
    private JButton boutonEnregistrer = new JButton("Enregistrer");
    private JButton boutonAnnuler = new JButton("Annuler");
    private JButton boutonQuitter = new JButton("Quitter");


    public SaisirQuestionnaire() {

        // 2. Récupérer le conteneur principal
        Container c = fenetre.getContentPane();
        c.setLayout(new BorderLayout());

        // Le formulaire
        JPanel formulaire = new JPanel(new GridLayout(2, 2));
        formulaire.add(labelId);
        formulaire.add(champId);
        formulaire.add(labelReponse);
        formulaire.add(champReponse);

        // Les boutons
        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(boutonEnregistrer);
        boutons.add(boutonAnnuler);
        boutons.add(boutonQuitter);

        // Placement
        c.add(formulaire, BorderLayout.NORTH);
        c.add(boutons, BorderLayout.SOUTH);

        boutonQuitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fenetre.dispose();
            }
        });

        boutonAnnuler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                champId.setText("");
                champReponse.setText("");
            }
        });

        boutonEnregistrer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = champId.getText();
                System.out.println("Enregistré : " + id);
            }
        });

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.pack();
        fenetre.setVisible(true);
    }
}





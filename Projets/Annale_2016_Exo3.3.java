import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class MesuresSwing {

    // 1. Déclarer les composants
    private JFrame fenetre = new JFrame("MesuresSwing");
    private JLabel labelDate = new JLabel("Date : ");
    private JLabel labelMesure = new JLabel("Temperature : ");
    private JTextField champDate = new JTextField(20);
    private JTextField champMesure = new JTextField(20);
    private JButton boutonValider = new JButton("Valider");
    private JButton boutonQuitter = new JButton("Quitter");
    private Map<String, Double> mesures = new HashMap<>();

    public MesuresSwing() {
        Container c = fenetre.getContentPane();
        c.setLayout(new BorderLayout());

        // Le formulaire
        JPanel mesure = new JPanel(new GridLayout(1, 4));
        mesure.add(labelDate);
        mesure.add(champDate);
        mesure.add(labelMesure);
        mesure.add(champMesure);

        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(boutonValider);
        boutons.add(boutonQuitter);

        c.add(mesure, BorderLayout.NORTH);
        c.add(boutons, BorderLayout.SOUTH);

        boutonQuitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    GenerateurXML gen = new GenerateurXML();
                    gen.ecrire(mesures, "mesures", new FileOutputStream("mesures.xml"));

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                fenetre.dispose();
            }
        });

        boutonValider.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String date = champDate.getText();
                String valeur = champMesure.getText();
                mesures.put(date, Double.parseDouble(valeur));
                System.out.println("date : " + date + "Mesure : " + valeur);
            }
        });
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.pack();
        fenetre.setVisible(true);
    }
}
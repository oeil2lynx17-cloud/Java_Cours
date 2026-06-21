import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MesuresSwing {

// 1. Déclarer les composants
    private JFrame fenetre = new JFrame("MesuresSwing");
    private JLabel labelDate = new JLabel("Date : ");
    private JLabel labelTemperature = new JLabel("Temperature : ");
    private JTextField champDate= new JTextField(20);
    private JTextField champTemperature = new JTextField(20);
    private JButton boutonValider = new JButton("Valider");
    private JButton boutonQuitter = new JButton("Quitter");

    public MesuresSwing() {
        Container c = fenetre.getContentPane();
        c.setLayout(new BorderLayout());

        // Le formulaire
        JPanel mesure = new JPanel(new GridLayout(1, 4));
        mesure.add(labelDate);
        mesure.add(champDate);
        mesure.add(labelTemperature);
        mesure.add(champTemperature);

        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(boutonValider);
        boutons.add(boutonQuitter);

        c.add(mesure,BorderLayout.NORTH);
        c.add(boutons,BorderLayout.SOUTH);

        boutonQuitter.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                                                        fenetre.dispose();
                                                    }
        });

        boutonValider.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                String date = champDate.getText();
                String valeur = champTemperature.getText();
                System.out.println("date : " + date + "temperature : " + valeur);}
        }
    });
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.pack();
        fenetre.setVisible(true);
}


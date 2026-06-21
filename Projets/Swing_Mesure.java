import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MesureSwing {
    private JFrame fenetre = new JFrame("MesuresSwing");
    private JTextField champDate = new JTextField(20);
    private JTextField champMesure = new JTextField(20);
    private JLabel labelDate = new JLabel("Date : ");
    private JLabel labelMesure = new JLabel("Mesure : ");
    private JButton boutonValider = new JButton("Valider");
    private JButton boutonQuitter = new JButton("Quitter");

    public MesureSwing() {
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

        c.add(mesure,BorderLayout.NORTH);
        c.add(boutons,BorderLayout.SOUTH);

        boutonQuitter.addActionListener(new

    ActionListener() {
        public void actionPerformed (ActionEvent e){
            fenetre.dispose();
        }
    });

        boutonValider.addActionListener(new

    ActionListener() {
        public void actionPerformed (ActionEvent e){
            String date = champDate.getText();
            String valeur = champMesure.getText();
            System.out.println(date + " : " + valeur);
        }
    });

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.pack();
        fenetre.setVisible(true);
    }
}

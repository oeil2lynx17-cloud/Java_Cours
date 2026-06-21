import javax.swing.*; //import javax.swing_*; ERREUR
import java.awt.*;
import java.awt.event.*;

public class ContactSwing {
    private JFrame fenetre = new JFrame("Ajout contact");
    private JLabel labelNom = new JLabel("Nom : ");
    private JLabel labelTelephone = new JLabel("Téléphone");
    private JTextField champNom = new JTextField(20); //private JTextfield champNom = new JTextfield(20); ERREUR
    private JTextField champTelephone = new JTextField(20); //private JTextfield champTelephone = new JTextfield(20); ERREUR
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonFermer = new JButton("Fermer");

    public ContactSwing() { //public Contact Swing() { ERREUR
        Container c = fenetre.getContentPane();
        c.setLayout(new BorderLayout()); //c.setlayout(new BorderLayout()); ERREUR

        //formulaire.add(labelNom); ERREUR
        //formulaire.add(labelTelephone); ERREUR
        //formulaire.add(champNom); ERREUR
        //formulaire.add(champTelephone); ERREUR

        JPanel formulaire = new JPanel(new GridLayout(2,2));
        formulaire.add(labelNom);
        formulaire.add(champNom);
        formulaire.add(labelTelephone);
        formulaire.add(champTelephone);

        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(boutonAjouter);
        boutons.add(boutonFermer);

        c.add(formulaire, BorderLayout.NORTH);
        c.add(boutons, BorderLayout.SOUTH);

        //boutonAjouter.addActionListener(new ActionListener() {
        //    public void actionPerformed(ActionEvent e) {}
        //boutonFermer.addActionListener(new ActionListener() {
        //        public void actionPerformed(ActionEvent e) {}
        //));
        // ERREUR 1 : Il manque la fermeture du premier addActionListener (});) avant de commencer le second.
        // ERREUR 2 : Chaque addActionListener doit être complet et fermé avant le suivant.
        // ERREUR 3 : Oublie des ActionLiteners, il manque le contenu demandé par la consigne.
        boutonAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = champNom.getText();
                String telephone = champTelephone.getText();
                System.out.println("Contact ajouté : " + nom + " - " + telephone);
            }
        });

        boutonFermer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fenetre.dispose();
            }
        });

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fenetre.setDefaultCLoseOperation(JFrame.EXIT_ON_CLOSE); ERREUR
        fenetre.pack();
        fenetre.setVisible(true);
    }
    public static void main(String[] a) { new ContactSwing(); }
}
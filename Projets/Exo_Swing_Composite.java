import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public interface Tache { String getNom(); int getCout(); }
public class TacheSwing {

    private TacheComplexe tacheProjet;
    private JFrame fenetre = new JFrame("Gestion de tâches");
    private JLabel labelNom = new JLabel("Nom : ");
    private JLabel labelCout = new JLabel("Coût : ");
    private JTextField champNom = new JTextField(20);
    private JTextField champCout = new JTextField(20);
    private JButton boutonAjouter = new JButton("Ajouter");
    private JButton boutonAfficher = new JButton("Afficher coût total");

    public TacheSwing(TacheComplexe tacheProjet) {
        this.tacheProjet = tacheProjet;
        Container c = fenetre.getContentPane();
        c.setLayout(new BorderLayout());

        JPanel formulaire = new JPanel(new GridLayout(2,2));
        formulaire.add(labelNom);
        formulaire.add(champNom);
        formulaire.add(labelCout);
        formulaire.add(champCout);

        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(boutonAjouter);
        boutons.add(boutonAfficher);

        c.add(formulaire, BorderLayout.NORTH);
        c.add(boutons, BorderLayout.SOUTH);

        boutonAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = champNom.getText();
                int cout = Integer.parseInt(champCout.getText());
                tacheProjet.ajouter(new TacheElementaire(nom, cout));
            }
        });

        boutonAfficher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Coût total : " + tacheProjet.getCout());
            }
        });

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fenetre.setDefaultCLoseOperation(JFrame.EXIT_ON_CLOSE); ERREUR
        fenetre.pack();
        fenetre.setVisible(true);
    }
    public class TacheElementaire implements Tache {
        private String nom; private int cout;
        public TacheElementaire(String n, int c){nom=n;cout=c;}
        public String getNom(){return nom;}
        public int getCout(){return cout;}
    }
    public class TacheComplexe implements Tache {
        private String nom;
        private List<Tache> sousTaches = new ArrayList<>();
        public TacheComplexe(String n){nom=n;}
        public void ajouter(Tache t){ sousTaches.add(t); }
        public String getNom(){return nom;}
        public int getCout() {
            int total = 0;
            for (Tache t : sousTaches) total += t.getCout();
            return total;
        }
    }
    public static void main(String[] a) {
        TacheComplexe projet = new TacheComplexe("Mon projet");
        new TacheSwing(projet);
    }
}
import java.util.ArrayList;
import java.util.List;

// L'interface commune
public interface Tache {
    String getNom();
    int getCout();
}

// Tâche simple
public class TacheElementaire implements Tache {
    private String nom;
    private int cout;

    public TacheElementaire(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }

    public String getNom() { return nom; }
    public int getCout() { return cout; }
}

// Tâche complexe — contient d'autres tâches
public class TacheComplexe implements Tache {
    private String nom;
    private List<Tache> sousTaches = new ArrayList<>();

    public TacheComplexe(String nom) {
        this.nom = nom;
    }

    public void ajouter(Tache t) {
        sousTaches.add(t);
    }

    public String getNom() {
        return nom;
    }

    // Le coût = somme des coûts des sous-tâches
    public int getCout() {
        int total = 0;
        for (Tache t : sousTaches) {
            total += t.getCout();
        }
        return total;
    }
}
    public class Main {
        public static void main(String[] args) {
        TacheComplexe tA = new TacheComplexe("A");
        tA.ajouter(new TacheElementaire("A1", 10));
        tA.ajouter(new TacheElementaire("A2", 20));
        System.out.println(tA.getCout());
    }
}

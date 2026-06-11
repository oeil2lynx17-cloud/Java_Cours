/**
 * Contrat (interface) pour tout être capable de voler.
 *
 * <p>Toute classe qui l'implémente devra écrire la méthode {@link #voler()}.</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */

public interface Volatile {
    /**
     * Action de voler (sans corps : c'est à la classe de l'écrire).
     */
    void voler();
}
/**
 * Classe parent représentant un animal, défini par son espèce.
 */

public class Animal {

    String espece;
    /**
     * Construit un animal.
     *
     * @param espece l'espèce de l'animal
     */

    Animal(String espece) {
        this.espece = espece;
    }
    /**
     * Affiche dans la console que l'animal est en train de manger.
     */

    void manger() {

        System.out.println(espece + " mange.");
    }
}
/**
 * Classe représentant un aigle.
 *
 * <p>Hérite de {@link Animal} et implémente l'interface {@link Volatile}.
 * Elle ajoute un nom, la méthode héritée d'interface {@link #voler()},
 * et une méthode propre {@link #crier()}.</p>
 */

public class Aigle extends Animal implements Volatile {

    String nom;
    /**
     * Construit un aigle.
     *
     * @param nom    le nom de l'aigle
     * @param espece l'espèce de l'aigle (transmise à la classe parent)
     */

    Aigle (String nom, String espece) {
        super(espece);
        this.nom = nom;
    }
    /**
     * Fait voler l'aigle (méthode imposée par l'interface Volatile).
     */

    public void voler() {
        System.out.println(espece + " vole dans les airs !");
    }
    /**
     * Fait crier l'aigle (méthode propre à la classe Aigle).
     */
    void crier() {
        System.out.println(espece + " jacasse !");
    }
}
/**
 * Programme de démonstration des interfaces (Leçon 15).
 *
 * <p>Crée un {@link Aigle} et appelle ses trois méthodes : une héritée
 * d'{@link Animal}, une venant de l'interface {@link Volatile}, et une
 * propre à l'aigle.</p>
 */

public class Main {
    /**
     * Point d'entrée du programme.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */

    public static void main(String[] args) {

        Aigle a1 = new Aigle("Pygargue", "Aigle royal");

        a1.manger();    // hérité de animal
        a1.voler();     // vient de l'interface Volatile
        a1.crier();     // propre à Aigle
    }
}
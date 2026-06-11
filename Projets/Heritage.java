/**
 * Classe parent représentant un animal, avec un nom et un âge.
 *
 * <p>Sert de base à l'héritage (Leçon 14) : les classes Chien et Chat
 * en héritent.</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */

public class Animal {

    String nom;
    int age;
    /**
     * Construit un animal avec son nom et son âge.
     *
     * @param nom le nom de l'animal
     * @param age l'âge de l'animal en années
     */

    Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    /**
     * Affiche dans la console que l'animal est en train de manger.
     */

    void manger() {
        System.out.println(nom + " mange.");
    }
}
/**
 * Classe enfant représentant un chat.
 *
 * <p>Hérite de {@link Animal} (nom, age, manger) et ajoute la couleur
 * ainsi que la méthode {@link #miauler()}.</p>
 */

public class Chat extends Animal {

    String couleur;
    /**
     * Construit un chat.
     *
     * @param nom     le nom du chat
     * @param age     l'âge du chat en années
     * @param couleur la couleur (ou race) du chat
     */


    Chat(String nom, int age, String couleur) {
        super(nom, age);
        this.couleur = couleur;
    }
    /**
     * Affiche dans la console le miaulement du chat.
     */


    void miauler() {
        System.out.println(nom + " miaule : Miaou !");
    }
}
/**
 * Classe enfant représentant un chien.
 *
 * <p>Hérite de {@link Animal} (nom, age, manger) et ajoute la race
 * ainsi que la méthode {@link #aboyer()}.</p>
 */

public class Chien extends Animal {

    String race;
    /**
     * Construit un chien.
     *
     * @param nom  le nom du chien
     * @param age  l'âge du chien en années
     * @param race la race du chien
     */


    Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }

    /**
     * Affiche dans la console l'aboiement du chien.
     */

    void aboyer() {
        System.out.println(nom + " aboie : Woof !");
    }
}
/**
 * Programme de démonstration de l'héritage (Leçon 14).
 *
 * <p>Crée un {@link Chien} et un {@link Chat}, puis appelle leurs méthodes
 * héritées et propres, afin d'illustrer le fonctionnement de l'héritage.</p>
 */

public class Main {
    /**
     * Point d'entrée du programme.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */

    public static void main(String[] args) {

        Chien c = new Chien("Patxi", 5, "Berger Belge");
        Chat c = new Chat("Lucifer"), 10, "Maine Coon");

        c.manger();  // hérité de Animal
        c.aboyer();  // propre à Chien
        c.miauler(); // propre à Chat

        System.out.println("Nom : " + c.nom);   // hérité de Animal
        System.out.println("Race : " + c.race); // propre à Chien
        System.out.orintln("Couleur : " + c.couleur); // propre à chat
    }
}
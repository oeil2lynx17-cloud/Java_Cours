/**
 * Représente le moteur d'une voiture, défini par son type et sa puissance.
 *
 * <p>Utilisé comme attribut de la classe {@link Voiture} pour illustrer
 * la relation d'association « A » (Leçon 17).</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */

public class Moteur {

    String type;
    int puissance;

    /**
     * Construit un moteur.
     *
     * @param type      le type / la description du moteur
     * @param puissance la puissance du moteur en chevaux
     */

    Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }
    /**
     * Affiche dans la console le type et la puissance du moteur.
     */

    void afficher() {
        System.out.println("Moteur : " + type + " - " + puissance + " chevaux.");
    }
}
/**
 * Représente une voiture, définie par sa marque et son moteur.
 *
 * <p>Illustre la relation « A » : une Voiture <b>a</b> un {@link Moteur}
 * (association via un attribut objet, Leçon 17).</p>
 */

public class Voiture {

    String marque;
    Moteur moteur;
    /**
     * Construit une voiture avec sa marque et son moteur.
     *
     * @param marque la marque de la voiture
     * @param moteur le moteur de la voiture
     */

    Voiture(String marque, Moteur moteur) {
        this.marque = marque;
        this.moteur = moteur;
    }
    /**
     * Affiche la marque de la voiture, puis délègue l'affichage des
     * caractéristiques du moteur à {@link Moteur#afficher()}.
     */


    void afficher() {
        System.out.println("Ma voiture est de marque : " + marque);
        moteur.afficher();
    }
}

/**
 * Programme de démonstration des relations entre classes (Leçon 17).
 *
 * <p>Crée un {@link Moteur}, puis une {@link Voiture} qui possède ce moteur,
 * et affiche l'ensemble pour illustrer la relation d'association « A ».</p>
 */
public class Main {
    /**
     * Point d'entrée du programme.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {

        Moteur mo = new Moteur("moteur atmosphérique de 5,2l", 640);

        Voiture v1 = new Voiture("Lamborghini Huracan Tecnica", mo);

        v1.afficher();
    }
}

/**
 * Représente une voiture définie par sa marque, sa couleur
 * et sa vitesse maximale.
 *
 * <p>Exemple d'utilisation d'une classe avec constructeur (Leçon 13).</p>
 *
 * @author  Lucas
 * @version 1.0
 */

public class Voiture {

    String marque;
    String couleur;
    int vitesse;

    /**
     * Construit une voiture avec toutes ses caractéristiques.
     *
     * @param marque  la marque de la voiture
     * @param couleur la couleur de la voiture
     * @param vitesse la vitesse maximale en km/h
     */
    Voiture(String marque, String couleur, int vitesse) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = vitesse;
    }
    /**
     * Affiche dans la console les caractéristiques de la voiture
     * (marque, couleur et vitesse maximale).
     */

    void afficher() {
        System.out.println("Voiture :  " + marque + " - Couleur : " + couleur + " - Vitesse max :  " + vitesse + " km/h.");
    }
}
/**
 * Programme de démonstration de la classe {@link Voiture} (Leçon 13 — Constructeurs).
 *
 * <p>Crée deux voitures à l'aide du constructeur, puis affiche
 * leurs caractéristiques.</p>
 *
 * @author  Lucas
 * @version 1.0
 */
public class Main {
    /**
     * Point d'entrée du programme : crée deux objets {@link Voiture}
     * et appelle leur méthode {@link Voiture#afficher()}.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */

    public static void main(String[] args) {

        Voiture v1 = new Voiture("Ferrari", "Rouge : Rosso Corsa", 320);
        Voiture v2 = new Voiture("Lamborghini", "Jaune : Giallo Evros", 325);

        v1.afficher();
        v2.afficher();
    }
}
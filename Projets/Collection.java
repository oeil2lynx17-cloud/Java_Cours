import java.util.ArrayList;
import java.util.Scanner;
/**
 * Programme d'exercices sur les Collections (Leçon 18).
 *
 * <p>Il illustre l'utilisation d'une {@link ArrayList} à travers deux exercices :</p>
 * <ul>
 *   <li>Q4 — gérer une liste de voitures : ajout, parcours, suppression, taille</li>
 *   <li>Q5 — saisir 5 nombres au clavier et calculer leur somme</li>
 * </ul>
 *
 * <p>Compétences mobilisées : ArrayList (Leçon 18), boucle for (Leçon 6),
 * méthode avec paramètre et retour (Leçons 8-9), Scanner (Leçon 11).</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */

public class Main {
    /**
     * Calcule la somme de tous les entiers contenus dans une liste.
     *
     * @param list la liste d'entiers à additionner
     * @return la somme de tous les éléments (0 si la liste est vide)
     */

    public static int somme(ArrayList<Integer> list) {
        int somme = 0;
        for (int i = 0; i < list.size(); i++) {
            somme += list.get(i);
        }
        return somme;
    }
    /**
     * Point d'entrée du programme : exécute les exercices Q4 et Q5.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {

        // Q4 — ArrayList de voitures
        ArrayList<String> voitures = new ArrayList<>();
        voitures.add("Lamborghini Huracan");
        voitures.add("Aston Martin DB9");
        voitures.add("Ford Mustang Shelby");
        voitures.add("Ferrari 488");

        for (int i = 0; i < voitures.size(); i++) {
            System.out.println(voitures.get(i));
        }

        voitures.remove(1);
        System.out.println("Après suppression : " + voitures.size());

        // Q5 — ArrayList de nombres
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nombres = new ArrayList<>();

        System.out.println("Choisis 5 nombres :");
        for (int i = 0; i < 5; i++) {
            nombres.add(input.nextInt());
        }

        System.out.println("La somme est : " + somme(nombres));
    }
}
import java.util.Scanner;
/**
 * Programme de démonstration de la gestion des exceptions (Leçon 16).
 *
 * <p>Demande un nombre à l'utilisateur, calcule 100 divisé par ce nombre,
 * et gère proprement le cas de la division par zéro grâce à un bloc
 * try / catch / finally.</p>
 *
 * <p>Compétences mobilisées : exceptions try/catch/finally (Leçon 16),
 * Scanner (Leçon 11).</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */

public class Main {
    /**
     * Point d'entrée du programme.
     *
     * <p>Lit un entier au clavier puis tente de calculer 100 / nombre :</p>
     * <ul>
     *   <li>si le nombre est valide, affiche le résultat de la division ;</li>
     *   <li>si le nombre est 0, l'{@code ArithmeticException} est attrapée
     *       et un message d'erreur s'affiche ;</li>
     *   <li>dans tous les cas, le bloc {@code finally} s'exécute.</li>
     * </ul>
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tape un nombre :");
        int nombre = scanner.nextInt();

        try {
            int resultat = 100 / nombre;
            System.out.println("100 / " + nombre + " = " + resultat);

        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro !");
        } finally {
            System.out.println("Fin du programme");
        }
    }
}
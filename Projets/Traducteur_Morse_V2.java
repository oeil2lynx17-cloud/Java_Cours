import java.util.Scanner;
/**
 * Programme TraducteurMorse — convertit une lettre saisie au clavier
 * en son code Morse international.
 *
 * <p>L'utilisateur tape une lettre, et le programme affiche le code
 * Morse correspondant (ou "?" si le caractère n'est pas une lettre A–Z).</p>
 *
 * <p>Compétences mobilisées : méthode avec paramètre et retour (Leçons 8-9),
 * conditions if / else if (Leçon 5), type char, et Scanner (Leçon 11).</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */
public class TraducteurMorse {
    /**
     * Traduit une lettre majuscule en code Morse.
     *
     * @param lettre la lettre à traduire (attendue de 'A' à 'Z')
     * @return le code Morse correspondant sous forme de chaîne de caractères,
     *         ou "?" si le caractère n'est pas une lettre reconnue
     */

    static String traduire(char lettre) {
        if (lettre == 'A') {
            return ".-";
        } else if (lettre == 'B') {
            return "-...";
        } else if (lettre == 'C') {
            return "-.-.";
        } else if (lettre == 'D') {
            return "-..";
        } else if (lettre == 'E') {
            return ".";
        } else if (lettre == 'F') {
            return "..-.";
        } else if (lettre == 'G') {
            return "--.";
        } else if (lettre == 'H') {
            return "....";
        } else if (lettre == 'I') {
            return "..";
        } else if (lettre == 'J') {
            return ".---";
        } else if (lettre == 'K') {
            return "-.-";
        } else if (lettre == 'L') {
            return ".-..";
        } else if (lettre == 'M') {
            return "--";
        } else if (lettre == 'N') {
            return "-.";
        } else if (lettre == 'O') {
            return "---";
        } else if (lettre == 'P') {
            return ".--.";
        } else if (lettre == 'Q') {
            return "--.-";
        } else if (lettre == 'R') {
            return ".-.";
        } else if (lettre == 'S') {
            return "...";
        } else if (lettre == 'T') {
            return "-";
        } else if (lettre == 'U') {
            return "..-";
        } else if (lettre == 'V') {
            return "...-";
        } else if (lettre == 'W') {
            return ".--";
        } else if (lettre == 'X') {
            return "-..-";
        } else if (lettre == 'Y') {
            return "-.--";
        } else if (lettre == 'Z') {
            return "--..";
        } else {
            return "?";
        }
    }
    /**
     * Point d'entrée du programme : lit une lettre au clavier,
     * la traduit en Morse via {@link #traduire(char)}, puis affiche le résultat.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== TRADUCTEUR MORSE =====");
        System.out.println("Tape une lettre :");
        String saisie = scanner.nextLine();
        char lettre = saisie.charAt(0);

        System.out.println("============================");
        System.out.println("La lettre saisie " + lettre + " correspond à : " + traduire(lettre) + " de l'alphabet Morse !");
        System.out.println("============================");
    }
}

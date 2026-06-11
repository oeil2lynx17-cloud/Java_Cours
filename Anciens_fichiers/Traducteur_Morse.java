/**
 * PROJET — Le Traducteur Morse (version découverte)
 * =================================================
 *
 * Objectif : traduire UNE lettre en code Morse, à l'aide d'une cascade
 * de conditions if / else if. C'est un super entraînement de la Leçon 5 !
 *
 * Compétences testées : Leçon 2 (variables), Leçon 3 (affichage),
 * Leçon 5 (if / else if / else).
 *
 * ----------------------------------------------------------------------
 * 🆕 PETITE NOUVEAUTÉ : le type "char"
 *   - char = UN seul caractère (une seule lettre).
 *   - Il s'écrit entre APOSTROPHES SIMPLES :  'A'   (et non "A")
 *   - Exemple :  char lettre = 'S';
 *   - On le compare comme d'habitude avec == :  if (lettre == 'S')
 * ----------------------------------------------------------------------
 *
 * ----------------------------------------------------------------------
 * CE QUE J'ATTENDS DE TOI (à coder toi-même dans le main) :
 * ----------------------------------------------------------------------
 *
 * ÉTAPE 1 — La variable
 *   Déclare la lettre à traduire :
 *       char lettre = 'S';
 *
 * ÉTAPE 2 — La cascade de conditions
 *   Écris une suite de if / else if qui teste la lettre et affiche
 *   son code Morse. Structure à utiliser :
 *
 *       if (lettre == 'A') {
 *           System.out.println(".-");
 *       } else if (lettre == 'B') {
 *           System.out.println("-...");
 *       } else if ( ... ) {
 *           ...
 *       } else {
 *           System.out.println("Lettre inconnue");
 *       }
 *
 *   👉 Commence par quelques lettres (par ex. celles de ton prénom),
 *      puis complète tout l'alphabet si tu veux relever le défi.
 *
 * ----------------------------------------------------------------------
 * 📻 TABLE MORSE DE RÉFÉRENCE (les données dont tu as besoin) :
 * ----------------------------------------------------------------------
 *   A .-      B -...    C -.-.    D -..     E .       F ..-.
 *   G --.     H ....    I ..      J .---    K -.-     L .-..
 *   M --      N -.      O ---     P .--.    Q --.-    R .-.
 *   S ...     T -       U ..-     V ...-    W .--     X -..-
 *   Y -.--    Z --..
 *
 * ----------------------------------------------------------------------
 * RÉSULTAT ATTENDU :
 *   - si lettre = 'S'  ->  affiche : ...
 *   - si lettre = 'A'  ->  affiche : .-
 *   - si lettre = '@'  ->  affiche : Lettre inconnue
 * ----------------------------------------------------------------------
 *
 * RÈGLES :
 *   - char entre apostrophes simples ' ' , texte entre guillemets " "
 *   - == compare (ici on compare la lettre), = assigne
 *   - chaque ligne se termine par ;
 *   - quand tu as fini, copie-colle ton code dans le chat pour correction.
 *
 * 🏆 Critère de réussite : au moins 5 lettres traduites correctement,
 *    + le cas "Lettre inconnue" qui fonctionne.
 * 🎁 Bonus (plus tard) : traduire un mot entier avec une boucle.
 * ----------------------------------------------------------------------
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */

public class TraducteurMorse {
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
            return ".-.-";
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

    public static void main(String[] args) {
        String morseA = traduire('A');
        String morseB = traduire('B');
        System.out.println(morseA);
        System.out.println(morseB);

     char [] lettres = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < lettres.length; i++) {
            System.out.println(lettres[i] + " = " + traduire(lettres[i]));
        }
    }
}

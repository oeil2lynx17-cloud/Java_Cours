/**
 * PROJET 1 — La Calculatrice Simple
 * =================================
 *
 * Objectif : combiner dans un seul programme tout ce que tu as appris
 * (variables, opérations mathématiques, affichage/concaténation, conditions).
 *
 * Compétences testées : Leçon 2 (variables), Leçon 3 (affichage),
 * Leçon 4 (opérations), Leçon 5 (if / else).
 *
 * ----------------------------------------------------------------------
 * CE QUE J'ATTENDS DE TOI (à coder toi-même dans le main) :
 * ----------------------------------------------------------------------
 *
 * ÉTAPE 1 — Les variables
 *   Déclare deux entiers :
 *       nombre1 = 20
 *       nombre2 = 6
 *
 * ÉTAPE 2 — Les calculs
 *   Calcule et stocke CHAQUE résultat dans sa propre variable :
 *       - l'addition         (nombre1 + nombre2)
 *       - la soustraction    (nombre1 - nombre2)
 *       - la multiplication  (nombre1 * nombre2)
 *       - la division entière (nombre1 / nombre2)
 *       - le modulo / reste  (nombre1 % nombre2)
 *
 * ÉTAPE 3 — L'affichage
 *   Affiche les résultats EXACTEMENT dans ce format :
 *
 *       ===== CALCULATRICE =====
 *       20 + 6 = 26
 *       20 - 6 = 14
 *       20 * 6 = 120
 *       20 / 6 = 3
 *       20 % 6 = 2
 *       ========================
 *
 *   (Pense à la concaténation avec + de la Leçon 3.)
 *
 * ÉTAPE 4 — La condition
 *   Après les calculs, ajoute un if / else :
 *       - SI la multiplication est supérieure à 100
 *             -> affiche : Le produit est grand !
 *       - SINON
 *             -> affiche : Le produit est petit.
 *
 * ----------------------------------------------------------------------
 * RÈGLES :
 *   - Chaque instruction se termine par ;
 *   - Le texte fixe se met entre guillemets " "
 *   - = assigne une valeur, == compare deux valeurs
 *   - Quand tu as fini, copie-colle ton code dans le chat pour correction.
 * ----------------------------------------------------------------------
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */
public class Calculatrice {
    // ÉTAPE 1 — Déclare ici tes variables nombre1 et nombre2
    public static void main(String[] args) {
        int nombre1 = 20;
        int nombre2 = 6;

        int addition = nombre1 + nombre2;
        int soustraction = nombre1 - nombre2;
        int multiplication = nombre1 * nombre2;
        int division = nombre1 / nombre2;
        int modulo = nombre1 % nombre2;

        // ÉTAPE 2 — Calcule ici les 5 opérations
        System.out.println("=====CALUCLATRICE=====");
        System.out.println("20 + 6 = " + addition);
        System.out.println("20 - 6 = " + soustraction);
        System.out.println("20 * 6 = " + multiplication);
        System.out.println("20 / 6 = " + division);
        System.out.println("20 % 6 = " + modulo);
        System.out.println("========================");

        // ÉTAPE 4 — Ajoute ici la condition if / else
        if (multiplication >= 100) {
            System.out.println("Le produit est grand !");
        } else {
            System.out.println("Le produit est petit !");
        }

        for (int i = 1; i <= 3; i++) {
                System.out.println("Tour numéro : " + i);
        }
    }
}
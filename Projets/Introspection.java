/**
 * Programme de démonstration de l'introspection (ou réflexion) — Leçon 19.
 *
 * <p>À partir d'un objet {@code Personne}, le programme inspecte sa classe
 * « à la volée », sans connaître ses détails à l'avance :</p>
 * <ul>
 *   <li>il affiche le nom complet et le nom simple de la classe ;</li>
 *   <li>il liste tous les attributs déclarés de la classe.</li>
 * </ul>
 *
 * <p>Nécessite l'existence d'une classe {@code Personne} possédant un
 * constructeur {@code Personne(String nom, String prenom, int age)}.</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */

public class Main {
    /**
     * Point d'entrée du programme.
     *
     * <p>Crée une Personne, récupère sa classe via {@code getClass()},
     * affiche son nom, puis parcourt et affiche ses attributs déclarés
     * grâce à {@code getDeclaredFields()}.</p>
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */

    public static void main(String[] args) {

        Personne p = new Personne("Dominique", "Dominique", 50);

        // Nom de la classe
        Class c = p.getClass();
        System.out.println("Classe : " + c.getName());
        System.out.println("Classe simple : " + c.getSimpleName());

        // Lister les attributs
        java.lang.reflect.Field[] attributs = c.getDeclaredFields();
        System.out.println("\nAttributs :");
        for (java.lang.reflect.Field f : attributs) {
            System.out.println("  - " + f.getName());
        }
    }
}
public class Afficheur {

    // Version 1 — sans paramètre
    void afficher() {
        System.out.println("Rien à afficher !");
    }
    // Version 2 - avec un string
    void afficher(String texte) {
        System.out.println(texte);
    }
    // version 3 - avec un String et un int
    void afficher(String texte, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(texte);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Afficheur a = new Afficheur();
        a.afficher();
        a.afficher("Bonjour !");
        a.afficher("Java c'est super !", 3);
    }
}
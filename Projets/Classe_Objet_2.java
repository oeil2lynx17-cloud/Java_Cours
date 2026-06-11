public class Personne {
    String nom;
    String prenom;
    int age;

    void sePresenter() {
        System.out.println("Je m'appelle " + prenom + " " + nom + " et j'ai " + age + " ans.");
    }

    public class Main {
        public static void main(String[] args) {
            // On crée un objet Personne
            Personne p1 = new Personne();
            Personne p2 = new Personne();

            // On remplit les attributs
            p1.nom = "Chatelot";
            p1.prenom = "Dominique";
            p1.age = 50;
            p2.nom = "Chatelot-Gary";
            p2.prenom = "Isabelle";
            p2.age = 44;

            // On appelle une méthode
            p1.sePresenter();
            p2.sePresenter();
        }
    }
}
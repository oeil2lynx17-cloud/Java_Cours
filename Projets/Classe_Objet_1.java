public class Personne {

    String nom;
    String prenom;
    int age;

    void sePresenter() {
        System.out.println("Je m'appelle " + prenom + " " + nom + " et j'ai " + age + " ans.");
    }
}
public class Main {
    public static void main(String[] args) {

        Personne p = new Personne();
        p.nom = "Chatelot";
        p.prenom = "Dominique";
        p.age = 50;

        p.sePresenter();
    }
}
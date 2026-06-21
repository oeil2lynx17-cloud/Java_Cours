
public class Paire<T> {
    T premier;
    T second;

    Paire(T premier, T second) {
        this.premier = premier;
        this.second = second;
    }

    T getPremier() {
        return premier;
    }
    T getSecond() {
        return second;
    }

    void afficher() {
        System.out.println("Premier : " + premier + " - Second : " + second);
    }
}
public class Main {
    public static void main(String[] args) {

        Paire<String> paireTexte = new Paire<>("Bonjour", "Monde");

        Paire<Integer> paireNombre = new Paire<>(10, 20);

        paireTexte.afficher();
        paireNombre.afficher();
    }
}
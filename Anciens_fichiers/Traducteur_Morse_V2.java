import java.util.Scanner;

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

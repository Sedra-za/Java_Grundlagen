package StudentsLösung.Sedra;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double Verzinsung;

    public static void main(String[] args) {

    }

    public static void Liste() {
        int auswahl;
        do {
            System.out.println("\n 1. 1.5% Verzinsung ohne Bonuszahlung\n"
                + "2. 0.7% Verzinsung mit 15 Euro Bonuszahlung\n"
                + "3. 0.4% Verzinsung mit 20 Euro Bonuszahlung\n"
                + "4. 0.1% Verzinsung mit 50 Euro Bonuszahlung\n"
                + "5. Fertig");
            System.out.print("Bitte auswählen:");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println("erste Verzinsung: " + ersteVerzinsung(Verzinsung));
                    break;
                case 2:
                    System.out.println("zweite Verzinsung: " + zweiteVerzinsung(Verzinsung));
                    break;
                case 3:
                    System.out.println("dritte Verzinsung: " + dritteVerzinsung(Verzinsung));
                    break;
                case 4:
                    System.out.println("vierte Verzinsung: " + vierteVerzinsung(Verzinsung));
                    break;
                case 5:
                    System.out.println("Fertig");
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus");
            }

        } while (auswahl != 5);
    }

    public static double anlagebetrag(double anlagebetrag) {
        return anlagebetrag;
    }

    public static double berchneKapital(double Anlagebetrag, double Zinssatz, double Bonus) {
        return Anlagebetrag * (1 + Zinssatz / 100) + Bonus;
    }

    public static double ersteVerzinsung(double Verzinsung) {
        return (1.5 / 100) * Verzinsung;
    }

    public static double zweiteVerzinsung(double Verzinsung) {
        return (0.7 / 100) * Verzinsung + 15;
    }

    public static double dritteVerzinsung(double Verzinsung) {
        return (0.4 / 100) * Verzinsung + 20;
    }

    public static double vierteVerzinsung(double Verzinsung) {
        return (0.1 / 100) * Verzinsung + 50;
    }

}










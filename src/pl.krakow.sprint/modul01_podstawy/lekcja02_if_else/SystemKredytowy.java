package pl.krakow.sprint.modul01_podstawy.lekcja02_if_else;

public class SystemKredytowy {
    public static void main(String[] args) {
        int wiekKlienta = 17;
        int miesieczneZarobki = 6000;

        if (wiekKlienta < 18) {
            System.out.println("Odmowa. Jesteś niepełnoletni.");
        } else if (wiekKlienta >= 18 && miesieczneZarobki >= 5000) {
            System.out.println("Kredyt przyznany!");
        } else {
            System.out.println("Wymagany żyrant");
        }
    }
}

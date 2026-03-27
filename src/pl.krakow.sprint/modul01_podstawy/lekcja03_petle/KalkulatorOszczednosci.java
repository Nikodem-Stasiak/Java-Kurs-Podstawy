package pl.krakow.sprint.modul01_podstawy.lekcja03_petle;

public class KalkulatorOszczednosci {
    public static void main(String[] args) {
        int konto = 0;
        for(int m = 1; m <= 12; m++) {
            konto = konto + 500;
            if (m == 6) {
                konto = konto + 1000;
            }
            System.out.println("Miesiąc " + m + " - stan konta: " + konto);
        }
    }
}

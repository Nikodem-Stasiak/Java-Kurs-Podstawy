package pl.krakow.sprint.modul01_podstawy.lekcja01_zmienne;

public class ZamianaZmiennych {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Przed zamianą: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Po zamianie: a = " + a + ",b = " + b);
    }
}

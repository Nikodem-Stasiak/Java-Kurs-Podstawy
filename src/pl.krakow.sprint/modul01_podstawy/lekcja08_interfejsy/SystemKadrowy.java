package pl.krakow.sprint.modul01_podstawy.lekcja08_interfejsy;

import java.util.ArrayList;
import java.util.List;

public class SystemKadrowy {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Adam", "Kowalski", 5500);
        Pracownik p2 = new Pracownik("Ewa", "Nowak", 6000);
        Kierownik k1 = new Kierownik("Maciej", "Musztarda", 6500, 1200);
        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(p1);
        listaPracownikow.add(p2);
        listaPracownikow.add(k1);
        p1.dajPodwyzke(1000);
        System.out.println("Po podwyżce: " + p1.getImie() + "zarabia " + p1.getPensja());
        for (Pracownik p : listaPracownikow) { //pętla for-each (Typ_elementu nazwaZmiennej : nazwaKolekcji) { ... }
            System.out.println(p.getImie() + " zarabia " + p.getPensja());
        }
        Abonament a1 = new Abonament("Internet", 570);
        List<KosztFirmowy> listaKosztow = new ArrayList<>();
        listaKosztow.add(p1);
        listaKosztow.add(p2);
        listaKosztow.add(k1);
        listaKosztow.add(a1);
        int calkowityKosztFirmy = 0;
        for (KosztFirmowy koszt : listaKosztow) {
            calkowityKosztFirmy += koszt.obliczKoszt();
        }
        System.out.println("Całkowity koszt firmy to: " + calkowityKosztFirmy);

        try {
            String wpisanaKwota = "pięćset";
            int nowaPodwyzka = Integer.parseInt(wpisanaKwota); //Próba zamiany słowa na liczbę
            p1.dajPodwyzke(nowaPodwyzka);
        } catch (Exception e) {
            System.out.println("Uwaga! Ktoś podał tekst zamiast liczby!");
        }

        java.util.Map<String, Pracownik> bazaPesel = new java.util.HashMap<>();
        bazaPesel.put("90010112345", p1);
        bazaPesel.put("95050598765", p2);

        //Szukamy po kluczu
        Pracownik poszukiwany = bazaPesel.get("90010112345");
        //Wyświetlamy wynik
        System.out.println("Znalazłem pracownika! To: " + poszukiwany.getImie());
    }
}

package pl.krakow.sprint.modul01_podstawy.lekcja06_obiekty;

import java.util.ArrayList;
import java.util.List;

public class SystemKadrowy {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Adam", "Kowalski", 5500);
        Pracownik p2 = new Pracownik("Ewa", "Nowak", 6000);
        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(p1);
        listaPracownikow.add(p2);
        p1.dajPodwyzke(1000);
        System.out.println("Po podwyżce: " + p1.getImie() + "zarabia " +p1.getPensja());
        for(Pracownik p: listaPracownikow){ //pętla for-each (Typ_elementu nazwaZmiennej : nazwaKolekcji) { ... }
            System.out.println(p.getImie() + " zarabia " + p.getPensja());
        }
        }
}

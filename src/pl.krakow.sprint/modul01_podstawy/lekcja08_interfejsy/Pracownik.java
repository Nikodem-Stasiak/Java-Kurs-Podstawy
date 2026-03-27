package pl.krakow.sprint.modul01_podstawy.lekcja08_interfejsy;

public class Pracownik implements KosztFirmowy {
    private String imie;
    private String nazwisko;
    private int pensja;

    public Pracownik(String imiePodane, String nazwiskoPodane, int pensjaPodana) {
        this.imie = imiePodane;
        this.nazwisko = nazwiskoPodane;
        this.pensja = pensjaPodana;
    }

    public int getPensja() {
        return this.pensja;
    }

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void dajPodwyzke(int kwotaPodwyzki) {
        pensja += kwotaPodwyzki;
    }

    public int obliczKoszt(){
        return this.pensja;
    }
}
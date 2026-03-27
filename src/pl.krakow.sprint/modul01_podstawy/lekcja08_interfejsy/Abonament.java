package pl.krakow.sprint.modul01_podstawy.lekcja08_interfejsy;

public class Abonament implements KosztFirmowy{
    private String nazwaUslugi;
    private int kwotaMiesieczna;

    public Abonament(String nazwaUslugi, int kwotaMiesieczna) {
        this.nazwaUslugi = nazwaUslugi;
        this.kwotaMiesieczna = kwotaMiesieczna;
    }

    @Override
    public int obliczKoszt(){
        return this.kwotaMiesieczna;
    }
}

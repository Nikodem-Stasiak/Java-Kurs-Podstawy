package pl.krakow.sprint.modul01_podstawy.lekcja08_interfejsy;

public class Kierownik extends Pracownik implements KosztFirmowy {
    private int dodatek;

    public Kierownik(String imie, String nazwisko, int pensja, int dodatek){
        super(imie,nazwisko,pensja);
        this.dodatek=dodatek;
    }

    public int getPensja(){return super.getPensja() + this.dodatek;} //ważne super pozwala nam wykorzystać coś co było prywatne w funkcji "rodzica"
}


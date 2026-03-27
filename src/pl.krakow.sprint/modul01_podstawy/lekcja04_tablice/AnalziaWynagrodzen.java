package pl.krakow.sprint.modul01_podstawy.lekcja04_tablice;

public class AnalziaWynagrodzen {
    public static void main(String[] args) {
        int[] pensje = {4500, 5200, 3800, 7100, 4900};
        int suma = 0;
        int min = pensje[0];
        int max = pensje[0];
        for(int i=0;i< pensje.length; i++){
            suma += pensje[i];
            if(pensje[i]>max){
                max=pensje[i];
            }
            if(pensje[i]<min){
                min=pensje[i];
            }
        }
        System.out.println("Całkowita suma wynosi: " + suma);
        double srednia = suma/ pensje.length;
        System.out.println("Średnia z sumy pensji wynosi: " + srednia);
        System.out.println("Minimalna pensja wynosi: " + min + ", maksymalna pensja wynosi natomiast: " + max);
    }
}

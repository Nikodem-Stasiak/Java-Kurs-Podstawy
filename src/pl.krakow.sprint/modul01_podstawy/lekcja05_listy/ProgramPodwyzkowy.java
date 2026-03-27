package pl.krakow.sprint.modul01_podstawy.lekcja05_listy;

import java.util.ArrayList;
import java.util.List;

public class ProgramPodwyzkowy {
    public static void main(String[] args) {
        int[] pensje  = {4500, 5200, 3800, 7100, 4900};
        List<Integer> pensjeDoPodywzki = new ArrayList<>();
        for(int i=0;i<pensje.length;i++){ //moge zapisać to prościej!! for(int pensja:pensje) {... pensja ...}
            if(pensje[i]<5000){
                pensjeDoPodywzki.add(pensje[i]);
            }
        }
        System.out.println(pensjeDoPodywzki.size());
        System.out.println(pensjeDoPodywzki);
    }
}

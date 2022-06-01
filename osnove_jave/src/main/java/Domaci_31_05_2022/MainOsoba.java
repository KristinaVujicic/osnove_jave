package Domaci_31_05_2022;

import java.util.ArrayList;

public class MainOsoba {
    public static void main(String[] args) {

        ////U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

        Igrac igracJedan = new Igrac("Kris Vuj", "010299535647", 1993, 7, "golman", true);
        Igrac igracDva = new Igrac("Alex Vuj", "0905993526272", 1993, 5, "napad", false);

        Trener trenerJedan = new Trener("Dragan Limeni", "12345678910", 1966, 35, "kondicioni");
        Trener trenerDva = new Trener("Misa Jovic", "3456172840682", 1972, 8, "personalni");

//        igracJedan.printIgrac();
//
//        igracDva.printIgrac();
//
//        trenerJedan.printTrener();
//         trenerDva.printTrener();
//


        ArrayList<Igrac> nizIgraca = new ArrayList<Igrac>();
        ArrayList<Trener> nizTrenera = new ArrayList<Trener>();

        nizIgraca.add(igracJedan);
        nizIgraca.add(igracDva);

        nizTrenera.add(trenerJedan);
        nizTrenera.add(trenerDva);

        for (int i = 0; i < nizIgraca.size() ; i++) {

            nizIgraca.get(i).printIgrac();
        }

        for (int i = 0; i < nizTrenera.size() ; i++) {

            nizTrenera.get(i).printTrener();
        }





    }
}

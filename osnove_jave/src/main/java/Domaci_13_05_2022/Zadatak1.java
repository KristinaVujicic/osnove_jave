package Domaci_13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        // Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
        // Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za
        // koju se racuna suma.
        // Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata
        // iznad, ispod, sleve i sdesne strane tog elementa
        // (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
        // Za racunanje sume, nije potrebna petlja!

        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        int suma = 0;


        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);
        niz.add(8);
        niz.add(9);
        niz.add(10);
        niz.add(11);
        niz.add(12);
        niz.add(13);
        niz.add(14);
        niz.add(15);
        niz.add(16);
        niz.add(17);
        niz.add(18);
        niz.add(19);
        niz.add(20);
        niz.add(21);
        niz.add(22);
        niz.add(23);
        niz.add(24);
        niz.add(25);

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + " , ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.println("Unesite poziciju: ");
        int pozicija = s.nextInt();


        if (niz.get(pozicija) > 5 && niz.get(pozicija) < 19) {
            int levo = niz.get(pozicija - 1);
            int desno = niz.get(pozicija + 1);
            int gore = niz.get(pozicija - 5);
            int dole = niz.get(pozicija + 5);
            suma = gore + dole + levo + desno + niz.get(pozicija);
        }
        if (pozicija == 9 || pozicija == 14 || pozicija == 19) {
            int levo = niz.get(pozicija - 1);
            int gore = niz.get(pozicija - 5);
            int dole = niz.get(pozicija + 5);
            suma = levo + gore + dole + niz.get(pozicija);
        }

        if (pozicija == 5 || pozicija == 10 || pozicija == 15) {
            int desno = niz.get(pozicija + 1);
            int dole = niz.get(pozicija + 5);
            int gore = niz.get(pozicija - 5);
            suma = desno + gore + dole + niz.get(pozicija);
        }
        if (pozicija == 1 || pozicija == 2 || pozicija == 3) {
            int levo = niz.get(pozicija - 1);
            int desno = niz.get(pozicija + 1);
            int dole = niz.get(pozicija + 5);
            suma = desno + levo + dole + niz.get(pozicija);
        }
        if (pozicija == 21 || pozicija == 22 || pozicija == 23) {
            int levo = niz.get(pozicija - 1);
            int desno = niz.get(pozicija + 1);
            int gore = niz.get(pozicija - 5);
            suma = desno + levo + gore + niz.get(pozicija);
        }
        if (pozicija == 0) {
            int desno = niz.get(pozicija + 1);
            int dole = niz.get(pozicija + 5);
            suma = desno + dole + niz.get(pozicija);
        }
        if (pozicija == 4) {
            int levo = niz.get(pozicija - 1);
            int dole = niz.get(pozicija + 5);
            suma = dole + levo + niz.get(pozicija);
        }
        if (pozicija == 20) {
            int gore = niz.get(pozicija - 5);
            int desno = niz.get(pozicija + 1);
            suma = gore + desno + niz.get(pozicija);
        }
        if (pozicija == 24) {
            int gore = niz.get(pozicija - 5);
            int levo = niz.get(pozicija - 1);
            suma = gore + levo + niz.get(pozicija);
        }


        System.out.println("Suma je: " + suma);


    }
}

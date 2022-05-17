package p16_05_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args){
        // 5. Zadatak
        //Napisati metodu stampaj ApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.


        int a = -10;

        apsolutnuVrednost (a);

        }

    static void apsolutnuVrednost(int a ) {
        if (a > 0) {
            System.out.println("Apsolutna vrednost broja je: " + a);
        } else {
            System.out.println("Apsolutna vrednost je: " + (a * (-1)));
    }
}
}

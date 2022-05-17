package p16_05_2022;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Zadatak9 {
    public static void main(String[] args) {

//
//        9.Zadatak
//        Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        6 - VI
//        7 - VII
//        8 - VIII
//        9 - IX
//        10 - X
//
//        Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//                Ako se unese VIII vraca se 8.
//
//        VIII => 8

        String rimski = "III";
        int vrednostRimskogbroja = arapskiBroj(rimski);

        System.out.println("Vrednost " + rimski + " broja je: " + vrednostRimskogbroja);



    }

    static int arapskiBroj(String rimskiBroj) {
        if (rimskiBroj.equals("I")) {
            return 1;
        }
        if (rimskiBroj.equals("II")) {
            return 2;
        }
        if (rimskiBroj.equals("III")) {
            return 3;
        }
        else {
            return 0;
        }
    }



 }



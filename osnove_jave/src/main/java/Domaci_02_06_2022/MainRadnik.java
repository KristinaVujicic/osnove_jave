package Domaci_02_06_2022;

import java.util.ArrayList;

public class MainRadnik {
    public static void main(String[] args) {

        //Zadatak
        //Kreirati klasu Sektor koja ima:
        // naziv sektora
        // platu koja je za taj sektor

        //Kreirati abstraktnu klasu Radnik koja ima:
        // ime i prezime
        // niz sektora u kojima radi
        // abstraktnu metodu koja vraca platu radnika
        // metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

        //Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
        // override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

        //Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
        // ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
        // suma plata svih sektor / broj sektora * 0.5
        // override uje metodu za platu, tako da se plata racuna po formuli:
        //(prosecna plata za sve sektore u kojima radi) * (broj sektora).

        //U glavnom programu kreirati jednog magacionera i jednog menadzera,
        // postaviti sektore u kojima rade i ispisati platu za svakog


        Menadzer menadzer1 = new Menadzer("Kris Vuj");
        Menadzer magacioner1 = new Menadzer("Mile Misic");

        Sektor marketing = new Sektor("marketing", 70567);
        Sektor nabavka = new Sektor("nabavka", 65789);

        menadzer1.zaposli(marketing);
        magacioner1.zaposli(nabavka);


        System.out.println("Plata menadzera je: " + menadzer1.plataRadnika());
        System.out.println();
        System.out.println("Plata magacionera je: " + magacioner1.plataRadnika());

    }
}

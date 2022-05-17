package Domaci_16_05_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //3. Zadatak
        //Napisati metodu koja stampa podatke o korisniku u formatu:
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vas JMBG: ");
        String jmbg = s.next();

        System.out.print("Unesite vase ime: ");
        String ime = s.next();

        System.out.print("Unesite vase prezime: ");
        String prezime = s.next();

        System.out.print("Unesite godinu rodjenja: ");
        int god = s.nextInt();

        System.out.print("Da li ste aktivni (true/false): ");
        boolean aktivan = s.nextBoolean();

        metoda(jmbg, ime, prezime,god, aktivan);



    }
    static void metoda (String jmbg, String ime, String prezime, int god, boolean aktivan) {

        if (aktivan == true) {
            System.out.println("JMBG: " + jmbg );
            System.out.println ("Ime: " + ime );
            System.out.println("Prezime: " + prezime);
            System.out.println("Godina rodjenja: " + god);
            System.out.println("Aktivan: " + aktivan);

        } else {
            System.out.println("JMBG: " + jmbg );
            System.out.println ("Ime: " + ime );
            System.out.println("Prezime: " + prezime);
            System.out.println("Godina rodjenja: " + god);
            System.out.println("Aktivan: " + aktivan);
        }
    }



}

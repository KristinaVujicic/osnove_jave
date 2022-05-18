//package p_18_05_2022;
//
//import java.util.Scanner;
//
//public class MainRacun {
//    public static void main(String[] args) {
//
//       // U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//
//        Racun jedan = new Racun();
//
//       jedan.brojRacuna = "840239323";
//       jedan.ime = "Kris";
//       jedan.prezime ="Vuj";
//       jedan.stanjeNaRacunu = 1000;
//
//       Racun dva = new Racun ();
//
//
//        dva.broj = "830679003";
//        dva.ime = "Alex";
//        dva.prezime = "Vujicic";
//        dva.stanje = 0;
//
////        System.out.println("Racun pripada: " + jedan.ime + " " + jedan.prezime + ". " + "Broj racuna je: " + jedan.brojRacuna + ". Stanje na racunu: "  + jedan.stanjeNaRacunu  );
////        System.out.println("Racun pripada: " + dva.ime + " " + dva.prezime + ". " + "Broj racuna je: " + dva.brojRacuna + ". Stanje na racunu: "  + dva.stanjeNaRacunu  );
//
//
//
//        //Primer izvrsenja:
//        //Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//        //Primalac: Marko Markovic, 840-23932-334, stanje: 200
//        //Unesite sumu za transakciju: 500
//        //Stanje nakon stransakcije
//        //Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//        //Primalac: Marko Markovic, 840-23932-334, stanje: 700
//
//
//        System.out.println("Posiljalac: " + jedan.ime + " " + jedan.prezime + ". Broj racuna: " + jedan.broj + " " +
//                "Stanje na racunu: " + jedan.stanje);
//
//        System.out.println("Primalac: " + dva.ime + " " + dva.prezime + ". Broj racuna: " + dva.broj + " " +
//                "Stanje na racunu: " + dva.stanje);
//
//       Scanner s = new Scanner(System.in);
//
//        System.out.print("Unesite sumu za transakciju: ");
//        int suma = s.nextInt();
//
//        jedan.stanje = jedan.stanje - suma;
//        dva.stanje = dva.stanje + suma;
//
//        System.out.println("Posiljalac " + jedan.ime + " " + jedan.prezime + ". Stanje na racunu: " + jedan.stanjeNaRacunu);
//        System.out.println("Primalac " + dva .ime + " " + dva.prezime + ". Stanje na racunu: " + dva.stanjeNaRacunu);
//
//
//
//
//
//
//    }
//}

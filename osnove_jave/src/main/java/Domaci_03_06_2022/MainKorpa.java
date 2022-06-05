package Domaci_03_06_2022;

import p24_05_2022.Korisnik;

public class MainKorpa {
    public static void main(String[] args) {

        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
        //i istestirati sve metode i ispisati ukupnu cenu sa popustom.


        Ambalaza ambalaza1 = new Steklo("123456789", "Coca-Cola", 50, 75,
                false, 99 );
        Ambalaza ambalaza2 = new Tetrapak("998877654", "Mleko", 100, 150,
                true, 200);
        Ambalaza ambalaza3 = new Tetrapak("235165946", "Jogurt", 102, 154,
                true, 205);

        SuperKartica kartica = new SuperKartica("334516284", "Kris Vuj", 200);

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(ambalaza1);
        korpa.dodajAmbalazu(ambalaza1);
        korpa.dodajAmbalazu(ambalaza2);
        korpa.dodajAmbalazu(ambalaza3);

        System.out.println("ukupna cena korpe: " + korpa.cenaCeleKorpe());

    }
}

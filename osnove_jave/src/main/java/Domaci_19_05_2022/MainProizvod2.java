package Domaci_19_05_2022;

import Domaci_18_05_2022.Proizvod;

public class MainProizvod2 {
    public static void main(String[] args) {

        Proizvod2 p = new Proizvod2();

        p.imeProizvoda = "Cokolada";
        p.cena = 100;
        p.tezinaUg = 100;

        p.stampajProizvod(p.imeProizvoda, p.cena, p.tezinaUg);

        p.povecajCenu(30);

        System.out.println("Cena sa popustom je: " + p.vratiCenuSaPopustom(30));

        System.out.println("Postarina za ovaj proizvod je " + p.racunajPostarinu() + " dinara." );

        System.out.println();



       Proizvod2 t = new Proizvod2();

        t.imeProizvoda = "Torta";
        t.cena = 1000;
        t.tezinaUg = 2000;

        t.stampajProizvod(t.imeProizvoda, t.cena, t.tezinaUg);

        t.povecajCenu(460);

        System.out.println("Cena sa popustom je: " + t.vratiCenuSaPopustom(15));

        System.out.println("Postarina za ovaj proizvode je " + t.racunajPostarinu() + " dinara.");
    }
}

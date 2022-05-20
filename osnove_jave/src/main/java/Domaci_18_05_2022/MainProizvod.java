package Domaci_18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        //// 1. Napisati klasu Proizvod koja ima atribute
        //    //naziv proizvoda (String)
        //    //cenu proizvoda (double)
        //    //težinu proizvoda u gramima. (double)
        //    //	i metode:
        //             //	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //     //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

        Proizvod p = new Proizvod();

        p.imeProizvoda = "Cokolada";
        p.cena = 100;
        p.tezinaUg = 80;

        p.stampajProizvod(p.imeProizvoda, p.cena, p.tezinaUg);


        Proizvod t = new Proizvod();

        t.imeProizvoda = "Torta";
        t.cena = 1000;
        t.tezinaUg = 2000;

        t.stampajProizvod(t.imeProizvoda, t.cena, t.tezinaUg);

    }
}



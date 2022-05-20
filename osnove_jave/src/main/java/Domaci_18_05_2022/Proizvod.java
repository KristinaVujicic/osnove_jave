package Domaci_18_05_2022;

public class Proizvod {

    // 1. Napisati klasu Proizvod koja ima atribute
    //naziv proizvoda (String)
    //cenu proizvoda (double)
    //težinu proizvoda u gramima. (double)
    //	i metode:
    //	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

    public String imeProizvoda;
    public double cena;
    public double tezinaUg;


    public void stampajProizvod(String proizvod, double cena, double tezinaUg) {
        System.out.println("{ " + proizvod + " }," + "{ " + cena + "din. " + " }" + "{ " + tezinaUg + "g" + " }");
    }
}

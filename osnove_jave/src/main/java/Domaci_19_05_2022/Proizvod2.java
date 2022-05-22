package Domaci_19_05_2022;

public class Proizvod2 {

    public String imeProizvoda;
    public double cena;
    public double tezinaUg;


    public void stampajProizvod(String proizvod, double cena, double tezinaUg) {
        System.out.println("{ " + proizvod + " }," + "{ " + cena + "din. " + " }" + "{ " + tezinaUg + "g" + " }");
    }

    public void povecajCenu ( int povecanje) {
        cena = cena + povecanje;
        System.out.println("Nova cena je " + cena);
    }

    public double vratiCenuSaPopustom (int popust) {
        return cena - (cena * popust / 100);
    }

    public int racunajPostarinu () {
        if (tezinaUg <= 100 ) {
            return 200;
        }
        if (tezinaUg > 100 && tezinaUg <= 500) {
            return 400;
        }
        if (tezinaUg > 500) {
            return 1000;
        }
        return 0;
    }
}

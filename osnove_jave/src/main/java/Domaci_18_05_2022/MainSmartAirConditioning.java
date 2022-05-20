package Domaci_18_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {

        //Kreirati klasu SmartAirConditioning koja ima:
        //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
        //atribut za mod (hladi/greje)
        //metodu za stampu - stampa u formatu: Proizvoljno :)

        //U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
        // i za svaki od njih pozvati metodu za stampu

        SmartAirConditioning p = new SmartAirConditioning();

        p.marka = "Samsung";
        p.temperatura = 28;
        p.mod = "greje";

        p.stampajklimu(p.marka, p.temperatura, p.mod);
        System.out.println();

        SmartAirConditioning k = new SmartAirConditioning();

        k.marka = "Gree";
        k.temperatura = 16;
        k.mod = "hladi";

        k.stampajklimu(k.marka, k.temperatura, k.mod);


    }
}

package Domaci_18_05_2022;

public class SmartAirConditioning {

    //Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu: Proizvoljno :)

    //U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
    // i za svaki od njih pozvati metodu za stampu

    public String marka;
    public int temperatura;
    public String mod;

    public void stampajklimu (String marka, int temperatura, String mod) {

        if (temperatura > 35) {
            temperatura = 35;
        }
        if (temperatura < 16) {
            temperatura = 16;
        }

        System.out.println("Ime: " + marka);
        System.out.println("Trenutna temperatura je: " + temperatura + "°C");
        System.out.println("Mod: " + mod);


    }

}

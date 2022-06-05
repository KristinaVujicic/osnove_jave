package Domaci_03_06_2022;

public class Tetrapak extends Ambalaza {

    //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
    //atribut koji kaze da li se moze reciklirati
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni


    private boolean reciklaza;
    private double osnovnaCena;

    public Tetrapak(boolean reciklaza, double osnovnaCena) {
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barcode, String nazivArtikla, double netoTezinu, double brutoTezinu, boolean reciklaza,
                    double osnovnaCena) {
        super(barcode, nazivArtikla, netoTezinu, brutoTezinu);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (reciklaza == true) {
            return tezinaPakovanja() * 1.5 + osnovnaCena;
        }
        else if (reciklaza == false) {
            return osnovnaCena;
        }
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Barcode artikla: " + getBarcode());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Neto tezine: " + getNetoTezinu() + " / "  + "Bruto tezine: " + getBrutoTezinu());
        System.out.print("Da li je od reciklirajuceg materijala: ");
        if (reciklaza == true) {
            System.out.println("jeste.");
        } else {
            System.out.println("nije.");
        }
        System.out.println("Cena artikla je: " + cenaArtikla());

    }

    //racuna cenu tako da ispunjava uslova:
    //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
    //ako nije u cenu ulazi samo osnovna cena
    //metoda stampaj stampa sve podatke iz klase tetrapak.
}

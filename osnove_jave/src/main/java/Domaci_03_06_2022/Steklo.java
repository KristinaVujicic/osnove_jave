package Domaci_03_06_2022;

public class Steklo extends Ambalaza {

    //Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
    //kaucija za flasu
    //atribut koji kaze da li se za flasu placa kaucija
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni


    private boolean kaucijaZaAmbalazu;
    private double kaucija;
    private double osnovnaCena;


    public Steklo(String barcode, String nazivArtikla, double netoTezinu,
                  double brutoTezinu, boolean kaucijaZaAmbalazu, double osnovnaCenaStakla) {
        super(barcode, nazivArtikla, netoTezinu, brutoTezinu);
        this.kaucijaZaAmbalazu = kaucijaZaAmbalazu;
        this.osnovnaCena = osnovnaCenaStakla;
    }

    public boolean isKaucijaZaAmbalazu() {
        return kaucijaZaAmbalazu;
    }

    public void setKaucijaZaAmbalazu(boolean kaucijaZaAmbalazu) {
        this.kaucijaZaAmbalazu = kaucijaZaAmbalazu;
    }

    public double getOsnovnaCenaStakla() {
        return osnovnaCena;
    }

    public void setOsnovnaCenaStakla(double osnovnaCenaStakla) {
        this.osnovnaCena= osnovnaCenaStakla;
    }

    @Override
    public double cenaArtikla() {
        if (kaucijaZaAmbalazu == true) {
            return osnovnaCena * 1.2 + kaucija;
        } else {
            return osnovnaCena * 1.2;
        }
    }

    @Override
    public void print() {
        System.out.println("Barcode artikla: " + getBarcode());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Neto tezine: " + getNetoTezinu() + " / "  + "Bruto tezine: " + getBrutoTezinu());
        System.out.print("Da li se placa kaucija: ");
        if (kaucijaZaAmbalazu == true) {
            System.out.print("Placa se. ");
            System.out.println("Cena artikla je: " + cenaArtikla());

        } else {
            System.out.println("Ne placa se. " );
            System.out.println("Cena artikla je: " + cenaArtikla());
        }

    }

    //racuna cenu
    //ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
    //ako se ne placa, (osnovna cena) * 1.2
    //metoda stampaj stampa sve podatke iz klase staklena flasa.
}

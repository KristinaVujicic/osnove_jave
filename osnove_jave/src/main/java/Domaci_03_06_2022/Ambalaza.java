package Domaci_03_06_2022;

public abstract class Ambalaza {

    // Kreirati abstraktnu klasu Ambalaza koja ima:
    //barkod (primer: 328232-2823)
    //naziv artikla
    //neto tezinu
    //bruto tezinu
    //konstuktore (default-ni i sa parametrima)
    //gettere i settere


    private String barcode;
    private String nazivArtikla;
    private double netoTezinu;
    private  double brutoTezinu;

    public Ambalaza () {

    }

    public Ambalaza(String barcode, String nazivArtikla, double netoTezinu, double brutoTezinu) {
        this.barcode = barcode;
        this.nazivArtikla = nazivArtikla;
        this.netoTezinu = netoTezinu;
        this.brutoTezinu = brutoTezinu;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezinu() {
        return netoTezinu;
    }

    public void setNetoTezinu(double netoTezinu) {
        this.netoTezinu = netoTezinu;
    }

    public double getBrutoTezinu() {
        return brutoTezinu;
    }

    public void setBrutoTezinu(double brutoTezinu) {
        this.brutoTezinu = brutoTezinu;
    }

    //metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
    //abstraktnu metodu koja vraca cenu artikla
    //abstraktnu metodu stampaj

    public double tezinaPakovanja () {
        return this.brutoTezinu - this.netoTezinu;
    }

    public abstract double cenaArtikla ();
    public abstract void print ();


}

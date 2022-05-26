package Domaci_24_05_2022;

public class Racun {

    //Kreirati klasu Racun koja ima:
    //broj racuna (npr: 170-289328923-23)
    //ime i prezime osobe
    //trenutno stanje na racunu (npr: 100, 1220)
    //gettere i setter za sve atribute, sem settera za stanje na racunu


    private String brRacuna;
    private String imePrezime;
    private double stanje;

    private Transakcija transakcija;

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getStanje() {
        return stanje;
    }

    public Racun(String brRacuna, String imePrezime, double stanje) {
        this.brRacuna = brRacuna;
        this.imePrezime = imePrezime;
        this.stanje = stanje;
    }

    //metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
    //metodu koja stampa podatke o racunu u formatu:
    //Ime i prezime  -  broj racuna
    //stanje na racunu je (trenutno stanje) rsd.

    public void promenaStanjaNaRacunu (double transakcija) {
        if ((stanje - transakcija) > 0 ) {
            stanje = stanje - transakcija;
        } else  {
            System.out.println("Nemate dovoljno sredstava na racunu");

        }
    }

    public void povecajStanje (double transakcija) {
        this.stanje = this.stanje + transakcija;
    }

    public void print () {
        System.out.println(imePrezime + " - " + brRacuna);
        System.out.println(stanje + "rsd.");
    }
}

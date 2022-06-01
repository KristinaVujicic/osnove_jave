package Domaci_31_05_2022;

public class Trener extends Osoba {

    //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
    //godine iskustva
    //tip trenera (kondicioni, za igru, pomocni, personalni)
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

    private int godIskustva;
    private String tipTrenera;

    public Trener(int godIskustva, String tipTrenera) {
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    public Trener(String imeIprezime, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
        super(imeIprezime, jmbg, godRodjenja);
        this.godIskustva = godIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodIskustva() {
        return godIskustva;
    }

    public void setGodIskustva(int godIskustva) {
        this.godIskustva = godIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    public void printTrener () {
        super.print();
        System.out.println("Godine iskustva trenera: " + godIskustva);
        System.out.println("Tip trenera: " + tipTrenera);
        System.out.println();
    }
}

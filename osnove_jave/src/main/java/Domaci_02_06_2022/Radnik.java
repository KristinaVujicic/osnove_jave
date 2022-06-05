package Domaci_02_06_2022;

import java.util.ArrayList;

public abstract class Radnik {

    //Kreirati abstraktnu klasu Radnik koja ima:
    // ime i prezime
    // niz sektora u kojima radi


    protected String imeIprezime;
    protected  ArrayList <Sektor> nizSektora = new ArrayList<Sektor>();

    public Radnik(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public Radnik() {

    }


    public String getImeIprezime() {

        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {

        this.imeIprezime = imeIprezime;
    }

    // abstraktnu metodu koja vraca platu radnika
    // metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom


    public abstract double plataRadnika ();

    public void zaposli (Sektor nazivSektora) {
        nizSektora.add(nazivSektora);

    }

}

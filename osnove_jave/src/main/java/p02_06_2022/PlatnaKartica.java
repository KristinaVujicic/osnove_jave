package p02_06_2022;

public abstract class PlatnaKartica {

    //    Napraviti klasu apstraktnu PlatnaKartica koja ima
    //	  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
    //	  atribut broj kartice  primer: 4012-1239-1221-3381
    //	  atribut godina - godina do kada vazi kartica
    //	  atribut mesec-  mesec do kada vazi kartica
    //	  konstruktor sa parametrima
    //	  gettere za sve atribute, bez settera
    //	  metodu dodajSredstva koja povecava sumu za unetu vrednost
    //	  apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
    //	  apstraktnu metodu koja stampa podatke o kartici.

    protected double suma;
    protected String brojKartice;
    protected int godinaVazenja;
    protected int mesecVazenja;

    public PlatnaKartica() {
    }

    public PlatnaKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVazenja = godinaVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaVazenja() {
        return godinaVazenja;
    }

    public int getMesecVazenja() {
        return mesecVazenja;
    }

    public void dodajSredstva(double iznos) {
        this.suma = this.getSuma() + iznos;
    }

    public abstract void izvrsiTransakciju(double iznos);

    public abstract void stampaj();
}

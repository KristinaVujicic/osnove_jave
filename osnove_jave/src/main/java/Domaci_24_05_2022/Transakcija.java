package Domaci_24_05_2022;

public class Transakcija {

    //Kreirati klasu Transakcija koja ima:
    //id transakcije
    //racun sa kog se prenose sredstva
    //racun na koji se prenose sredstva
    //gettere i settere
    //konstruktore

    private String idTransakcije;
    private Racun posiljalac;
    private Racun primalac;

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    public Transakcija(String idTransakcije, Racun posiljalac, Racun primalac) {
        this.idTransakcije = idTransakcije;
        this.primalac = primalac;
        this.posiljalac = posiljalac;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

     //privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
    //ako je prenos sredstava manji od 4500, provizija je fiksna 45
    //ako je prenos sredstava veci od 4500, provizija je 1%
    //S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji
    // predstavlja visinu transakcije

    private double provizija(double visinaTransakcije) {
        if (visinaTransakcije < 4500) {
            return 45;
        }
        if (visinaTransakcije >= 4500) {
            return visinaTransakcije / 100;
        }
        return 0;
    }
    //Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
    //metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi
    // vrednost koja se prebacuje.
    //Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo
    // (trazena suma).
    //metodu koja stampa podatke o transakciji u formatu:
    //id transkacije
    //Racun sa: Ime i prezime  -  broj racuna
    //Racun na: Ime i prezime  -  broj racuna

    public void izvrsiTransakciju(double prenesenaSredstva) {

        this.posiljalac.promenaStanjaNaRacunu(prenesenaSredstva + provizija(prenesenaSredstva));

        if (this.posiljalac.getStanje() > prenesenaSredstva) {
            this.primalac.povecajStanje(prenesenaSredstva);
        }


    }

    public void print () {
        System.out.println(idTransakcije);
        System.out.println("Racun sa: " + this.posiljalac.getImePrezime() + " - " + posiljalac.getBrRacuna());
        System.out.println("Racun na: " + this.primalac.getImePrezime() + " - " + posiljalac.getBrRacuna());
        System.out.println("Stanje na racunu primaoca: " + primalac.getStanje());
        System.out.println("Stanje na racunu posiljaoca: " + posiljalac.getStanje());
    }

}

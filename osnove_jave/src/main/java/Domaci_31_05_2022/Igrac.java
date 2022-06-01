package Domaci_31_05_2022;

public class Igrac extends Osoba {

    //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
    //broj (broj koji igrac nosi)
    //poziciju koju igra (odbrambeni, napadac, … )
    //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
    //default-ni konstuktor
    //konstuktor sa parametrima
    //gettere i settere za broj, kapiten i poziciju
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu


    private int brojIgraca;
    private String pozicijaIgraca;
    private Boolean kapiten;

    public Igrac () {

    }

    public Igrac(String imeIprezime, String jmbg, int godRodjenja, int brojIgraca, String pozicijaIgraca, Boolean kapiten) {
        super(imeIprezime, jmbg, godRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicijaIgraca = pozicijaIgraca;
        this.kapiten = kapiten;
    }

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public Boolean getKapiten() {
        return kapiten;
    }

    public void setKapiten(Boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void printIgrac () {
        super.print();
        System.out.println("Pozicija igraca je: " + pozicijaIgraca);
        System.out.println("Broj igraca: " + brojIgraca);
        System.out.print("Da li je igrac kapiten: " );
        if (kapiten) {
            System.out.println(" Jeste." );
        } else {
            System.out.println(" Nije!");
        }
        System.out.println();
    }
}

package Domaci_31_05_2022;


public class Osoba {

//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)



    protected String imeIprezime;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba () {

    }

    public Osoba (String imeIprezime, String jmbg, int godRodjenja) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;

    }


    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }


    public void print () {
        System.out.println("( " + imeIprezime + " )" + ", "
                                + " ( " + jmbg + " ),"
                                + " ( " + godRodjenja + " )");
    }

}

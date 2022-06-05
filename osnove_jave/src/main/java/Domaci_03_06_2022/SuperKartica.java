package Domaci_03_06_2022;

public class SuperKartica {

    //Kreirati klasu SuperKartica koja ima:
    //broj kartice
    //ime i prezime vlasnika
    //popust (200, 500, … )
    //konstuktore (default-ni i sa parametrima)
    //gettere i settere
    //metodu stampaj koja stampa karticu u formatu:
    //(broj kartice), (ime i prezime)

    private String brojKartice;
    private String imeIprezimeVlasnika;
    private double popust;

    public SuperKartica () {

    }

    public SuperKartica(String brojKartice, String imeIprezimeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.imeIprezimeVlasnika = imeIprezimeVlasnika;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIprezimeVlasnika() {
        return imeIprezimeVlasnika;
    }

    public void setImeIprezimeVlasnika(String imeIprezimeVlasnika) {
        this.imeIprezimeVlasnika = imeIprezimeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    //metodu stampaj koja stampa karticu u formatu:
    //(broj kartice), (ime i prezime)

    public void printKatica () {
        System.out.println("( " + brojKartice + " ), " +
                "( " + imeIprezimeVlasnika + " )");
    }
}

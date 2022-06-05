package Domaci_02_06_2022;

public class Sektor {

//    Kreirati klasu Sektor koja ima:
//    naziv sektora
//    platu koja je za taj sektor

    private String nazivSektora;
    private int plataSektora;

    public Sektor () {

    }

    public Sektor(String nazivSektora, int plataSektora) {
        this.nazivSektora = nazivSektora;
        this.plataSektora = plataSektora;
    }

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public int getPlataSektora() {
        return plataSektora;
    }

    public void setPlataSektora(int plataSektora) {
        this.plataSektora = plataSektora;
    }

}

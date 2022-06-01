package Domaci_30_5_2022;

public class Ispit {

    //Napisati klasu Ispit koja ima
    //naziv predmeta
    //ocenu (u rasponu od 5 do 10)
    //Ime i prezime profesora koji predaje predmet
    //konstuktore koje mislite da ce vam trebati
    //gettere i settere za sve atribute

    private String profesor;
    private int ocena;
    private String predmet;

    public Ispit () {

    }

    public Ispit(String profesor, int ocena, String predmet) {
        this.profesor = profesor;
        this.ocena = ocena;
        this.predmet = predmet;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    //metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
    //metodu koja stampa ispit u formatu:
    //(naziv predmeta) - (profesor) - (ocena)

    public void polozenIspit () {
        if (this.ocena < 6) {
            System.out.println("Pali ste ispit!");
        }
        else if (this.ocena >= 6 && this.ocena <=10 )
            System.out.println("Polozili ste ispit!");
    }

    public void stampaj () {
        System.out.print("( " + this.predmet + " ) - " + "( " + this.profesor + " ) - " +
                         " (  " + this.ocena + " )");
    }
}

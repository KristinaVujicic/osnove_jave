package Domaci_23_05_2022;

public class Autor {

    //Kreirati klasu Autor koja ima
    //-ime i prezime
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu:
    //(ime autora) (prezime autora)


    private String fullname;

    public void setFullname () {

        this.fullname = fullname;
    }
    public void getFullname(String fullname) {
        this.fullname = fullname;
    }

    public Autor(String fullname) {
        this.fullname = fullname;
    }

    public void print () {
        System.out.println(fullname);
    }



}

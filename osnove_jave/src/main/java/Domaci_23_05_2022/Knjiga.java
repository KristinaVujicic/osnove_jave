package Domaci_23_05_2022;

public class Knjiga {

    // //Kreirati klasu Knjiga koji ima:
    //    //-ISBN
    //    //-naziv
    //    //-godina izdanja
    //    //-autor
    //    //-konstuktore koje mislite da su vam potrebni
    //    //-gettere i settere za atribute
    //    //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
    //    //(ISBN)
    //    //(naziv) - (godina izdanja)
    //    //autor: (ime autora) (prezime autora)


    private String isbn;
    private String imeknjige;
    private int godina;
    private Autor autor;

    public void setIsbn () {
        this.isbn = isbn;
    }
    public void getIsbn(String isbn) {
    }

    public void setImeknjige (){
        this.imeknjige = imeknjige;
    }
    public void getImeknjige(String imeknjige) {
    }

    public void setGodina () {
        this.godina = godina;
    }
    public int getGodina (int godina) {
        return godina;
    }

    public Knjiga(String isbn, String imeknjige, int godina, Autor autor) {
        this.isbn = isbn;
        this.imeknjige = imeknjige;
        this.godina = godina;
        this.autor = autor;
    }

    public void print () {
        System.out.println(isbn);
        System.out.println(imeknjige + " - " + godina);
//        System.out.println(this.autor.getFullname());
    }



}

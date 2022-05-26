package Domaci_23_05_2022;

public class MainAutorIKnjiga {
    public static void main(String[] args) {

        //	U glavnom programu napraviti vise autora sa vise knjiga.


        Autor koeljo = new Autor("Paulo Koeljo");



        Knjiga knjiga = new Knjiga("978-86-525-4","Alhemicar", 2013, koeljo);


        knjiga.print();
        koeljo.print();











    }
}

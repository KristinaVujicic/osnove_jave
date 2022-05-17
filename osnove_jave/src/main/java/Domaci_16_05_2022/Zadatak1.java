package Domaci_16_05_2022;

public class Zadatak1 {
    public static void main(String[] args) {

        //1. Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
        // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        int a = 5;
        int b = 10;
        int c = 12;

        stampajVrednostZa10Vecu(a,b,c);

    }
    static void stampajVrednostZa10Vecu (int a, int b, int c) {
        System.out.println(a + 10);
        System.out.println(b + 10);
        System.out.println(c + 10);
    }

}

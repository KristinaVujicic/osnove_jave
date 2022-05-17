package p16_05_2022;

public class Zadatak3_drugiput {
    public static void main(String[] args) {

        //Napisati metodu koja stampa zvezdicu sa razmakom. U glavnom programu je potrebno odstampati sledecu sliku:
        //*  *  *
        //*  *
        //*

        for(int i=6; i>0; i--) {

            for (int j= 0; j < i ; j++) {
                zvezdica();
            }
            System.out.println(" ");
        }

    }

    static void zvezdica() {
        System.out.print("* ");
    }




}

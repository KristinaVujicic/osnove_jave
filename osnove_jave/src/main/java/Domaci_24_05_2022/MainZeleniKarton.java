package Domaci_24_05_2022;

import java.util.Locale;

public class MainZeleniKarton {

    public static void main(String[] args) {


//    U glavnoj klasi:
//    kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite



        ZeleniKarton zk1 = new ZeleniKarton("Kris Vuj", "st-155", "java",
                "Milan Jovanovic", 10);


        ZeleniKarton zk2 = new ZeleniKarton("Alex Vuj","mm - 125" ,"Matematika", "Steva stevic",
                7);

        ZeleniKarton zk3 = new ZeleniKarton("Miki Milanovic", "ms-123", "Geografija",
                "Jova Joca", 9);

        zk1.print();
        zk2.print();
        zk3.print();





    }
}

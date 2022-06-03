package p02_06_2022_Zadatak3;
import java.util.ArrayList;

public class MainFigura {

    public static void main(String[] args) {
//		3.Zadatak
//
//		Kreirati abstraktnu klasu Figura koja ima
//		abstraktnu metodu povrsina
//		abstraktnu metodu obim
//		metodu koja stampa podatke u formatu:
//		Povrsina je (povrsina)
//		Obim je (obim)
//
//		Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//		stranicu a
//		gettere/settere/konstruktore
//		implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//		implementira metodu obim
//
//		Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//		stranice a i b
//		gettere/settere/konstruktore
//		implementira metodu povrsina
//		implementira metodu obim

        Figura trougao1 = new JednakoStranicniTrougao(5);
        Figura trougao2 = new JednakoStranicniTrougao(4);
        Figura pravougaonik1 = new Pravougaonik(3, 4);
        Figura pravougaonik2 = new Pravougaonik(5, 6);
        Figura pravougaonik3 = new Pravougaonik(7, 8);

        trougao1.printFigura();
        pravougaonik1.printFigura();

//		U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob

        ArrayList<Figura> listaFigura = new ArrayList<Figura>();

        listaFigura.add(trougao1);
        listaFigura.add(trougao2);
        listaFigura.add(pravougaonik1);
        listaFigura.add(pravougaonik2);
        listaFigura.add(pravougaonik3);

        double celiObim = 0;
        double celiPovrsina = 0;

        for (int i = 0; i < 5; i++) {
            celiObim = celiObim + listaFigura.get(i).obim();
        }

        System.out.println("Obimi su: " + celiObim);

        for (int i = 0; i < 5; i++) {
            celiPovrsina = celiPovrsina + listaFigura.get(i).povrsina();
        }

        System.out.println("Povrsine su: " + celiPovrsina);
    }
}

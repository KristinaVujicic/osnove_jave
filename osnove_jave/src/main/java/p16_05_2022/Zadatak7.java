package p16_05_2022;

public class Zadatak7 {
    public static void main(String[] args) {

        //7.Zadatak
        //Napisati metodu koja vraca suprotno negativna broj od prosledjenog. Metoda prima broj N
        // i vraca ga sa negativnom vrednoscu.
        //Primer: Ako se metoda pozove za N=10, vraca -10
        //	Ako se metoda pozove za N=-11, vraca 11

        int n = -6;

        System.out.println("Negativna vrednost je: " + negativnaVrednost(n));
    }

    static int negativnaVrednost (int n) {
        if (n < 0) {
            return n * (-1);
        } else {
            return n;
        }
    }
}

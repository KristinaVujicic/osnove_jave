package Domaci_16_05_2022;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Zadatak4 {
    public static void main(String[] args) {

        //4. Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
        /// / / / /

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        System.out.println("Unesite karakter: ");
        String karakter = s.next();

        stampa(n,karakter);

    }
    static void stampa (int n, String karakter) {

        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");

        }


    }
}

package Domaci_24_05_2022;

public class MainTransakcija {
    public static void main(String[] args) {

        Racun primalac = new Racun("123-345-567", "Pera Peric", 1000);

        Racun posiljalac = new Racun("987-765-555", "Milka Canic", 7200);

        Transakcija transakcija = new Transakcija("1112223377", posiljalac, primalac);

        transakcija.izvrsiTransakciju(1000);
        transakcija.print();
    }
}

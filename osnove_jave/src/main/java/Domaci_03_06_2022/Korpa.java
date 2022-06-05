package Domaci_03_06_2022;

import java.util.ArrayList;

public class Korpa {

//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//*    metodu dodaj ambalazu
//*   metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti


    ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

    public void dodajAmbalazu (Ambalaza ambalaza) {
        nizAmbalaza.add(ambalaza);
    }

    public void izbaciAmbalazu (String unetiBarkod){
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            if (nizAmbalaza.get(i).getBarcode().equals(unetiBarkod)){
                nizAmbalaza.remove(i);
            }
        }
    }


//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//    kao parametar funkcije se prima Super karticu iz koje se cita popust.

    public double cenaCeleKorpe () {
        double  sumaCeleKorpe = 0;

        for (int i = 0; i < nizAmbalaza.size(); i++) {
            sumaCeleKorpe += nizAmbalaza.get(i).cenaArtikla();
        } return sumaCeleKorpe;
    }

    private double cenaSvihAmbalaza (SuperKartica superKartica) {
        double cenaSaPopustom= 0;

        for (int i = 0; i <nizAmbalaza.size() ; i++) {
            cenaSaPopustom += nizAmbalaza.get(i).cenaArtikla() - superKartica.getPopust();

            if (nizAmbalaza.get(i).cenaArtikla() < superKartica.getPopust()) {
                return nizAmbalaza.get(i).cenaArtikla();
            }
        } return cenaSaPopustom;

    }







}

package Domaci_20_05_2022;

public class FacebookPost {

    public String imeKorisnika;
    public String imeProfilnog;
    public String text;
    public int like ;
    public int share;

    public FacebookPost(String imeKorisnika, String imeProfilnog, String text) {
        this.imeKorisnika = imeKorisnika;
        this.imeProfilnog = imeProfilnog;
        this.text = text;
    }

    public void likepost () {
        like ++;
    }

    public void dislikepost () {
        like --;
    }

    public void sharepost () {
        share ++;
    }


    public void print () {
        System.out.println(imeKorisnika + " >>> " + imeProfilnog);
        System.out.println(text);
        System.out.println("Likes " + like +  " | " + "Share " + share);
    }



}

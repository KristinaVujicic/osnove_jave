package Domaci_20_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {


        FacebookPost a = new FacebookPost("Kristina Vujicic", "Sanela Solunac", "Izvini Sanela!");

        a.likepost();
        a.likepost();
        a.sharepost();

        a.print();
        System.out.println();

        a.dislikepost();

        a.print();
        System.out.println();

        a.sharepost();
        a.likepost();
        a.likepost();

        a.print();




    }


}

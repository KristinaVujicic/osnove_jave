package p_18_05_2022;

public class MainSlackMessage {
    public static void main(String[] args) {
        //U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
        //[ime i prezime osobe] - [kad je poslata]
        //[Tekst poruke]

        SlackMessage slack = new SlackMessage();

        slack.textP = "Zdravo, sta ima";
        slack.imeIPrezime = "Kris Vuj";
        slack.date = "18.05.2022 18:22";

        System.out.println(slack.imeIPrezime + " - " + slack.date);
        System.out.println(slack.date);

}
    }

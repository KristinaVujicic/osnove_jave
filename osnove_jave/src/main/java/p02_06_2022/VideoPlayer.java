package p02_06_2022;

public class VideoPlayer {

    //Kreirati klasu VideoPlayer koja ima:
    //duzinu videa
    //trenutno vreme videa
    //jacinu zvuka
    //Kvalitet videa (144, 240, 360, 480, 720, 1080)
    //gettere, settere i konstruktore

    protected int duzinaVidea;
    protected int trenutnoVreme;
    protected int jacinaZvuka;
    protected int kvVidea;

    public VideoPlayer() {

    }

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvVidea = kvVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvVidea() {
        return kvVidea;
    }

    public void setKvVidea(int kvVidea) {
        this.kvVidea = kvVidea;
    }

//	metodu stampaj koja stampa podatke u formatu:
//	trenutno vreme videa
//	jacina zvuka
//	kavlitet videa

    public void stampaj() {
        System.out.println("Trenutno vreme: " + this.trenutnoVreme + "s");
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.kvVidea + "p");
    }


}

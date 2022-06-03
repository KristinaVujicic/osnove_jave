package p02_06_2022;

public class AudioControl extends Control {


///	Kreirati klasu AudioControl koja nasledjuje klasu Control i
//	gettere, settere i konstruktore
//	ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//	implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100

    private boolean smanjiPojacaj;

    public AudioControl(boolean smanjiPojacaj) {
        super();
        this.smanjiPojacaj = smanjiPojacaj;
    }

    public boolean isSmanjiPojacaj() {
        return smanjiPojacaj;
    }

    public void setSmanjiPojacaj(boolean smanjiPojacaj) {
        this.smanjiPojacaj = smanjiPojacaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (smanjiPojacaj && videoPlayer.jacinaZvuka >= 0) {
            videoPlayer.jacinaZvuka = videoPlayer.jacinaZvuka - 1;
        } else if (!smanjiPojacaj && videoPlayer.jacinaZvuka <= 100) {
            videoPlayer.jacinaZvuka = videoPlayer.jacinaZvuka + 1;
        }
    }

}

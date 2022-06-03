package p02_06_2022;

public class TimeControl extends Control {


    //    Kreirati klasu TimeControl koja nasledjuje klasu Control i
    //    konstruktore
    //    ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
    //    implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
    //    unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.

    private boolean levoDesno;

    public TimeControl(boolean levoDesno) {
        super();
        this.levoDesno = levoDesno;
    }

    public boolean isLevoDesno() {
        return levoDesno;
    }

    public void setLevoDesno(boolean levoDesno) {
        this.levoDesno = levoDesno;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (levoDesno && videoPlayer.trenutnoVreme > 0) {
            videoPlayer.trenutnoVreme = videoPlayer.trenutnoVreme - 15;
        } else if (!levoDesno && videoPlayer.trenutnoVreme <= videoPlayer.duzinaVidea) {
            videoPlayer.trenutnoVreme = videoPlayer.trenutnoVreme + 15;
        }
    }





}

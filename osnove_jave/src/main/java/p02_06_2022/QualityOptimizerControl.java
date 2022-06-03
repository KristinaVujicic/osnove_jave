package p02_06_2022;

public class QualityOptimizerControl extends Control {
//	Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//	ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//	gettere, settere i konstruktore
//	implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//	brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//	npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//	npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//	npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    private double brzinaInterneta;

    public QualityOptimizerControl(int brzinaInterneta) {
        super();
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (brzinaInterneta * 10.1 <= 144) {
            videoPlayer.setKvVidea(144);
        } else if (brzinaInterneta * 10.1 > 144 && brzinaInterneta * 10.1 <= 240) {
            videoPlayer.setKvVidea(240);
        } else if (brzinaInterneta * 10.1 > 240 && brzinaInterneta * 10.1 <= 480) {
            videoPlayer.setKvVidea(480);
        } else if (brzinaInterneta * 10.1 > 480 && brzinaInterneta * 10.1 <= 720) {
            videoPlayer.setKvVidea(720);
        } else if (brzinaInterneta * 10.1 > 720 && brzinaInterneta * 10.1 <= 1080) {
            videoPlayer.setKvVidea(1080);
        } else if (brzinaInterneta * 10.1 > 1080) {
            videoPlayer.setKvVidea(2040);
        }
    }

}



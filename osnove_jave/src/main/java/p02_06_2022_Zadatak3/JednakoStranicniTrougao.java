package p02_06_2022_Zadatak3;

public class JednakoStranicniTrougao extends Figura{

    // Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
    //stranicu a
    //gettere/settere/konstruktore
    //implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
    //implementira metodu obim

    private double stranica;

    public JednakoStranicniTrougao() {
        super();
    }

    public JednakoStranicniTrougao(double stranica) {
        super();
        this.stranica = stranica;
    }

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double povrsina() {
        return this.stranica * this.stranica * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return 3 * this.stranica;
    }








}

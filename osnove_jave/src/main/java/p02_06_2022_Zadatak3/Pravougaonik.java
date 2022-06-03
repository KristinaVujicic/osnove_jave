package p02_06_2022_Zadatak3;


public class Pravougaonik extends Figura {

//	Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//	stranice a i b
//	gettere/settere/konstruktore
//	implementira metodu povrsina
//	implementira metodu obim

    private double stranicaA;
    private double stranicaB;

    public Pravougaonik() {
        super();
    }

    public Pravougaonik(double stranicaA, double stranicaB) {
        super();
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return this.stranicaA * this.stranicaB;
    }

    @Override
    public double obim() {
        return 2 * this.stranicaA + 2 * this.stranicaB;
    }
}

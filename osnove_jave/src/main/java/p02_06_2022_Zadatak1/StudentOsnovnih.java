package p02_06_2022_Zadatak1;

public class StudentOsnovnih extends Student {

    //	Kreirati klasu StudentOsnovnih koja nasledjuje klasu
//	Student i koja ima:
//	koja za cenu skolarine vraca 90000
//	za metodu da li je na budzetu vraca true
//	ako je student ispod 5 godine studija

    public StudentOsnovnih() {
        super();
    }

    public StudentOsnovnih(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public double cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean daLiJeStudentNaBudzetu() {
        if (this.godinaStudija < 5) {
            return true;
        }
        return false;
    }
}

package p02_06_2022_Zadatak1;

public class StudentMastera extends Student {

    //	Kreirati klasu StudentMaster koja nasledjuje klasu
//	Student i koja ima:
//	koja za cenu skolarine vraca 100000
//	za metodu da li je na budzetu vraca true ako je student
//	ispod 2 godine studija
//	U glavnoj klasi kreirati studente i testirati funkciolanosti

    public StudentMastera(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public double cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean daLiJeStudentNaBudzetu() {
        if (this.godinaStudija < 2) {
            return true;
        }
        return false;
    }
}

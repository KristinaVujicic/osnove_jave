package p02_06_2022_Zadatak1;

public class Student {

    //	Kreirati klasu Student koja ima:
//	ime i prezime studenta
//	broj indeksa
//	godinu studija
//	gettere, settere i konstruktore
//	metodu koja racuna i vraca cenu skolarine, metoda vraca 0 u ovoj klasi.
//	metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
//	metodu koja stampa podatke u formatu:
//	ime i prezime, broj indeksa, godina studija
//	Finansiranje: budzet/samofinansirajuci
//	Cena skolarine: cena

    protected String imeIPrezime;
    protected int brojIndeksa;
    protected int godinaStudija;

    public Student() {

    }

    public Student(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super();
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
//	metodu koja racuna i vraca cenu skolarine, metoda vraca 0 u ovoj klasi.
//	metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
//	metodu koja stampa podatke u formatu:
//	ime i prezime, broj indeksa, godina studija
//	Finansiranje: budzet/samofinansirajuci
//	Cena skolarine: cena

    public double cenaSkolarine () {
        return 0;
    }

    public boolean daLiJeStudentNaBudzetu () {
        return true;
    }

    public void print () {
        System.out.println(this.getImeIPrezime() + ", " + this.getBrojIndeksa() + ", " + this.getGodinaStudija());
        if (daLiJeStudentNaBudzetu()) {
            System.out.println("Finansiranje: budzet");
        } else {
            System.out.println("Finansiranje: samofinansiranje");
            System.out.println("Cena skolarine: " + cenaSkolarine() + " dinara.");
        }
        System.out.println();
    }
}

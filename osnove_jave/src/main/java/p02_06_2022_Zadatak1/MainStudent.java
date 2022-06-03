package p02_06_2022_Zadatak1;

public class MainStudent {
    public static void main(String[] args) {

//		1.Zadatak
//		Kreirati klasu Student koja ima:
//		ime i prezime studenta
//		broj indeksa
//		godinu studija
//		gettere, settere i konstruktore
//		metodu koja racuna i vraca cenu skolarine, metoda vraca 0 u ovoj klasi.
//		metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
//		metodu koja stampa podatke u formatu:
//		ime i prezime, broj indeksa, godina studija
//		Finansiranje: budzet/samofinansirajuci
//		Cena skolarine: cena
//
//		Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//		koja za cenu skolarine vraca 90000
//		za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//		Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//		koja za cenu skolarine vraca 100000
//		za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//		U glavnoj klasi kreirati studente i testirati funkciolanosti

    StudentOsnovnih student1 = new StudentOsnovnih("Kris Vuj", 1520, 4);
    StudentOsnovnih student2 = new StudentOsnovnih("Sani Sol", 1520, 2);
    StudentMastera student3 = new StudentMastera("Mile Milic", 420, 1);
    StudentMastera student4 = new StudentMastera("David Lilic", 420, 3);

		student1.print();
		student2.print();
		student3.print();
		student4.print();
}

}



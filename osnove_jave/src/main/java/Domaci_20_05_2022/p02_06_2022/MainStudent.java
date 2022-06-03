package p02_06_2022;

public class MainStudent {
    public static void main(String[] args) {


    //Kreirati apstraktnu klasu Student koja ima:
    //ime i prezime studenta
    //broj indeksa
    //godinu studija
    //gettere, settere i konstruktore
    //apstraktnu metodu koja vraca cenu skolarine.
    //apstraktnu metodu koja vraca da li je student na buzetu ili ne.
    //metodu koja stampa podatke u formatu:
    //ime i prezime, broj indeksa, godina studija
    //Finansiranje: budzet/samofinansirajuci
    //Cena skolarine: cena
    //
    //	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
    //koja za cenu skolarine vraca 90000
    //za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
    //
    //Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
    //koja za cenu skolarine vraca 100000
    //za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
    //	U glavnoj klasi kreirati studente i testirati funkciolanosti


        StudentOsnovnih student1 = new StudentOsnovnih("Kris Vuj",
                                                        "1a-222",
                                                        4 );
        StudentOsnovnih student2 = new StudentOsnovnih("Sani Sol", "2b-432", 7);


        StudentMaster master1 = new StudentMaster("Jela Jelic", "w2-654", 1);
        StudentMaster master2 = new StudentMaster("Johnny Depp", "w4-321", 3);


        student1.printStudent();
        student2.printStudent();
        master1.printStudent();
        master2.printStudent();


}
}
package Domaci_30_5_2022;

public class MainIspit {
    public static void main(String[] args) {


        Ispit jedan = new Ispit("Mile Milic", 8, "Matematika");
        Ispit dva = new Ispit("Slavica Jocic", 10, "Srpski");
        Ispit tri = new Ispit("Jelena Jelic", 6 , "Latinksi");
        Ispit cetiri = new Ispit("Jovan Eric", 5, "Engleski");

        Student student1 = new Student("Kris Vuj", "osnovne","1b-155" );


        student1.dodajIspit(jedan);
        student1.dodajIspit(dva);
        student1.dodajIspit(tri);
        student1.dodajIspit(cetiri);
        student1.stampa();

    }

}

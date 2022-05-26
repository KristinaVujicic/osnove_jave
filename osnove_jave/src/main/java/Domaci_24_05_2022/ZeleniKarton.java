package Domaci_24_05_2022;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class ZeleniKarton {

    //Kreirati klasu ZeleniKarton koja ima:
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere
    //konstruktore


    private String student;
    private String brojIndexa;
    private String predmet;
    private String profesor;
    private int ocena;



    public ZeleniKarton (String student, String brojIndexa, String predmet, String profesor, int ocena ){
        this.brojIndexa = brojIndexa;
        this.ocena = ocena;
        this.predmet = predmet;
        this.profesor = profesor;
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime

    public boolean polozenIspit () {
        if (ocena > 5) {
            return true;
        }
        else  {
            return false;
        }
    }

    public void print () {
        System.out.println("(" + predmet + ")" + " - " + "( " + ocena + " )");
        System.out.println("Student: " + student + " , " + brojIndexa);
        System.out.println("Profesor: " + profesor );
    }

}

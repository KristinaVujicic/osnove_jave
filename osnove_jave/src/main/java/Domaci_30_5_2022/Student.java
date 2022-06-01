package Domaci_30_5_2022;

import java.util.ArrayList;

public class Student {


    //Napisati klasu Student koja ima
    //broj indeksa
    //ime i prezime
    //tip studija (osnovne, master, doktorske)
    //niz ispita
    //konstuktore koje mislite da ce vam trebati
    //gettere i settere za indeks, ime i prezime, tip studija
    //getter za niz predmeta
    //metodu dodaj ispit u niz ispita
    //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
    //metodu stampaj koja stampa u formatu:
    //(broj indeksa) - (ime i prezime) - (tip studija)
    //Predmeti:
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //Prosecna ocena: (prosecna ocena)

    private String student;
    private String tipStudija;
    private String brojIndexa;

   git

    public Student () {

    }

    public Student(String student, String tipStudija, String brojIndexa) {
        this.student = student;
        this.tipStudija = tipStudija;
        this.brojIndexa = brojIndexa;
    }

    public void dodajIspit(Ispit predmet){
        ispiti.add(predmet);
    }


    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public double prosekNaStudijama (){
        double prosecnaOcena = 0;
        int brojac = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            prosecnaOcena = (prosecnaOcena + ispiti.get(i).getOcena());
            brojac ++;
        }
        return prosecnaOcena / brojac;
    }

    public void stampa(){
        System.out.println(this.brojIndexa + " - " + this.student + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getPredmet() + " - " +
                    this.ispiti.get(i).getProfesor() + " - " + this.ispiti.get(i).getOcena());

        }
        System.out.println("Prosecna ocena je " + prosekNaStudijama() + ".");
    }

   }

package Domaci_02_06_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {

    //Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
    // override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.


    public Menadzer(String imeIprezime) {
        super(imeIprezime);
    }


    @Override
    public double plataRadnika() {
        double suma = 0;
        for (int i = 0 ; i < nizSektora.size(); i ++ ) {
            suma = suma + nizSektora.get(i).getPlataSektora();
    }
        return suma;
    }

}

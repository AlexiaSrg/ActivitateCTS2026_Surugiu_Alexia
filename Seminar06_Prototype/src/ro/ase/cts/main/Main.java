package src.ro.ase.cts.main;

import src.ro.ase.cts.clase.Rezervare;
import src.ro.ase.cts.clase.RezervarePrototype;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Alexia",20,1,"1111222233334444");
        Rezervare r1= (Rezervare) rezervare.clonare();

        r1.setOra(15);

        System.out.println(rezervare.toString());
        System.out.println(r1.toString());

    }
}

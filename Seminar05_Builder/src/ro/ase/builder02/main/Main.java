package src.ro.ase.builder02.main;

import src.ro.ase.builder01.clase.AbstractBuilder;
import src.ro.ase.builder02.clase.Internare;
import src.ro.ase.builder01.clase.InternareBuilder;
import src.ro.ase.builder02.clase.AbstractBuilder2;
import src.ro.ase.builder02.clase.InternareBuilder02;

public class Main {
    public static void main(String[] args) {

        Internare internare1 = new Internare();
        internare1.setNumePacient("Ana Marin");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Florea Costin");
        internare2.setPatRabatabil(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");
        src.ro.ase.builder01.clase.Internare internare3 = builder.setPatRabatabil(true).build();
        src.ro.ase.builder01.clase.Internare internare4 = builder.setPapuciCamera(true).setNumePacient("Gigel").build();


        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder2 builder2 = new InternareBuilder02();
        builder.setMicDejunInclus(true);
        Internare internare5 = builder2.build("Georgica");
        Internare internare6 = builder2.build("Gigel");

        internare5.setHalatInterior(true);
        System.out.println(internare5.toString());
        System.out.println(internare6.toString());
    }
}
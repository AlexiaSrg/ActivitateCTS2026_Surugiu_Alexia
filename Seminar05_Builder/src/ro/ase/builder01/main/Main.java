package src.ro.ase.builder01.main;

import src.ro.ase.builder01.clase.AbstractBuilder;
import src.ro.ase.builder01.clase.Internare;
import src.ro.ase.builder01.clase.InternareBuilder;


public class Main {
    public static void main(String[]args){

        Internare internare1=new Internare();
        internare1.setNumePacient("Ion Vasilache");
        internare1.setPatRabatabil(true);

        Internare internare2=new Internare();
        internare2.setNumePacient("Ilie");
        internare2.setPatRabatabil(true);

        AbstractBuilder builder=new InternareBuilder("Ilie");
        Internare internare3=builder.setPatRabatabil(true).build();
        Internare internare4=builder.setPapuciCamera(true).setNumePacient("Ion").build();


        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

    }
}

package src.seminar01.main;

import src.seminar01.animal.Lion;
import src.seminar01.animal.Tigru;
import src.seminar01.animal.Zebra;
import src.seminar01.zoo.Zookeeper;
import src.seminar01.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper=new Zookeeper("Ion");
        Lion lion=new Lion("Simba",22,35);
        Zebra zebra=new Zebra("Amalia",11,88);
        Zoo zoo=new Zoo("Gradina zoo",zookeeper);

        zoo.adaugaAnimal(lion);
        zoo.adaugaAnimal(zebra);
        zoo.adaugaAnimal(new Tigru("Tigru",19,"siberian"));
        zoo.feedAllAnimals();
    }
}
package src.seminar01.zoo;

import src.seminar01.animal.Animal;

public class Zookeeper {
    protected String name;

    public void feedAnimal(Animal animal){
        System.out.println("Zookeperul a a hranit: "+animal.toString());
        animal.eat("mancare");
    }

    public Zookeeper(String name) {
        this.name = name;
    }
}

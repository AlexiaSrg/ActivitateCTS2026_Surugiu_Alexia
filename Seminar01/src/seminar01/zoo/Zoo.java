package src.seminar01.zoo;

import src.seminar01.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    protected String name;
    protected List<Animal> listaAnimale;
    Zookeeper zookeeper;

    public void feedAllAnimals(){
        for(Animal animal:listaAnimale){
            zookeeper.feedAnimal(animal);
        }
    }

    public Zoo(String name, Zookeeper zookeeper) {
        this.name = name;
        this.zookeeper = zookeeper;
        this.listaAnimale=new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal){
        listaAnimale.add(animal);
    }
}

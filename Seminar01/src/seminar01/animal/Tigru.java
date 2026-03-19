package src.seminar01.animal;

import src.seminar01.animal.Animal;

public class Tigru extends Animal {
    protected String rasa;

    @Override
    public void eat(String mancare) {
        System.out.println("Tigrul a mancat "+mancare);
    }

    public Tigru(String name, int age, String rasa) {
        super(name, age);
        this.rasa = rasa;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("\nTigrul: ");
        buffer.append(super.toString());
        buffer.append(" rasa: ");
        buffer.append(this.rasa);
        return buffer.toString();
    }
}

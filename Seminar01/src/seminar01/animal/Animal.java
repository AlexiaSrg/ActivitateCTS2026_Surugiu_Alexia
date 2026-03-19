package src.seminar01.animal;

public abstract class Animal {
    protected String name;
    protected int age;

    public abstract void eat(String mancare);

    public String getName() {
        return name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name='" + name + '\'' +
                ", age=" + age ;
    }
}

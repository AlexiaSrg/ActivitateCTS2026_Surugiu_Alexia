package src.seminar01.animal;

public class Lion extends Animal{
    protected int greutate;

    @Override
    public void eat(String mancare) {
        System.out.println("Leul a mancat "+mancare);
    }

    public Lion(String name, int age, int greutate) {
        super(name, age);
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("\nLeu: ");
        buffer.append(super.toString());
        buffer.append(" greutate: ");
        buffer.append(this.greutate);
        return buffer.toString();
    }
}

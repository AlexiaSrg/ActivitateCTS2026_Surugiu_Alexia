package src.seminar01.animal;

public class Zebra extends Animal{
    protected int nrDungi;

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra a mancat "+mancare);
    }

    public Zebra(String name, int age, int nrDungi) {
        super(name, age);
        this.nrDungi = nrDungi;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("\nZebra: ");
        buffer.append(super.toString());
        buffer.append(" nr. dungi: ");
        buffer.append(this.nrDungi);
        return buffer.toString();
    }
}

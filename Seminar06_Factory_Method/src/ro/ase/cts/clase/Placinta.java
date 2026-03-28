package src.ro.ase.cts.clase;

public class Placinta extends Desert{
    public Placinta(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Placinta cu  "+super.denumire+" are "+super.gramaj+" grame si "+super.calorii+" calorii");

    }
}

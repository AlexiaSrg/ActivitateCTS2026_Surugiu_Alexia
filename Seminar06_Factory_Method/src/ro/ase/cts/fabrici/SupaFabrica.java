package src.ro.ase.cts.fabrici;

import src.ro.ase.cts.clase.Ciorba;
import src.ro.ase.cts.clase.FelDeMancare;
import src.ro.ase.cts.clase.Supa;
import src.ro.ase.cts.clase.SupaCrema;

import static src.ro.ase.cts.fabrici.TipSupa.SUPA_CREMA;

public class SupaFabrica implements FelDeMancareFabrica{

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tipFelDeMancare,gramaj,denumire);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj, String denumire) {
        if (tipFelDeMancare.equals(TipSupa.SUPA_CREMA)) {
            return new SupaCrema(gramaj, denumire);
        } else if (tipFelDeMancare.equals(TipSupa.CIORBA)) {
            return new Ciorba(gramaj, denumire);
        }
        return null;

    }
}

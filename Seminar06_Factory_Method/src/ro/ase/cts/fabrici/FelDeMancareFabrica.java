package src.ro.ase.cts.fabrici;

import src.ro.ase.cts.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj,String denumire,int calorii);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tipFelDeMancare, float gramaj,String denumire);

}

package src.ro.ase.cts.clase.simpleFactory;

import src.ro.ase.cts.clase.mijlocTransport.*;

public class Factory {

    public MijlocDeTransport getMijlocTransport(TipMijlocDeTransport tip,String marca,int nrLinii){

        switch (tip) {
            case AUTOBUZ -> {
                return new Autobuz(nrLinii,marca);
            }
            case TRAMVAI -> {
                return new Tramvai(nrLinii,marca);
            }
            case TROLEIBUZ -> {
                return new Troleibuz(nrLinii,marca);
            }
            default-> {
                return null;
            }
        }
    }
}

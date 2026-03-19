package src.ro.ase.builder01.clase;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setHalatInterior(boolean halatInterior);
    AbstractBuilder setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder setPapuciCamera(boolean papuciCamera);
}

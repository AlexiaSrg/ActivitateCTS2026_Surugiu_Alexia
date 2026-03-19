package src.ro.ase.builder02.clase;

public class InternareBuilder02 implements AbstractBuilder2{
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public InternareBuilder02(){
        patRabatabil=false;
        micDejunInclus=false;
        papuciCamera=false;
        halatInterior=false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume,patRabatabil,micDejunInclus,papuciCamera,halatInterior);
    }


    @Override
    public AbstractBuilder2 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil=patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder2 setHalatInterior(boolean halatInterior) {
        this.halatInterior=halatInterior;
        return this;
    }

    @Override
    public AbstractBuilder2 setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus=micDejunInclus;
        return this;
    }

    @Override
    public AbstractBuilder2 setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera=papuciCamera;
        return this;
    }
}

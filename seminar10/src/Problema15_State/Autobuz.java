package Problema15_State;

public class Autobuz {
    private StareAutobuz stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare=new LaCapatDeLinie();
    }

    public StareAutobuz getStare() {
        return stare;
    }

    protected void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa() {
        InCursa stare=new InCursa();
        stare.modificareStare(this);
    }

    public void ajungeLaCapatDeLinie(){
        LaCapatDeLinie laCapatDeLinie=new LaCapatDeLinie();
        laCapatDeLinie.modificareStare(this);
    }
    public void trimiteInService(){
        LaReparat laReparat=new LaReparat();
        laReparat.modificareStare(this);
    }

    public void scoateDinService(){
        LaCapatDeLinie laCapatDeLinie=new LaCapatDeLinie();
        laCapatDeLinie.modificareStare(this);
    }
}

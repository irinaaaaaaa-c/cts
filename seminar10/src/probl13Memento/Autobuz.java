package probl13Memento;

public class Autobuz {
    private String nume;
    private float consum;
    private String model;
    private int anFabricatie;
    private int nrLocuri;



    public Autobuz(){

    }

    public Autobuz(String nume, float consum, String model, int anFabricatie, int nrLocuri) {
        this.nume = nume;
        this.consum = consum;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }



    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "nume='" + nume + '\'' +
                ", consum=" + consum +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }


    public AutobuzMemento genereazaMemento(){
        AutobuzMemento memento=new AutobuzMemento(nume,consum);
        return memento;
    }

    public void revenireLaOStareAnterioara(AutobuzMemento autobuzMemento){
        this.nume=autobuzMemento.getNume();
        this.consum=autobuzMemento.getConsum();

    }

}

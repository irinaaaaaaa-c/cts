package Clase;

import java.util.concurrent.ExecutionException;

public class Autobuz implements NodAbstract{

    private String producator;
    private String model;
    private String nrLocuri;
    @Override
    public void afiseazaDescriere() {

    }

    public Autobuz(String producator, String model, String nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(String nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionException{
        throw new ExecutionException(null);
    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionException {

        throw new ExecutionException(null);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionException {
        throw new ExecutionException(null);

    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", nrLocuri='" + nrLocuri + '\'' +
                '}';
    }
}

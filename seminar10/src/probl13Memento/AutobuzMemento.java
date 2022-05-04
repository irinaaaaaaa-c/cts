package probl13Memento;

public class AutobuzMemento {

    private String nume;
    private float consum;

    public AutobuzMemento(String nume, float consum) {
        this.nume = nume;
        this.consum = consum;
    }

    public String getNume() {
        return nume;
    }


    public float getConsum() {
        return consum;
    }


}

package seminar5;

import factory_method.MijlocTransportComun;

public class Tramvai extends MijlocTransportComun {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai " + super.getNrInmatriculare();
    }
}

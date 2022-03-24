package seminar5;

import factory_method.MijlocTransportComun;

public class Autobuz extends MijlocTransportComun {
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz " + super.getNrInmatriculare();
    }
}

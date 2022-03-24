package seminar5;

import factory_method.MijlocTransportComun;

public class Troleibuz extends MijlocTransportComun {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Troleibuz " + super.getNrInmatriculare();
    }
}

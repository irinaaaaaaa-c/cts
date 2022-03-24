package seminar5;

public abstract class MijlocTransportComun {
    private String nrInmatriculare;

    public MijlocTransportComun(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }
}

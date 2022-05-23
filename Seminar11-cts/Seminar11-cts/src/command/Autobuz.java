package command;

public class Autobuz {

    private String nume;
    private boolean pleacaPeTraseu;

    public void pleacaPeTraseu(int nrLinie) {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pleacaPeTraseu=").append(pleacaPeTraseu);
        sb.append('}');
        return sb.toString();
    }

    public Autobuz(String nume) {
        this.nume = nume;
    }
}

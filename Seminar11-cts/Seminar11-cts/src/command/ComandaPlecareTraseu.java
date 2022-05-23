package command;

public class ComandaPlecareTraseu implements Comanda{

    private int nrLinie;
    private Autobuz autobuz;



    public ComandaPlecareTraseu(int nrLinie, Autobuz autobuz) {
        super();
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }



    public int getNrLinie() {
        return nrLinie;
    }



    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }



    public Autobuz getAutobuz() {
        return autobuz;
    }



    public void setAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }



    @Override
    public void executa() {
        autobuz.pleacaPeTraseu(nrLinie);
    }
}

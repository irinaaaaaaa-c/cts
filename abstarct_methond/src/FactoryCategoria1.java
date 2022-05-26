public class FactoryCategoria1 implements Factory{

    @Override
    public PachetCazare createPachetCazare() {
        return new CazareCategorie1();
    }

    @Override
    public PachetTransport createPachetTrasnport() {
        return new TransportCateg1();
    }
}

public class Main {


    public static void main(String[] args) {
        Factory fabricaAgentie=new FactoryCategoria1();
        PachetCazare cazare=fabricaAgentie.createPachetCazare();
        cazare.descriere();
    }
}

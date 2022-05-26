package composite;

public class Item implements Optiune{

    private String nume;
    public Item(String nume){
        this.nume=nume;
    }
    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        throw new Exception("Nu e implementat");

    }

    @Override
    public String toString() {
        return "Item{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        throw new Exception("Nu e implementat");

    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Nu e implementat");
    }

    @Override
    public void descriere() {

        System.out.println("item"+nume);
    }
}

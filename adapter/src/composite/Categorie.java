package composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{
    List<Optiune>list;
    String nume;

    public Categorie( String nume) {
        this.list = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        list.remove(optiune);
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        list.add(optiune);

    }

    @Override
    public Optiune getNod(int index) throws Exception {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "list=" + list +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public void descriere() {

        System.out.println("Categorie"+nume);
        for(Optiune optiune:list){
            optiune.descriere();
        }
    }
}

package Clase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Grup implements NodAbstract {
    private List<NodAbstract> list=new ArrayList<>();
    private String denumire;

    public Grup(List<NodAbstract> list, String denumire) {
        this.list = list;
        this.denumire = denumire;
    }

    public Grup(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("denumirea grupului este"+this.denumire);
        for(NodAbstract i : list){
            i.afiseazaDescriere();
        }
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionException {
        return list.get(poz);
    }




    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionException {

        list.add(nodAbstract);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionException {

        list.remove(nodAbstract);
    }
}

package probl13Memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {

    List<AutobuzMemento> lista;

    public ManagerAutobuz(List<AutobuzMemento> lista) {
        this.lista = lista;
    }

    public ManagerAutobuz() {
        this.lista=new ArrayList<>();
    }

    public void adaugaMemento(AutobuzMemento memento){
        lista.add(memento);
    }

    public AutobuzMemento getmemento(Integer index){
        return lista.get(index);
    }
}

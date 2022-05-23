package command;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    private List<Comanda> listaComenzi;

    public Operator() {
        super();
        this.listaComenzi = new ArrayList<>();
    }

    public void addComanda(Comanda comanda) {
        listaComenzi.add(comanda);
    }

    public void executaComanda() {
        if(listaComenzi.size()>0)
        {
            listaComenzi.remove(0).executa();
        }
    }

}

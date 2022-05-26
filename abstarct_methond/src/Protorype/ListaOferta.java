package Protorype;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferta implements IListaOferte{

    private List<String> oferte;

    public void setOferte(List<String> oferte) {
        this.oferte = oferte;
    }

    public ListaOferta() {
        this.oferte=new ArrayList<>();
    }

    @Override
    public IListaOferte copiaza() {
        ListaOferta listaOferte=new ListaOferta();
        List<String> listaTemporara=new ArrayList<String>();
        for(String oferta:this.oferte){
            listaTemporara.add(oferta);
        }
        listaOferte.setOferte(listaTemporara);

        return listaOferte;
    }

    @Override
    public void incarcareListaOferte() {
        try {
            BufferedReader reader=new BufferedReader(new FileReader("oferte"));
            String oferta=null;
            while((oferta=reader.readLine())!=null) {
                oferte.add(oferta);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "ListaOferta{" +
                "oferte=" + oferte +
                '}';
    }
}

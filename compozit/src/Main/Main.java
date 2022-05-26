package Main;

import Clase.Autobuz;
import Clase.Grup;
import Clase.NodAbstract;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        NodAbstract a1=new Autobuz("Dacia","Duster","5");
        NodAbstract a2=new Autobuz("BMW","X6","5");
        NodAbstract a3=new Autobuz("Audi","Q6","5");
        NodAbstract grupMic=new Grup("autobuze mici");
        NodAbstract grupMare=new Grup("autobuze mari");
        NodAbstract flota=new Grup("flota");

        try {
            grupMic.add(a1);
            grupMic.add(a2);
            grupMare.add(a3);
            flota.add(grupMare);
            flota.afiseazaDescriere();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}

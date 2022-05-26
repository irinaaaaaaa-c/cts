package Clase;

import java.util.concurrent.ExecutionException;

public interface NodAbstract {
    void afiseazaDescriere();
    NodAbstract get(int poz) throws ExecutionException;


    void add(NodAbstract nodAbstract) throws ExecutionException;
    void remove(NodAbstract nodAbstract) throws ExecutionException;
}

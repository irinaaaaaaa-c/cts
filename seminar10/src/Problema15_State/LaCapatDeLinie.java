package Problema15_State;

public class LaCapatDeLinie implements StareAutobuz{
    @Override
    public void modificareStare(Autobuz autobuz) {
        if(!(autobuz.getStare() instanceof LaCapatDeLinie)){
            autobuz.setStare(this);
            System.out.println("autobuz"+autobuz.getNrAutobuz()+"aajauns lacapat de lnine");

        }else{
            System.out.println("Autobuz"+autobuz.getNrAutobuz()+" este deja la capat de linie");}

    }
    }


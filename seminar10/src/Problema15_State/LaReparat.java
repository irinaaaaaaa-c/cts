package Problema15_State;

public class LaReparat implements StareAutobuz{
    @Override
    public void modificareStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie)
        {autobuz.setStare(this);
            System.out.println("autobuz"+autobuz.getNrAutobuz()+" este La reparat");
    }else {
            System.out.println("Autobuz"+autobuz.getNrAutobuz()+" nu e la capat de linie");
        }
    }
}

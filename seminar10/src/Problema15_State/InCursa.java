package Problema15_State;

public class InCursa implements StareAutobuz{
    @Override
    public void modificareStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            autobuz.setStare(this);
        System.out.println("Autobuz"+autobuz.getNrAutobuz()+" a pornit In cursa");
    }
    else {
            System.out.println("Autobuz"+autobuz.getNrAutobuz()+" nu a pornit In cursa");}
    }
}

package Clase;

public class Facade {
    Autobuz autobuz;
    public Facade(){
        autobuz=new Autobuz();
    }
    public void deschideUsi(){
        autobuz.deschideUsaSpate();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaFata();
    }
    public void liberUsi(){
        autobuz.liberUsaMijloc();
        autobuz.liberUsaFata();
        autobuz.liberUsaSpate();
    }
}

package probl13Memento;

public class Main {
    public static void main(String[] args) {
        //vom avea o clasa originala Autobuz
        //va fi memento pentru ca ultierior o salvam in memorie


        Autobuz autobuz=new Autobuz("Aurel",9,"motocar",2011,3);
        ManagerAutobuz managerAutobuz=new ManagerAutobuz();

        managerAutobuz.adaugaMemento(autobuz.genereazaMemento());


        autobuz.setNume("Viorel");
        System.out.println(autobuz.toString());
        managerAutobuz.adaugaMemento(autobuz.genereazaMemento());
        autobuz.setConsum(7);
        managerAutobuz.adaugaMemento(autobuz.genereazaMemento());
        System.out.println(autobuz.toString());
        autobuz.revenireLaOStareAnterioara(managerAutobuz.getmemento(0));
        System.out.println(autobuz.toString());
    }
}

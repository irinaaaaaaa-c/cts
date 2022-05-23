package command;

public class Main {

    public static void main(String[] args) {
        Autobuz a1=new Autobuz("B22AAA");
        Autobuz a2=new Autobuz("B22BBB");
        Autobuz a3=new Autobuz("B22CCC");


        Operator operator=new Operator();
        operator.addComanda(new ComandaPlecareTraseu(168, a1));
        operator.addComanda(new ComandaPlecareTraseu(331, a2));
        operator.addComanda(new ComandaPlecareTraseu(335, a3));
        operator.addComanda(new ComandaPlecareTraseu(768, a1));

        operator.executaComanda();
        operator.executaComanda();
    }
}

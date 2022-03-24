package seminar5;

import factory_method.MijlocTransportComun;

public class Main {
    public static void main(String[] args) {
        MijlocTransportComun mijloc1=Factory.creareMijlocTransport(TipMijlocTransport.Autobuz,"123");
        MijlocTransportComun mijloc2=Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz,"125");
        MijlocTransportComun mijloc3=Factory.creareMijlocTransport(TipMijlocTransport.Tramvai,"128");


        System.out.println(mijloc1);
        System.out.println(mijloc2);
        System.out.println(mijloc3);

    }
}

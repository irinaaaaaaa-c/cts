package seminar5;

import factory_method.Autobuz;
import factory_method.MijlocTransportComun;
import factory_method.Tramvai;
import factory_method.Troleibuz;

public class Factory {
    public static MijlocTransportComun creareMijlocTransport(TipMijlocTransport tip, String nrInmatriculare){
        switch (tip){
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }

    }



}

package MAin;

import Clase.Autobuz;
import Clase.AutobuzBuilder;
import Clase.AutobuzBuilderV2;

public class main {
    public static void main(String[] args) {

        Autobuz autobuz;
        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();

       autobuz= autobuzBuilder.build();
        System.out.println(autobuz);

        Autobuz autobuz1;
        autobuz1=autobuzBuilder.setNumesofer("Vasile").build();
        System.out.println(autobuz1);

        Autobuz autobuz2;
        autobuz2=autobuzBuilder.setModel("BMW").setNew(true).build();
        System.out.println(autobuz2);

        //stergem public la setteri din Autobuz
//        autobuz.setNumarLinie(666);
//        System.out.println(autobuz);

        //setam toate autobuzele sa afiseze la fel
        System.out.println("Noile autobuze");
        AutobuzBuilderV2 builderV2=new AutobuzBuilderV2();
        Autobuz a1=builderV2.setStop(true).setOpenDoors(true).setText("la multi ani").build();
        Autobuz a2=builderV2.setNumesofer("Viorel").build();
        Autobuz a3=builderV2.build();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);



    }
}

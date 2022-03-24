package seminar5;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        SoferAutobuz sofer1=SoferAutobuz.getInstance("Nume1");
        SoferAutobuz sofer2=SoferAutobuz.getInstance("NUme2");


        System.out.println(sofer1.getNume());
        System.out.println(sofer2.getNume());

    }




}

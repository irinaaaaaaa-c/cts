package lazyinitialization;

public class agentie {

    private String nume;

    private static agentie instanta=null;

    private agentie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static agentie getInstanta(String nume) {

        if(instanta==null){
            instanta=new agentie(nume);
        }
        return instanta;
    }
}

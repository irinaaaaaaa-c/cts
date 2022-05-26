package blockintialization;


import v1_eagerinitialization.AgentieEager;

public class Agentie2 {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private Agentie2(){
        this.numeAgentie="aa";
        this.numarAngajati=1;
        this.capital=2;
    }

    private static Agentie2 instanta;
    static {

        try {
            instanta = new Agentie2();
        }catch (Exception exception){
            System.out.println("clasa nu poate fi intializata");
        }
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static Agentie2 getInstanta() {
        return instanta;
    }

    public static void setInstanta(Agentie2 instanta) {
        Agentie2.instanta = instanta;
    }

    public static Agentie2 getInstance(String numeAgentie,float capital, int numarAngajati){
        return instanta;
    }
}

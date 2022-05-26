package v1_eagerinitialization;

public class AgentieEager {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static final AgentieEager intanta=new AgentieEager();

    private AgentieEager(){
        this.numarAngajati=2;
        this.capital=1000;
        this.numeAgentie="Ana agentie";
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

    public static AgentieEager getInstance(String nume, float capital,int numarAngajati){
        return intanta;
    }

    @Override
    public String toString() {
        return "AgentieEager{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}

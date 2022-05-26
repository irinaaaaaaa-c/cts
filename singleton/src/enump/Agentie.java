package enump;

public enum Agentie {
    instanta;

    private String numeAgentie;


    private Agentie(){
        this.numeAgentie="aa";
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }
}

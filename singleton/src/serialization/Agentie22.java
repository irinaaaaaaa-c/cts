package serialization;


import java.io.Serializable;

public class Agentie22 implements Serializable {
    private String numeAgentie;
    private int nragenti;

    private static final long serialVersionUID=1l;

    private static Agentie22 instanta=null;

    public static Agentie22 getInstance(String numeAgentie,int nragenti){
        if(instanta==null){
                     instanta=new Agentie22(numeAgentie,nragenti);
        }

            return instanta;

    }

    private Agentie22(String numeAgentie,int nragenti){
        this.numeAgentie=numeAgentie;
        this.nragenti=nragenti;
    }

    protected Object readResolve(){
        return getInstance("nu",0);
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public int getNragenti() {
        return nragenti;
    }
}

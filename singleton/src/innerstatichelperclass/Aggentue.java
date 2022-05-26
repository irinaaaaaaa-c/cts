package innerstatichelperclass;

public class Aggentue {
    private String numeAgentie;

    private static class Helper{
        private static final Aggentue instanta=new Aggentue();
    }

    public static Aggentue getInstance(String numeAgentie){
        return  Helper.instanta;
    }

    private Aggentue(){
        this.numeAgentie="Boo";
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }
}

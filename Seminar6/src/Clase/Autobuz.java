package Clase;

public class Autobuz {
    private String model ;
    private String numesofer;
    private String nrInmatriculare;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private int NumarLinie;
    private Boolean isNew;

    public Autobuz(String model, String numesofer, String nrInmatriculare, Boolean stop, Boolean openDoors, String text, int numarLinie, Boolean isNew) {
        this.model = model;
        this.numesofer = numesofer;
        this.nrInmatriculare = nrInmatriculare;
        this.stop = stop;
        this.openDoors = openDoors;
        this.text = text;
        NumarLinie = numarLinie;
        this.isNew = isNew;
    }

    public Autobuz(){

        model="Mercedes";
        numesofer="ana";
        nrInmatriculare="b555stb";
        stop=true;
        openDoors=true;
        text="aaaa";
        NumarLinie=555;
        isNew=false;
    }




     void setModel(String model) {
        this.model = model;
    }

     void setNumesofer(String numesofer) {
        this.numesofer = numesofer;
    }

     void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

     void setStop(Boolean stop) {
        this.stop = stop;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setText(String text) {
        this.text = text;
    }

     void setNumarLinie(int numarLinie) {
        NumarLinie = numarLinie;
    }

     void setNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", numesofer='" + numesofer + '\'' +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                ", stop=" + stop +
                ", openDoors=" + openDoors +
                ", text='" + text + '\'' +
                ", NumarLinie=" + NumarLinie +
                ", isNew=" + isNew +
                '}';
    }
}

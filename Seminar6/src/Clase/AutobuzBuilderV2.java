package Clase;

public class AutobuzBuilderV2 implements Builder {

    private String model ;
    private String numesofer;
    private String nrInmatriculare;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private int NumarLinie;
    private Boolean isNew;


    public AutobuzBuilderV2(){
        model="Mercedes";
        numesofer="ana";
        nrInmatriculare="b555stb";
        stop=true;
        openDoors=true;
        text="aaaa";
        NumarLinie=555;
        isNew=false;
    }
    @Override
    public Autobuz build() {
        return new Autobuz(model,numesofer,nrInmatriculare,stop,openDoors,text,NumarLinie,isNew);
    }

    public AutobuzBuilderV2 setModel(String model) {
        this.model = model;
        return  this;
    }

    public AutobuzBuilderV2 setNumesofer(String numesofer) {
        this.numesofer = numesofer;
        return  this;

    }

    public AutobuzBuilderV2 setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return  this;

    }

    public AutobuzBuilderV2 setStop(Boolean stop) {
        this.stop = stop;
        return  this;

    }

    public AutobuzBuilderV2 setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
        return  this;

    }

    public AutobuzBuilderV2 setText(String text) {
        this.text = text;
        return  this;

    }

    public AutobuzBuilderV2 setNumarLinie(int numarLinie) {
        NumarLinie = numarLinie;
        return  this;

    }

    public AutobuzBuilderV2 setNew(Boolean aNew) {
        isNew = aNew;
        return  this;

    }
}

package testare.clase;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {

   public String valoareReturnataDeSex;
    public int  valoareReturnataDeVarsta;
    public boolean  valoareReturnataDeCheckCNP;



    public boolean isCheckCNP() {
        return valoareReturnataDeCheckCNP;
    }

    public void setCheckCNP(boolean checkCNP) {
        this.valoareReturnataDeCheckCNP = checkCNP;
    }

    public void setSex(String sex) {
        this.valoareReturnataDeSex = sex;
    }

    public void setVarsta(int varsta) {
        this.valoareReturnataDeVarsta = varsta;
    }

    @Override
    public String getSex() {

        return this.valoareReturnataDeSex;
    }

    @Override
    public int getVarsta() {

        return this.valoareReturnataDeVarsta;
    }

    @Override
    public boolean checkCNP() {
        // TODO Auto-generated method stub
        return false;
    }

}

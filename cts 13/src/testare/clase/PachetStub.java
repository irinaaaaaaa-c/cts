package testare.clase;

import clase.IPachet;

public class PachetStub implements IPachet {
    @Override
    public boolean poateRezerva() {

        return false;
    }
    @Override
    public void aplicaDiscountVarstnici(int procent) {


    }

    @Override
    public Double getPret() {

        return (double) 1000;
    }
}

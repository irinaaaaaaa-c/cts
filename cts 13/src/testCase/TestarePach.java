package testCase;

import clase.PachetTuristic;
import org.junit.Test;
import testare.clase.PersoanaFake;

import static org.junit.Assert.*;


public class TestarePach {
    @Test
    public void testPoateRezerva() {
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(20);

        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testBoundary() {
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(18);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",1000.0);

        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testDiscountFake() {
        PersoanaFake persoana=new PersoanaFake();
        persoana.setVarsta(75);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"destinatie",200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(180.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    public void testNuAplicaDiscount() {
        PersoanaFake persoana=new PersoanaFake();
        persoana.setVarsta(35);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"destinatie",200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(200.0,pachetTuristic.getPret(),0.01);
    }


    @Test
    public void discountBoundary() {
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);


        assertEquals(180.0,pachetTuristic.getPret(),0.01);
    }


    @Test
    public void discountProcentBoundary() {
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",200.0);
        pachetTuristic.aplicaDiscountVarstnici(100);


        assertEquals(0,pachetTuristic.getPret(),0.01);
    }
}

package testare.test;

import clase.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.ITesteCuFake;
import testare.categorii.TesteCuStub;
import testare.clase.PersoanaFake;
import testare.clase.PersoanaStub;

import static org.junit.Assert.assertTrue;

public class PachetTuristicTest {

    @Test
    @Category(TesteCuStub.class)
    public void testRezerva(){
        PersoanaStub persoanaStub=new PersoanaStub();

        PachetTuristic pachetTuristic=new PachetTuristic(persoanaStub,"destinatie",1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(ITesteCuFake.class)

    public void testNuRezerva(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(18);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",1000.0);
        assertTrue(pachetTuristic.poateRezerva());    }
}

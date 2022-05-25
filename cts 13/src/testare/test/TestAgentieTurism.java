package testare.test;

import clase.AgentieTurism;
import clase.IPachet;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.ITesteCuFake;
import testare.categorii.TesteCuDummy;
import testare.clase.PachetDummy;
import testare.clase.PachetFake;
import testare.clase.PachetStub;

import static org.junit.Assert.assertEquals;

public class TestAgentieTurism {


        @Test
        @Category(TesteCuDummy.class)
        public void testAdaugaPachet() {
            AgentieTurism agentie = new AgentieTurism();
            IPachet pachet = new PachetDummy();
            agentie.adaugaPachet(pachet);
            assertEquals(1, agentie.getNumarPacheteTuristice());

        }

        @Test
        @Category(ITesteCuFake.class)

        public void testCalculeazaSumaTotala() {
            AgentieTurism agentieTurism=new AgentieTurism();
            agentieTurism.adaugaPachet(new PachetStub());
            agentieTurism.adaugaPachet(new PachetStub());

            assertEquals(2000,agentieTurism.calculareSumaTotalaPachete(),0.01);
        }


}

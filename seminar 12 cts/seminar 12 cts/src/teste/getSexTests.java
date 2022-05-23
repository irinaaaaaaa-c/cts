package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class getSexTests {
    @Test
    public void getSexTest() {
        Persoana persoana=new Persoana("Antonio","1923434324233");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void bounderyGetSex() {
        Persoana persoana1=new Persoana("Antonio","39145453344333");
        Persoana persoana2=new Persoana("Antonio","62145453344333");
        assertEquals("M", persoana1.getSex());
        assertEquals("F", persoana2.getSex());
    }

    @Test
    public void crossCheckGetSex() {
        Persoana persoana1=new Persoana("Antonio","39145453344333");
        assertEquals(persoana1.CNP.charAt(0)%2==1?"M":"F",persoana1.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorCheckGetSex() {
        Persoana persoana1=new Persoana("Antonio","09145453344333");
        persoana1.getSex();
    }

    @Test(timeout = 100)
    public void performanceTest() {
        Persoana persoana1=new Persoana("Antonio","19145453344333");
        persoana1.getSex();
    }

    @Test
    public void formatTest() {
        Persoana persoana1=new Persoana("Antonio","19145453344333");
        Persoana persoana2=new Persoana("Antonio","29145453344333");
        assertEquals("M",persoana1.getSex());
        assertEquals("F",persoana2.getSex());
    }

    @Test
    public void outOfRangeTest() {
        Persoana persoana1=new Persoana("Antonio","79145453344333");
        assertEquals("N/A", persoana1.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void existanceGetSex() {
        Persoana persoana1=new Persoana("Antonio",null);
        persoana1.getSex();
    }
}

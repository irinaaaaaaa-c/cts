package teste;


import static org.junit.Assert.*;

import org.junit.Test;

import clase.Persoana;
import exceptii.ExceptieCNPGresit;
public class getVarstaTests {

    @Test
    public void getVarstaTest() {
        Persoana persoana1=new Persoana("Andrei","5000328030013");
        assertEquals(22, persoana1.getVarsta());
    }

    @Test
    public void boundaryGetVarsta() {
        Persoana persoana2=new Persoana("Ana","6220202222324");
        assertEquals(0, persoana2.getVarsta());
    }

    @Test
    public void boundary2GetVarsta() {
        Persoana persoana1=new Persoana("Ana","3000202222324");
        assertEquals(222, persoana1.getVarsta());
    }

    @Test(expected=ExceptieCNPGresit.class)
    public void errorGetVarsta() {
        Persoana persoana1=new Persoana("Ana","62500202222324");
        persoana1.getVarsta();
    }

    @Test(expected=NumberFormatException.class)
    public void errorAlfanumericGetVarsta() {
        Persoana persoana1=new Persoana("Ana","6AA00202222324");
        persoana1.getVarsta();
    }

    @Test(timeout=100)
    public void performanceGetVarsta(){
        Persoana persoana1=new Persoana("Ana","3030202222324");
        persoana1.getVarsta();
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void errorIncompleteCNPGetVarsta() {
        Persoana persoana1=new Persoana("Ana","303");
        persoana1.getVarsta();
    }

    @Test
    public void orderGetVarsta() {
        Persoana persoana1=new Persoana("Ana","1980202222324");
        Persoana persoana2=new Persoana("Ion","5000202222324");
        assertTrue(persoana1.getVarsta()>persoana2.getVarsta());
    }

    @Test(expected=NullPointerException.class)
    public void existanceGetVarsta() {
        Persoana persoana1=new Persoana("Ana",null);
        persoana1.getVarsta();
    }


}

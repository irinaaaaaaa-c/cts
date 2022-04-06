package Clase;

public class ValidatorMetrou implements ValidatorSubteran{
    @Override
    public void valideazaCalatorie() {
        System.out.println("a fost validata calatoria cu metroul ");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("a fost validata abonnamentul pentru calatoria cu metroul ");

    }
}

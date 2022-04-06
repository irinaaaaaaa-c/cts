package Clase;

public class ValidatorAutobuz implements ValidatorTerestru{
    @Override
    public void valideazaBilet() {
        System.out.println("a fost validat biletul pentru autobuz");
    }

    @Override
    public void valideazaAbonament() {

        System.out.println("a fot validat abonamentul ");
    }
}

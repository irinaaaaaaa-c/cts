package Clase;

public class AdaptorDeClase extends ValidatorMetrou implements ValidatorTerestru{
    @Override
    public void valideazaBilet() {
       super.valideazaCalatorie();
    }
}
